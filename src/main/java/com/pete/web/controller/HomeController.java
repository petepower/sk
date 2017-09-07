package com.pete.web.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pete.web.controller.base.BaseController;

@Controller
@RequestMapping("/home")
public class HomeController extends BaseController {
	
	private static final Logger LOGGER = Logger.getLogger(HomeController.class);


	@RequestMapping("")
	public String  index() {
		LOGGER.info("查询首页");
		request.setAttribute("code", "00000");
		return "home/index";
	}

	@RequestMapping("/bs")
	public String  bs() {
		LOGGER.info("查询首页");
		request.setAttribute("code", "00000");
		return "home/bs";
	}
	
	@RequestMapping("/bs2")
	public String  bs2() {
		LOGGER.info("查询首页");
		request.setAttribute("code", "00000");
		return "home/bs2";
	}
}
