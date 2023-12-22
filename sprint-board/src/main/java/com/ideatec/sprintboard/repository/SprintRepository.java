package com.ideatec.sprintboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ideatec.sprintboard.entity.Sprint;

@Repository
public interface SprintRepository extends JpaRepository<Sprint, Long>{


	
}
