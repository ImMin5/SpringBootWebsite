package com.MinhoCompany.SpringWebsite;

import com.MinhoCompany.SpringWebsite.repository.MemberRepository;
import com.MinhoCompany.SpringWebsite.repository.MemoryMemberRepository;
import com.MinhoCompany.SpringWebsite.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//직접 스프링 빈 등록하기
@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
