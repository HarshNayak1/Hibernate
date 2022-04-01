package com.javaguides.springboot.entities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaguides.springboot.entities.Comment;

@Repository
public interface CommentRepository  extends JpaRepository<Comment, Long>{

}
