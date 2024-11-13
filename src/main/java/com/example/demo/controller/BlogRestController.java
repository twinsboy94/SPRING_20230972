package com.example.demo.controller;

import com.example.demo.model.domain.Article;
import com.example.demo.model.domain.Board;
import com.example.demo.model.service.AddArticleRequest;
import com.example.demo.model.service.BlogService;
import lombok.RequiredArgsConstructor;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController // @Controller + @ResponseBody
public class BlogRestController {
    private final BlogService blogService;
    // @PostMapping("/api/Board")
    // public ResponseEntity<Article> addArticle(@ModelAttribute AddArticleRequest request) {
    // Article saveArticle = blogService.save(request);
    // return ResponseEntity.status(HttpStatus.CREATED)
    //     .body(saveArticle);
    // }

    @GetMapping("/favicon.ico")
        public void favicon() {
        // 아무 작업도 하지 않음
    }

    @Repository
        public interface BoardRepository extends JpaRepository<Board, Long>{
            Page<Board> findByTitleContainingIgnoreCase(String title, Pageable pageable);
        }
    
}
