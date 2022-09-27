package com.example.testing.dto.reponseDto;

import com.example.testing.entity.Memo;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class MemoResponseDto {
    private List<Memo> memoList;
}
