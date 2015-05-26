package com.cms.demo.service;

import org.springframework.stereotype.Service;

import com.cms.base.service.BaseAppService;
import com.cms.demo.mapper.UserMapper;

@Service("userTestService")
public class UserTestService extends BaseAppService<UserMapper>{

	private static final long serialVersionUID = -9082733548704520007L;
		
}
