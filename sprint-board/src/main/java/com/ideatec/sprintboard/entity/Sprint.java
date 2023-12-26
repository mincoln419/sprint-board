package com.ideatec.sprintboard.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
	
	@OneToOne
	@JoinColumn(name = "author_id")
	private SprintUser author;
	
	@Enumerated(EnumType.STRING)
	private SprintType sprintType;
	
	@OneToMany(mappedBy = "sprint")
	private List<SprintComment> comments; 
	
	
}
