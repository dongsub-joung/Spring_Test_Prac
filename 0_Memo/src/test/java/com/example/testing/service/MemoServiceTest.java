package com.example.testing.service;

import com.example.testing.dto.reponseDto.ResponseDto;
import com.example.testing.dto.requestDto.MemoRequestDto;
import com.example.testing.entity.Member;
import com.example.testing.entity.Memo;
import com.example.testing.jwt.JwtTokenProvider;
import com.example.testing.repository.MemberRepository;
import com.example.testing.repository.MemoRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mock.web.MockHttpServletRequest;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MemoServiceTest {
    @Mock
    MemberRepository memberRepository;
    @Mock
    MemoRepository memoRepository;
    @Mock
    JwtTokenProvider jwtTokenProvider;

    MemoService memoService= new MemoService(memoRepository, memberRepository, jwtTokenProvider);

    MockHttpServletRequest mockHttpServletRequest;

    @Test
    void createMemo(@Mock Member member) {
        MemoRequestDto memoRequestDto= new MemoRequestDto(0L,"roomname", "content", "category");
        var result=  memoService.createMemo(memoRequestDto, mockHttpServletRequest);

        assertEquals(ResponseDto.success("메모 생성 저장 완료").getSuccess(), result.getSuccess());
    }
}