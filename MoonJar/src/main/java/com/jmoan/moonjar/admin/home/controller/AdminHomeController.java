package com.jmoan.moonjar.admin.home.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jmoan.moonjar.admin.home.service.AdminHomeService;
import com.jmoan.moonjar.user.home.controller.HomeController;

@Controller
public class AdminHomeController {

private static final Logger logger = LoggerFactory.getLogger(AdminHomeController.class);
	
	@Inject
	AdminHomeService service;
	
	@RequestMapping(value = "/admin/home")
	public ModelAndView home(HttpServletRequest request, HttpServletResponse response) {
		
		ModelAndView mv = new ModelAndView("/admin/home");		
		return mv;
	}
}