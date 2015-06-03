package com.cms.model.mapper;

import com.cms.model.bean.NvaList;

public interface NvaListMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NvaList record);

    int insertSelective(NvaList record);

    NvaList selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NvaList record);

    int updateByPrimaryKey(NvaList record);
}