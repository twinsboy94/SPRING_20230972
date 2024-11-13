package com.example.demo.model.repository;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.domain.Article;
import com.example.demo.model.domain.Board;

// @Repository
// public interface BoardRepository extends JpaRepository<Board, Long>{

//     Board save(Article entity);
//     // List<Article> findAll();
// }

@Repository
public interface BoardRepository extends JpaRepository<Board, Long>{
    Board save(Article entity);
    Page<Board> findByTitleContainingIgnoreCase(String title, org.springframework.data.domain.Pageable pageable);
}