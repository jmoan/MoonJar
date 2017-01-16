package com.jmoan.moonjar.user.home.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jmoan.moonjar.common.dto.UserDTO;
import com.jmoan.moonjar.user.home.service.HomeService;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	HomeService service;
	
	@RequestMapping(value = "/")
	public ModelAndView home(HttpServletRequest request, HttpServletResponse response) {
						
		List<UserDTO> list = service.selectAllUserList();
		ModelAndView mv = new ModelAndView("/user/home");
		return mv;
	}
	
	@RequestMapping(value = "/login")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response, UserDTO dto) {
		
		UserDTO resultDTO = service.loginUser(dto);
		
		if(resultDTO != null){
			request.getSession().setAttribute("user", resultDTO);
		}
		
		ModelAndView mv = new ModelAndView("/user/home");	
		return mv;
	}
	
	@RequestMapping(value = "/joinForm")
	public ModelAndView joinForm(HttpServletRequest request, HttpServletResponse response) {
		
		ModelAndView mv = new ModelAndView("/user/join");
		return mv;
	}
	
	@RequestMapping(value = "/checkId")
	@ResponseBody
	public String checkId(HttpServletRequest request, HttpServletResponse response, UserDTO dto) throws IOException, ParseException {
				
		String result = "failure";
		
		ModelAndView mv = new ModelAndView("jsonView");
		
		if(service.selectUser(dto) == null){
			result = "success";
		}
		
		return result;
	}
	@RequestMapping(value = "/join")
	public ModelAndView join(HttpServletRequest request, HttpServletResponse response, UserDTO dto) {
		
		service.joinUser(dto);
		ModelAndView mv = new ModelAndView("/user/home");		
		return mv;
	}
}