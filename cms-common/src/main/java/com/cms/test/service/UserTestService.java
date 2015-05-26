package com.cms.test.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cms.test.bean.User;
import com.cms.test.mapper.UserMapper;

@Service("userTestService")
public class UserTestService {
	 	protected UserMapper mapper;

	 	@Resource
	    public void setMapper(UserMapper t) {
	        this.mapper = t;
	    }
	    
	    public void testInsert(User usr){
	    	
	    	mapper.insert(usr);
	    }
}
