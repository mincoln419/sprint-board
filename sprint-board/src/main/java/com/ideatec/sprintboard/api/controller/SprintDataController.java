package com.ideatec.sprintboard.api.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.jaxb.SpringDataJaxb.PageDto;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ideatec.sprintboard.dto.PageParam;
import com.ideatec.sprintboard.dto.SprintDto;

import lombok.extern.slf4j.Slf4j;

/**
 * <pre>
 * com.ideatec.sprintboard.api.controller
 * SprintDataController.java
 * </pre>
 *
 * @author  : minco
 * @date    : 2023. 12. 21. 오후 5:40:25
 * @desc    :
 * @version : x.x
 */
@RestController
@RequestMapping("/api")
@Slf4j
public class SprintDataController {


	@GetMapping("/v1/sprint")
	public String selectSprints_v1(@RequestParam Map<String, Object> pageParam) {

		log.info("pageParam:{}", pageParam);
		return "sprint";
	}

	@GetMapping("/v1/sprint/{id}")
	public String selectSprintsOne_v1(@PathVariable("id") String id) {

		log.info("select sprint id:{}", id);

		return "sprint";
	}


	@PostMapping("/v1/sprint")
	public String upsertSprints_v1(@RequestBody SprintDto sprintDto ) {

		log.info("upsert sprintDto: {}", sprintDto);
		return "sprint";
	}

	@DeleteMapping("/v1/sprint/{id}")
	public String deleteSprintsOne_v1(@PathVariable("id") String id) {

		log.info("delete id: {}", id);
		return "sprint";
	}
}
