package com.example.testing.controller;

import com.example.testing.dto.reponseDto.ResponseDto;
import com.example.testing.dto.requestDto.CategoryRequestDto;
import com.example.testing.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api")
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping(value = "/categories/{category}")
    public ResponseDto<?> getAllStoryInCategory(@PathVariable String category){
        return categoryService.SendStories(category);
    }

    @PostMapping(value = "/categories")
    public ResponseDto<?> addStoryScript(@RequestBody CategoryRequestDto requestDto, HttpServletRequest request){
        return categoryService.saveStory(requestDto, request);
    }

    @PutMapping(value = "/categories/{id}")
    public ResponseDto<?> updateStoryScript(@PathVariable Long id, @RequestBody CategoryRequestDto requestDto, HttpServletRequest request){
        return categoryService.update(id, requestDto, request);
    }

    @DeleteMapping(value = "/categories/{id}")
    public ResponseDto<?> deleteStoryScript(@PathVariable Long id){
        return categoryService.delete(id);
    }
}
