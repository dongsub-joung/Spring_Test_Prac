package com.example.demo.dto.requestDto;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class FollowingRequestDto {
//    private Member member;
    private Long followingSubjectId;
    private Long sendFollowingUserId;
}
