package com.jmoan.moonjar.admin.home.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.jmoan.moonjar.admin.home.dao.AdminHomeDAO;

@Repository
public class AdminHomeDAOImpl implements AdminHomeDAO{

	@Resource(name = "sqlSessionForMySql")
	private SqlSession sessionTemplate;

	@Override
	public void uploadPicture(String fileName) {
		// TODO Auto-generated method stub
		sessionTemplate.insert("admin.uploadPicture", fileName);
	}

	@Override
	public String getMainPicture() {
		// TODO Auto-generated method stub
		return sessionTemplate.selectOne("admin.getMainPicture");
	}

	@Override
	public List<String> getMainWorks() {
		// TODO Auto-generated method stub
		return sessionTemplate.selectList("admin.getMainWorks");
	}
	
}
