/**
 * 
 */
package com.cms.base.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cms.base.bean.BaseAppTO;


/**
 * @author kasimodo
 *
 */
public interface BaseAppMapper {
    public void insert(BaseAppTO obj);

    public void update(BaseAppTO obj);

    public void delete(BaseAppTO obj);

    public List<BaseAppTO> search(BaseAppTO obj);

    public List<BaseAppTO> find(BaseAppTO obj);

}
