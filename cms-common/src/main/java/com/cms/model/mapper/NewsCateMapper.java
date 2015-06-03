package com.cms.model.mapper;

import com.cms.base.mapper.BaseAppMapper;
import com.cms.model.bean.NewsCate;

public interface NewsCateMapper extends BaseAppMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NewsCate record);

    int insertSelective(NewsCate record);

    NewsCate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NewsCate record);

    int updateByPrimaryKey(NewsCate record);
}