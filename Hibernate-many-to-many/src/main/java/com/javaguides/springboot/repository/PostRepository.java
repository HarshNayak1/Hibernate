package com.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaguides.springboot.entities.Post;

@Repository
public interface PostRepository extends JpaRepository<Post,Long>{

}
