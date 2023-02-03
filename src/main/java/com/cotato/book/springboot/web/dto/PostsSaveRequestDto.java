package com.cotato.book.springboot.web.dto;

import com.cotato.book.springboot.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {  //Controller와 Service 사이에서 사용할 Dto 클래스
    private String title;
    private String content;
    private String author;

    @Builder
    public PostsSaveRequestDto(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Posts toEntity(){ //간접적으로 Entity 테이블과 연결된 Posts의 생성자를 이용한 초기화를 진행한다.
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
