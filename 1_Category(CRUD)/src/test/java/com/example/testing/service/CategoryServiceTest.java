package com.example.testing.service;

import com.example.testing.dto.reponseDto.ResponseDto;
import com.example.testing.dto.requestDto.CategoryRequestDto;
import com.example.testing.entity.Category;
import com.example.testing.repository.CategoryRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CategoryServiceTest {
    MockHttpServletRequest httpServletRequest;

    CategoryRepository categoryRepository;

    CategoryRequestDto requestDto= new CategoryRequestDto("A", "abcd");
    Category category= new Category(requestDto);
    CategoryService categoryService= new CategoryService(categoryRepository);


    @Test
    void saveStory() {
        var result= categoryService.saveStory(requestDto, httpServletRequest);
        assertEquals("Success", result.getSuccess().toString());
    }

    @Test
    void sendStories() {
        var result= categoryService.SendStories("A");
        assertEquals("Success", result.getSuccess().toString());
    }


}