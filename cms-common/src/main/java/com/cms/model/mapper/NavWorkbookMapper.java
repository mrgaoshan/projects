package com.cms.model.mapper;

import com.cms.base.mapper.BaseAppMapper;
import com.cms.model.bean.NavWorkbook;

public interface NavWorkbookMapper extends BaseAppMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NavWorkbook record);

    int insertSelective(NavWorkbook record);

    NavWorkbook selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NavWorkbook record);

    int updateByPrimaryKey(NavWorkbook record);
}