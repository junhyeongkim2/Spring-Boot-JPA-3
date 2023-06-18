package com.example.jpa3.demo.repository;

import com.example.jpa3.demo.entity.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.awt.print.Pageable;
import java.util.List;

public interface MemberRepository extends JpaRepository<Member,Long> {
    //@Query(name = "Member.findByUsername")
    List<Member> findByUsername(@Param("username") String username);



    @Query(value=  "select m from Member m left join m.team t",
            countQuery = "select count(m.username) from Member m")
    Page<Member> findByAge(int age, PageRequest pageRequest);



    @Modifying(clearAutomatically = true)
    @Query("update Member m set m.age = m.age + 1 where m.age >= :age")
    int bulkAgePlus(@Param("age") int age);



    @Query("select m from Member m left join fetch m.team")
    List<Member> findMemberFetchJoin();



}
