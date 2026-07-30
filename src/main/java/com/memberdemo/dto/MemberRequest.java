package com.memberdemo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberRequest {
    private String name;
    private Integer age;
    private String mbti;
}