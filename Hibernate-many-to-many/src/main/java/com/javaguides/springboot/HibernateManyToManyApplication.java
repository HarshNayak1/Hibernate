package com.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javaguides.springboot.entities.Post;
import com.javaguides.springboot.entities.Tag;
import com.javaguides.springboot.repository.PostRepository;
import com.javaguides.springboot.repository.TagRepository;

@SpringBootApplication
public class HibernateManyToManyApplication implements CommandLineRunner{

	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private TagRepository tagRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(HibernateManyToManyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
        
		Post post = new Post("good", "not good", "nothing to say");
		
		Post post1 = new Post("second good", "second not good", "second nothing to say");
		
		Tag springBoot = new Tag("spring boot");
		Tag hibernate = new Tag("hibernate");
		
		post.getTags().add(hibernate);
		post.getTags().add(springBoot);

		springBoot.getPosts().add(post1);
		post1.getTags().add(springBoot);
		
		springBoot.getPosts().add(post);
		springBoot.getPosts().add(post);
		
		this.postRepository.save(post);
		this.postRepository.save(post1);
	}

}
