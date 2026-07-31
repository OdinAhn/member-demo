package com.memberdemo.service;


import com.memberdemo.domain.Member;
import com.memberdemo.dto.MemberRequest;
import com.memberdemo.dto.MemberResponse;
import com.memberdemo.exception.MemberNotFoundException;
import com.memberdemo.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public MemberResponse createMember(MemberRequest request) {
        Member member = new Member(request.getName(), request.getAge(), request.getMbti());
        Member savedMember = memberRepository.save(member);
        return MemberResponse.from(savedMember);
    }

    public MemberResponse getMember(Long id) {
        Member member = memberRepository.findById(id)
                .orElseThrow(() -> new MemberNotFoundException("해당 ID의 팀원을 찾을 수 없습니다: " + id));
        return MemberResponse.from(member);
    }

    @Transactional
    public void updateProfileImage(Long id, String fileKey) {
        Member member = memberRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 회원입니다. ID: " + id));

        // Member 엔티티의 profileImageKey 필드 업데이트
        member.updateProfileImageKey(fileKey);
    }

    @Transactional(readOnly = true)
    public String getProfileImageKey(Long id) {
        Member member = memberRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 회원입니다. ID: " + id));

        return member.getProfileImageKey();
    }
}