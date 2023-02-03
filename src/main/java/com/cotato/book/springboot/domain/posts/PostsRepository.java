package com.cotato.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long> {  // Posts클래스로 Database를 접근하게 해 줄 JpaRepository
    @Query("SELECT p FROM Posts p ORDER BY p.id DESC ")
    List<Posts> findALLDesc();
}
