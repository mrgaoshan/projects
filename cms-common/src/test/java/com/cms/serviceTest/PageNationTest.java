package com.cms.serviceTest;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cms.model.bean.NvaList;
import com.cms.model.bean.Pager;
import com.cms.model.service.NvaListService;

public class PageNationTest extends AbstractServiceForTesting{
	 

	@Autowired
	private NvaListService nvaListService;
	
	@Test
	public void testPageNation(){
		
		Pager pager  = new Pager<NvaList>();
		
		pager.setPageNumber(2);
		
		pager = nvaListService.pageList(pager);
		
		List<NvaList> list = pager.getResultList();
		
		System.out.println("total number"+ pager.getTotalNum());
		
		for(NvaList item:list){
			System.out.println("nave name"+ item.getNavname());
		}
	}
	
}
