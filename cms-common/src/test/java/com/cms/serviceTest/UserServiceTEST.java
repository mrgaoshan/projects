package com.cms.serviceTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cms.test.bean.User;
import com.cms.test.service.UserTestService;

public class UserServiceTEST extends AbstractServiceForTesting{
	@Autowired
	protected UserTestService userTestService;
	
	@Test
	public void test(){
		User usr = new User();
		usr.setId("5555");
		usr.setName("66666");
		userTestService.testInsert(usr);
	}

}
