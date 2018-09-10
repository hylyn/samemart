package com.samemart.console.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("page")
@Controller
public class PageController {

	/*第1种写法
	@RequestMapping(value="{pageName}")
	//pathVariable是路径参数
	public ModelAndView toPage(@PathVariable("pageName") String pageName) {
		
		ModelAndView mv = new ModelAndView(pageName);
		return mv;
	}
	*/
	
	//第2种写法
	@RequestMapping(value="{pageName}")
	public String toPage(@PathVariable("pageName") String pageName) {
		return pageName;
	}
}
