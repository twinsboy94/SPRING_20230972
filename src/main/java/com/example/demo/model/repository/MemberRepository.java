package com.example.demo.model.repository;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.domain.Article;
import com.example.demo.model.domain.Board;
import com.example.demo.model.domain.Member;

@Repository

public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByEmail(String email);
}