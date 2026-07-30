package com.memberdemo.controller;

import com.memberdemo.dto.MemberRequest;
import com.memberdemo.dto.MemberResponse;
import com.memberdemo.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

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
}