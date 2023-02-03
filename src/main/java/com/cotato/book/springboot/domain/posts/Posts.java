package com.cotato.book.springboot.domain.posts;

import com.cotato.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Getter
@NoArgsConstructor
@Entity //테이블과 연결

public class Posts extends BaseTimeEntity {

    @Id // 해당 Table의 PK 필드를 나타냄
    @GeneratedValue(strategy = GenerationType.IDENTITY) //pk생성 규칙 ; Auto_Increment
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false) //nullable의 역할?
    private String content; //length가 디폴트 값 varchar 255로 들어간건가?

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
