package com.memberdemo.controller;

import com.memberdemo.dto.MemberRequest;
import com.memberdemo.dto.MemberResponse;
import com.memberdemo.service.MemberService;
import com.memberdemo.service.S3Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;
    private final S3Service s3Service;

    @PostMapping
    public ResponseEntity<MemberResponse> createMember(@RequestBody MemberRequest request) {
        log.info("[API - LOG] 팀원 정보 저장 요청 - Name: {}", request.getName());
        MemberResponse response = memberService.createMember(request);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MemberResponse> getMember(@PathVariable Long id) {
        log.info("[API - LOG] 팀원 정보 조회 요청 - ID: {}", id);
        MemberResponse response = memberService.getMember(id);
        return ResponseEntity.ok(response);
    }

    // 💡 [LV3 필수 1] 프로필 이미지 업로드 API
    // POST /api/members/{id}/profile-image
    @PostMapping("/{id}/profile-image")
    public ResponseEntity<Map<String, String>> uploadProfileImage(
            @PathVariable Long id,
            @RequestParam("file") MultipartFile file) throws IOException {

        log.info("[API - LOG] 프로필 이미지 업로드 요청 - ID: {}", id);

        // 1. S3 버킷에 이미지 업로드
        String fileKey = s3Service.uploadFile(file);

        // 2. DB 회원 정보에 profileImageKey 업데이트
        memberService.updateProfileImage(id, fileKey);

        Map<String, String> response = new HashMap<>();
        response.put("message", "프로필 이미지가 성공적으로 업로드되었습니다.");
        response.put("fileKey", fileKey);

        return ResponseEntity.ok(response);
    }

    // Presigned URL 조회 API (유효기간 7일)
    @GetMapping("/{id}/profile-image")
    public ResponseEntity<Map<String, String>> getProfileImagePresignedUrl(@PathVariable Long id) {

        log.info("[API - LOG] Presigned URL 발급 요청 - ID: {}", id);

        // 1. DB에서 회원의 profileImageKey 조회
        String fileKey = memberService.getProfileImageKey(id);

        // 2. S3 7일 유효기간 Presigned URL 생성
        String presignedUrl = s3Service.createPresignedUrl(fileKey);

        Map<String, String> response = new HashMap<>();
        response.put("presignedUrl", presignedUrl);
        response.put("유효기간", "7일");

        return ResponseEntity.ok(response);
    }
}