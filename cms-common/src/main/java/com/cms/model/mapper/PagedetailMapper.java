package com.cms.model.mapper;

import com.cms.base.mapper.BaseAppMapper;
import com.cms.model.bean.Pagedetail;

public interface PagedetailMapper extends BaseAppMapper{
 
  int updateByPrimaryKeyWithBLOBs(Pagedetail record);


}