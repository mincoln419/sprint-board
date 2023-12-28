package com.ideatec.sprintboard.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class SprintComment {

	@Id @GeneratedValue
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sprint_id")
	private Sprint sprint;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "insert_user")
	private SprintUser insert_user;
	
	private String comment;
}
