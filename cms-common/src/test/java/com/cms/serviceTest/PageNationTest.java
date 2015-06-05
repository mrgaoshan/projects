package com.cms.serviceTest;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;

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
	
	public static void main(String dd[]){
		
		List<NvaList> list = new ArrayList<NvaList>();
		NvaList a1 = new NvaList();
		a1.setLevel(2);
		NvaList a2 = new NvaList();
		a2.setLevel(3);
		list.add(a1);
		list.add(a2);
		JSONArray jsonArray = JSONArray.fromObject(list);
		
		System.out.println(jsonArray.toString());
	}
	
	
	
}
