package com.jmoan.moonjar.admin.home.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.jmoan.moonjar.admin.home.dao.AdminHomeDAO;
import com.jmoan.moonjar.admin.home.service.AdminHomeService;
import com.jmoan.moonjar.user.home.dao.HomeDAO;

@Service
public class AdminHomeServiceImpl implements AdminHomeService{

	@Inject
	AdminHomeDAO dao;
	
	@Override
	public void uploadPicture(String fileName) {
		// TODO Auto-generated method stub
		dao.uploadPicture(fileName);
	}

	@Override
	public String getMainPicture() {
		// TODO Auto-generated method stub
		return dao.getMainPicture();
	}

	@Override
	public List<String> getMainWorks() {
		// TODO Auto-generated method stub
		return dao.getMainWorks();
	}

	@Override
	public void uploadWorks(String fileName) {
		// TODO Auto-generated method stub
		dao.uploadWorks(fileName);
	}

}
