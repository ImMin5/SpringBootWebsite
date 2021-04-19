package com.MinhoCompany.SpringWebsite.repository;

import com.MinhoCompany.SpringWebsite.domain.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class MemoryMemberRepositoryTest {
    MemoryMemberRepository reposiroty = new MemoryMemberRepository();

    @AfterEach
    public void afterEach(){
        reposiroty.clearStore();
    }
    @Test
    public void save() {
        Member member = new Member();
        member.setName("Minho");

        reposiroty.save(member);

        Member result = reposiroty.findById(member.getId()).get();
        //Assertions.assertEquals(result,member);
        assertThat(member).isEqualTo(result);

    }
    @Test
    public void findByName() {
        Member member1 = new Member();
        member1.setName("Minho1");
        reposiroty.save(member1);

        Member member2 = new Member();
        member2.setName("Minho2");
        reposiroty.save(member2);

        Member result =reposiroty.findByName("Minho1").get();

        assertThat(result).isEqualTo(member1);

    }
    @Test
    public void findAll(){
        Member member1 = new Member();
        member1.setName("Minho1");
        reposiroty.save(member1);

        Member member2 = new Member();
        member2.setName("Minho2");
        reposiroty.save(member2);

        List<Member> result = reposiroty.findAll();

        assertThat(result.size()).isEqualTo(2);

    }
}
