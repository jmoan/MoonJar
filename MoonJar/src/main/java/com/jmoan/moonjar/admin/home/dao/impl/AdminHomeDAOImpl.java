package com.jmoan.moonjar.admin.home.dao.impl;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.jmoan.moonjar.admin.home.dao.AdminHomeDAO;

@Repository
public class AdminHomeDAOImpl implements AdminHomeDAO{

	@Resource(name = "sqlSessionForMySql")
	private SqlSession sessionTemplate;
	
}
