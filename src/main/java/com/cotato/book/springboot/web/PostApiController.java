package com.cotato.book.springboot.web;

import com.cotato.book.springboot.service.posts.PostsService;
import com.cotato.book.springboot.web.dto.PostsResponseDto;
import com.cotato.book.springboot.web.dto.PostsSaveRequestDto;
import com.cotato.book.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor //final 달린 놈의 Constructor 생성
@RestController
public class PostApiController {

    private final PostsService postsService; //Bean 객체를 @AutoWired가 아닌 생성자로써 주입 받음.

    @PostMapping("/api/v1/posts") //Create
    public Long save(@RequestBody PostsSaveRequestDto requstDto) {
        return postsService.save(requstDto);
    }

    @PutMapping("/api/v1/posts/{id}")//Update
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping("api/v1/posts/{id}") //Read
    public PostsResponseDto findById (@PathVariable Long id) {
        return postsService.findById(id);
    }

    @DeleteMapping("/api/v1/posts/{id}") //Delete
    public Long delete(@PathVariable Long id) {
        postsService.delete(id);
        return id;
    }

}
