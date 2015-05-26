/**
 * 
 */
package com.cms.base.service;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.cms.base.bean.BaseAppTO;
import com.cms.base.mapper.BaseAppMapper;

/**
 * @author kasimodo
 *
 */
public class BaseAppService<T extends BaseAppMapper> implements Serializable{

	private static final Log log = LogFactory.getLog(BaseAppService.class);
	private static final long serialVersionUID = 1L;
	protected T mapper;
	
	@Autowired
	public void setMapper(T t) {
        this.mapper = t;
    }
	
	public void insert(BaseAppTO obj){
		mapper.insert(obj);
	}

    public void update(BaseAppTO obj){
    	mapper.update(obj);
	}

    public void delete(BaseAppTO obj){
    	mapper.delete(obj);
	}

    public List<BaseAppTO> search(BaseAppTO obj){
		return mapper.search(obj);
	}

    public List<BaseAppTO> find(BaseAppTO obj){
    	return mapper.find(obj);
	}

}
