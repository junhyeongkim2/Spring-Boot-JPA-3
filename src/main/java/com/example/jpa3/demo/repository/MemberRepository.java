package com.example.jpa3.demo.repository;

import com.example.jpa3.demo.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member,Long> {
    //@Query(name = "Member.findByUsername")
    List<Member> findByUsername(@Param("username") String username);

}
