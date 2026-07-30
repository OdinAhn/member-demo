package com.memberdemo.dto;

import com.memberdemo.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MemberResponse {
    private Long id;
    private String name;
    private Integer age;
    private String mbti;

    public static MemberResponse from(Member member) {
        return new MemberResponse(
                member.getId(),
                member.getName(),
                member.getAge(),
                member.getMbti()
        );
    }
}