package com.example.demo.service;

import com.example.demo.dto.requestDto.FollowingRequestDto;
import com.example.demo.dto.responseDto.DoFollowingResponseDto;
import com.example.demo.entity.Follow;
import com.example.demo.repository.FollowRepository;
import com.example.demo.repository.MemberRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mock.web.MockHttpServletRequest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class FollowServiceTest {
    @Mock
    FollowRepository followRepository;

    @Mock
    MemberRepository memberRepository;

    MockHttpServletRequest httpServletRequest;

    FollowingRequestDto followingRequestDto= FollowingRequestDto.builder()
            .followingSubjectId(1L)
            .sendFollowingUserId(1L)
            .build();

    FollowService followService= new FollowService(memberRepository, followRepository);

//    @Test
//    void doFollowingOthers() {
//        List<Follow> follows= new ArrayList<>();
//        var responseDto= DoFollowingResponseDto.builder()
//                .followList(follows)
//                .msg("Success Following")
//                .size(follows.size())
//                .build();
//        var result= followService.doFollowingOthers(followingRequestDto, httpServletRequest);
//
//
//        ObjectMapper objectMapper= new ObjectMapper();
//        String json= "";
//
//        try {
//            json= objectMapper.writeValueAsString(result.getData());
//        }catch (Exception e){
//            System.out.println(e);
//        }
//
//        assertEquals(responseDto, result.getData());
//    }

    @Test
    void doUnfollowingOthers() {
        var result= followService.doUnfollowingOthers(followingRequestDto,httpServletRequest);

        ObjectMapper objectMapper= new ObjectMapper();
        String json= "";
        try {
            json= objectMapper.writeValueAsString(result);
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println(json);
    }
}