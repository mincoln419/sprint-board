package com.ideatec.sprintboard.entity;

import java.time.LocalDateTime;
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
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
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

	@Enumerated(EnumType.STRING)
	private SprintStatus sprintStatus;

	@OneToMany(mappedBy = "sprint")
	private List<SprintComment> comments;

	private LocalDateTime beginDtm;

	private LocalDateTime finishDtm;

	private LocalDateTime insertDtm;

	private LocalDateTime updateDtm;


	public static Sprint generateSprint(String sprintTitle, SprintType sprintType, SprintUser user) {
		Sprint sprintInstance = Sprint.builder()
				.title(sprintTitle)
				.author(user)
				.sprintType(sprintType)
				.sprintStatus(SprintStatus.ISSUED)
				.insertDtm(LocalDateTime.now())
				.updateDtm(LocalDateTime.now())
				.build();
		return sprintInstance;
	}

	public Sprint setDuration(LocalDateTime beginDtm, LocalDateTime finishDtm) {
		this.beginDtm = beginDtm;
		this.finishDtm = beginDtm;
		return this;
	}
}
