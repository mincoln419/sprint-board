package com.ideatec.sprintboard.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <pre>
 * com.ideatec.sprintboard.dto
 * SprintDto.java
 * </pre>
 *
 * @author  : minco
 * @date    : 2023. 12. 21. 오후 5:49:08
 * @desc    :
 * @version : x.x
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SprintDto {

	private String title;

	private String content;

	private String userId;

}
