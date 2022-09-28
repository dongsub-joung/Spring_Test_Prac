package com.example.testing.dto.reponseDto;

import com.example.testing.entity.Category;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class CategoryResponseDto {
    List<Category> categories;
}
