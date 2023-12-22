package com.ideatec.sprintboard.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Sprint {

	@Id @GeneratedValue
	private Long id;
	
	private String title;
	
	private String author;
	
	private SprintType sprintType;
	
	@OneToMany(mappedBy = "sprint")
	private List<SprintComment> comments; 
	
	
}
