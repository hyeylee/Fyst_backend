package com.project.foryourskintype.service;

import com.project.foryourskintype.domain.Member;
import com.project.foryourskintype.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JPAMemberServiceTest {
    @Autowired
    MemberRepository memberRepository;
    @Autowired
    MemberService memberService;

//
//    @Test
//    @Transactional
//    @Rollback(value = false)
//    void 회원가입테스트(){
//        Member member1 = new Member("name",11,"여","NASDAQ@","asd","010");
//        Member member2 = new Member("name",3,"여","asd2@","asd","123");
//
//        memberService.join(member1);
//
//        memberService.join(member2);
//    }

}