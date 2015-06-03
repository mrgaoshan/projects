package com.cms.model.bean;

import java.util.List;

import com.cms.base.bean.BaseAppTO;

public class Pager<T> extends BaseAppTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1841843157707034115L;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalNum;
	
	private Integer startNum;
	
	private Integer endNum;
	
	private List<T> resultList;
	
	public Pager(){
		this.pageNumber=1;
		this.pageSize=10;
		this.setStartNum();
		this.setEndNum();
	}

	public Integer getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = null==pageNumber?1:pageNumber;
		this.setStartNum();
		this.setEndNum();
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = null==pageSize?10:pageSize;
		this.setStartNum();
		this.setEndNum();
	}

	public Integer getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public Integer getStartNum() {
		return startNum;
	}

	public void setStartNum() {
		this.startNum = (pageNumber-1)*pageSize;
	}

	public Integer getEndNum() {
		return endNum;
	}

	public void setEndNum() {
		this.endNum = pageNumber*pageSize;
	}

	public List<T> getResultList() {
		return resultList;
	}

	public void setResultList(List<T> resultList) {
		this.resultList = resultList;
	}
	
	

}
