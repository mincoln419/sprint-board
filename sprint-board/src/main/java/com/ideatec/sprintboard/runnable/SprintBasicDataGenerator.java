package com.ideatec.sprintboard.runnable;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ideatec.sprintboard.entity.Sprint;
import com.ideatec.sprintboard.repository.SprintRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SprintBasicDataGenerator implements CommandLineRunner{

	final private SprintRepository sprintRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		
		Sprint sampleSprint = Sprint.builder()
			.author(null)
			.build();
		sprintRepository.save(sampleSprint);
		
	}

}
