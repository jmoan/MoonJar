package com.jmoan.moonjar.admin.home.controller;

import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.jmoan.moonjar.admin.home.service.AdminHomeService;

@Controller
public class AdminController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	private final String localPath = "C:/Users/nabiesoft/git/MoonJar/MoonJar/src/main/webapp/uploads/";
	private final String serverPath = "/home/hosting_users/choding2da/tomcat/webapps/uploads";
	private final String path = localPath; 
	@Inject
	AdminHomeService service;
	
	@RequestMapping(value = "/admin/uploadPicture")
	@ResponseBody
	public String uploadPicture(MultipartHttpServletRequest  request, HttpServletResponse response) throws IllegalStateException, IOException {		
		String fileName = null;
		request.setCharacterEncoding("utf-8");
		MultipartFile file = request.getFile("uploadPicture");
		if(file != null){
			fileName = file.getOriginalFilename();
			if(!new File(path+"/picture/").exists()){
				new File(path+"/picture/").mkdirs();
			}
			
			file.transferTo(new File(path+"/picture/"+fileName));			
			service.uploadPicture(fileName);
			
		}
		return fileName;
	}	
	
	@RequestMapping(value = "/admin/uploadWorks")
	@ResponseBody
	public String uploadWorks(MultipartHttpServletRequest  request, HttpServletResponse response) throws IllegalStateException, IOException {		
		String fileName = null;
		request.setCharacterEncoding("utf-8");		
		List<String> fileNames = new ArrayList<String>();
		List<MultipartFile> files = request.getFiles("uploadWorks[]");
		
		if(!new File(path+"/works/").exists()){
			new File(path+"/works/").mkdirs();
		}
				
		for(MultipartFile mf : files){
			if(mf != null){
				fileName = mf.getOriginalFilename();				
				mf.transferTo(new File(path+"/works/"+fileName));
				service.uploadWorks(fileName);
			}
		}
		
		return fileNames.toString();
	}	
}