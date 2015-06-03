package com.cms.model.mapper;

import com.cms.base.mapper.BaseAppMapper;
import com.cms.model.bean.NewsDetail;

public interface NewsDetailMapper extends BaseAppMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NewsDetail record);

    int insertSelective(NewsDetail record);

    NewsDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NewsDetail record);

    int updateByPrimaryKeyWithBLOBs(NewsDetail record);

    int updateByPrimaryKey(NewsDetail record);
}