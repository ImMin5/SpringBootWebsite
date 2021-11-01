package com.MinhoCompany.SpringWebsite.controller;

import com.MinhoCompany.SpringWebsite.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller //이렇게 선언해 놓으면 스프링 컨테이너가 객체를 생성해서 보관하고 관리한다.
public class MemberController {
    private MemberService memberService;

    @Autowired //스프링컨테이너에서 매개변수를 가져온다.
    public MemberController(MemberService memberService){
        this.memberService = memberService;

    }
}
