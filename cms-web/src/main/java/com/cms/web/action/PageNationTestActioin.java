package com.cms.web.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cms.model.bean.NvaList;
import com.cms.model.bean.Pager;
import com.cms.model.service.NvaListService;

@Controller
public class PageNationTestActioin {
	@Autowired
	private NvaListService nvaListService;
	
	
	@RequestMapping(value="/page")
    public String login(){	
		
        return "page";
    }

	
	@RequestMapping(value="/pageNation")
	@ResponseBody
    public String pageNation(
    		@RequestParam("iDisplayStart") int iDisplayStart,
    		@RequestParam("iDisplayLength") int iDisplayLength
    		){
		Pager pager  = new Pager<NvaList>();
		
		pager.setPageSize(iDisplayLength);
		pager.setStartNum(iDisplayStart);
		
		pager = nvaListService.pageList(pager);
		
        return pager.getJsonData().toString();
    }
}
