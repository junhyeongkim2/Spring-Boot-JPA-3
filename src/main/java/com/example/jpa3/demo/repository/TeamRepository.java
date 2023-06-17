package com.example.jpa3.demo.repository;

import com.example.jpa3.demo.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team,Long> {



}
