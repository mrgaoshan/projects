package com.cms.model.mapper;

import com.cms.base.mapper.BaseAppMapper;
import com.cms.model.bean.CpCate;

public interface CpCateMapper extends BaseAppMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CpCate record);

    int insertSelective(CpCate record);

    CpCate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CpCate record);

    int updateByPrimaryKey(CpCate record);
}