package com.ideatec.sprintboard.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <pre>
 * com.ideatec.sprintboard.dto
 * PageParam.java
 * </pre>
 *
 * @author  : minco
 * @date    : 2023. 12. 21. 오후 6:00:14
 * @desc    :
 * @version : x.x
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageParam {

	private int offset;

	private int size;

}
