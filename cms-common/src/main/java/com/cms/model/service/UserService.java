package com.cms.model.service;

import org.springframework.stereotype.Service;

import com.cms.base.service.BaseAppService;
import com.cms.model.mapper.UserMapper;

@Service("userService")
public class UserService extends BaseAppService<UserMapper> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7691679894958054358L;

}
