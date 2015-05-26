package com.cms.test.mapper;

import org.springframework.stereotype.Component;

import com.cms.test.bean.User;


public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}