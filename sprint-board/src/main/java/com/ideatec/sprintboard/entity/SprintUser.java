package com.ideatec.sprintboard.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SprintUser {
	
	@Id @GeneratedValue
	private Long id;
	
	private String username;
	
	private String password;
	
	private String email;
	
	private UserType userType;
}
