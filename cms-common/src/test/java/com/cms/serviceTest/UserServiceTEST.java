package com.cms.serviceTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cms.demo.bean.User;
import com.cms.demo.service.UserTestService;

public class UserServiceTEST extends AbstractServiceForTesting{
	
	@Autowired
	protected UserTestService userTestService;
	
	@Test
	public void test(){
		//AA
		User usr = new User();
		usr.setId("gaoshan3333");
		usr.setName("gaoshan1111");
		userTestService.insert(usr);
	}

}
