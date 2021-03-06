package com.MinhoCompany.SpringWebsite.service;

import com.MinhoCompany.SpringWebsite.domain.Member;
import com.MinhoCompany.SpringWebsite.repository.MemberRepository;
import com.MinhoCompany.SpringWebsite.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Service
public class MemberService {
    public final MemberRepository memberRepository ;
    //@Autowired
    public MemberService(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    /*
     * 회원 가입
     */
    public Long join(Member member){
        //같은 이름이 있는 중복 회원 x

        validateDuplicateMember(member); //중복회원 검증

        memberRepository.save(member);
        return member.getId();
    }

    /**
    * 전체 회원 조회
    */
    public List<Member> findMembers(){
      return memberRepository.findAll();
    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
        });
    }

    public Optional<Member> findOne(Long memberId){
          return memberRepository.findById(memberId);
    }
}
