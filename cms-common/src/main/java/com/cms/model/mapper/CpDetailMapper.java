package com.cms.model.mapper;

import com.cms.base.mapper.BaseAppMapper;
import com.cms.model.bean.CpDetail;

public interface CpDetailMapper extends BaseAppMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CpDetail record);

    int insertSelective(CpDetail record);

    CpDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CpDetail record);

    int updateByPrimaryKeyWithBLOBs(CpDetail record);

    int updateByPrimaryKey(CpDetail record);
}