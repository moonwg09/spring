package com.vam.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vam.VO.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberMapperTests {
	@Autowired
	MemberMapper membermapper;
	
	@Test
	public void memberJoin() throws Exception{ MemberVO member = new
	  MemberVO();
	  member.setMemberNo(1);
	  member.setId("123");
	  member.setPassword("123");
	  member.setNickName("용호");
	  member.setEmail("qwe");
	  member.setAddr1("123");
	  member.setAddr2("123");
	  member.setPhone("123");
	  member.setAdminCk(1);
	  
	  membermapper.memberJoin(member); //쿼리 메서드 실행
	  
	  }
}
