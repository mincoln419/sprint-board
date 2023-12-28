package com.ideatec.sprintboard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <pre>
 * com.ideatec.sprintboard.entity
 * BackLog.java
 * </pre>
 *
 * @author  : minco
 * @date    : 2023. 12. 28. 오후 4:45:09
 * @desc    :
 * @version : x.x
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BackLog {

	@Id @GeneratedValue
	private Long id;

	private String title;

	private String content;

	@Enumerated(EnumType.STRING)
	private BackLogStatus backLogStatus;
}
