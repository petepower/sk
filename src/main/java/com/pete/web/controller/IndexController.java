package com.pete.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pete.domain.entity.AcctUser;
import com.pete.domain.service.UserService;
import com.pete.web.controller.base.BaseController;

@Controller
@RequestMapping("/index")
public class IndexController extends BaseController{
			
	private static final Logger LOGGER = Logger.getLogger(IndexController.class);


	@RequestMapping("")
	public String  index(HttpServletRequest request, HttpServletResponse response) {
		LOGGER.info("查询用户全部用户");
		request.setAttribute("code", "00000");
		return "index";
	}
	
	@RequestMapping("/index2")
	public String  index2(HttpServletRequest request, HttpServletResponse response) {
		LOGGER.info("查询用户全部用户");
		request.setAttribute("code", "00000");
		return page("index2");
	}
	
	@RequestMapping("/index3")
	public String  index3(HttpServletRequest request, HttpServletResponse response) {
		LOGGER.info("查询用户全部用户");
		return "index3";
	}
	
	@RequestMapping("/index4")
	public String  index4(HttpServletRequest request, HttpServletResponse response) {
		LOGGER.info("查询用户全部用户");
		return "test/test";
	}
}
