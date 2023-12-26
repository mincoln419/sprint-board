package com.ideatec.sprintboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ideatec.sprintboard.entity.SprintUser;

@Repository
public interface SprintUserRepository extends JpaRepository<SprintUser, Long>{

}
