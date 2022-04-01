package com.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javaguides.springboot.entities.Comment;
import com.javaguides.springboot.entities.Post;
import com.javaguides.springboot.entities.repository.CommentRepository;
import com.javaguides.springboot.entities.repository.PostRepository;

@SpringBootApplication
public class HibernateOneToManyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HibernateOneToManyApplication.class, args);
	}

	
	@Autowired
	private CommentRepository commentRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		Post post = new Post("one to many using jpa and hibernate", "good one");
		
		Comment comment1 = new Comment("nothing");
		Comment comment2 = new Comment("nothing but ");
		Comment comment3 = new Comment("nothing but good");
		
		post.getComments().add(comment1);
		post.getComments().add(comment2);
		post.getComments().add(comment3);
		
	  	this.postRepository.save(post);
	  	
		
	}

}
