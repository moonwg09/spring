package com.vam.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vam.VO.MemberVO;
import com.vam.service.MemberService;

@Controller
@RequestMapping(value = "/member")
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	MemberService memberservice;

    @Autowired // 암호화 의존성주입
    private BCryptPasswordEncoder pwEncoder;
    // 회원가입 버튼 클릭 시
	@RequestMapping(value="/join" , method = RequestMethod.GET)
	public void memberJoin() throws Exception{
		logger.info("memberJoin 진입");
	}
	// 회원가입
	@RequestMapping(value="/join" ,method= RequestMethod.POST)
	public String joinPost(MemberVO mvo) throws Exception{
		String rawPw =""; // 인코딩 전
		return "redirect:/login";
	}
	
	// 로그인 버튼 클릭 시
	@RequestMapping(value="/login", method=RequestMethod.GET )
	public void memberLogin() throws Exception{
		logger.info("memberLogin 진입");
	}
}
