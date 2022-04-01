package com.javaguides.springboot;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javaguides.springboot.entity.User;
import com.javaguides.springboot.entity.UserProfile;
import com.javaguides.springboot.repository.UserProfileRepository;
import com.javaguides.springboot.repository.UserRepository;

@SpringBootApplication
public class HibernateOneToOneApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(HibernateOneToOneApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
		
	@Autowired
	private UserProfileRepository userProfileRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
	User user = new User();
	
	user.setName("rames");
	user.setEmail("dsa");
	
	
	UserProfile userProfile = new UserProfile();
	
	userProfile.setAddress("xyz");
	userProfile.setBirthOfDate(LocalDate.of(1991,8, 2));
		
	userProfile.setPhoneNumber("2345678");
     
	user.setUserProfile(userProfile);
	
	userProfile.setUser(user);
	
	
	userRepository.save(user);
	userProfileRepository.save(userProfile);

	
	
	
	}

}
