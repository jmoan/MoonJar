package com.jmoan.moonjar.admin.home.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jmoan.moonjar.admin.home.service.AdminHomeService;
import com.jmoan.moonjar.common.dto.UserDTO;

@Controller
public class PageMoveController {

	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
		
	@Inject
	AdminHomeService service;
	
	
	@RequestMapping(value = "/admin/index")
	public ModelAndView adminIndex(HttpServletRequest request, HttpServletResponse response, UserDTO dto) {		
		return new ModelAndView("/admin/index");
	}
	
	@RequestMapping(value = "/admin/summary")
	public ModelAndView adminSummary(HttpServletRequest request, HttpServletResponse response, UserDTO dto) {		
		return new ModelAndView("/admin/summary");
	}	
	@RequestMapping(value = "/admin/navBar")
	public ModelAndView adminNavBar(HttpServletRequest request, HttpServletResponse response, UserDTO dto) {		
		return new ModelAndView("/admin/template/navBar");
	}
	
	@RequestMapping(value = "/admin/contents-main")
	public ModelAndView adminContentsMain(HttpServletRequest request, HttpServletResponse response, UserDTO dto) {
		String fileName = service.getMainPicture();
		List<String> workFiles = service.getMainWorks();
		
		ModelAndView mv = new ModelAndView("/admin/contents/contents-main");
		mv.addObject("fileName", fileName);
		mv.addObject("workFiles",workFiles);
		return mv;
	}
	
	@RequestMapping(value = "/admin/contents-gallery")
	public ModelAndView adminContentsGallery(HttpServletRequest request, HttpServletResponse response, UserDTO dto) {		
		return new ModelAndView("/admin/contents/contents-gallery");
	}
	
	@RequestMapping(value = "/admin/contents-exhibition")
	public ModelAndView adminContentsExhibition(HttpServletRequest request, HttpServletResponse response, UserDTO dto) {		
		return new ModelAndView("/admin/contents/contents-exhibition");
	}
	
	@RequestMapping(value = "/admin/contents-note")
	public ModelAndView adminContentsNote(HttpServletRequest request, HttpServletResponse response, UserDTO dto) {		
		return new ModelAndView("/admin/contents/contents-note");
	}
}