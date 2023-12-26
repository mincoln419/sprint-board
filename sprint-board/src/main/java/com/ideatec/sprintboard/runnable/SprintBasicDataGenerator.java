package com.ideatec.sprintboard.runnable;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ideatec.sprintboard.entity.Sprint;
import com.ideatec.sprintboard.entity.SprintType;
import com.ideatec.sprintboard.entity.SprintUser;
import com.ideatec.sprintboard.entity.UserType;
import com.ideatec.sprintboard.repository.SprintRepository;
import com.ideatec.sprintboard.repository.SprintUserRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SprintBasicDataGenerator implements CommandLineRunner{

	final private SprintRepository sprintRepository;
	final private SprintUserRepository sprintUserRepository; 
	
	@Override
	public void run(String... args) throws Exception {
		
		SprintUser user = SprintUser.builder()
				.username("user1")
				.userType(UserType.ADMIN)
				.email("mincoln419@naver.com")
				.build();
		
		sprintUserRepository.save(user);
		
		Sprint sampleSprint = Sprint.builder()
			.title("sample title")
			.author(user)
			.sprintType(SprintType.SERVICE_REQUEST)
			.build();
		sprintRepository.save(sampleSprint);
		
	}

}
