package com.example.jpa3.demo.repository;

import com.example.jpa3.demo.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {

}
