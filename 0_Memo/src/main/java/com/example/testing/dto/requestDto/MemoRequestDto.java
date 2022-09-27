package com.example.testing.dto.requestDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Builder
public class MemoRequestDto {
    private Long id;
    private String roomName;
    private String content;
    private String category;

    public MemoRequestDto(Long id, String roomName, String content, String category) {
        this.id = id;
        this.roomName = roomName;
        this.content = content;
        this.category = category;
    }
}
