package com.jmoan.moonjar.user.home.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.jmoan.moonjar.admin.home.dao.AdminHomeDAO;
import com.jmoan.moonjar.common.dto.UserDTO;
import com.jmoan.moonjar.user.home.dao.HomeDAO;

@Repository
public class HomeDAOImpl implements HomeDAO{

	@Resource(name = "sqlSessionForMySql")
	private SqlSession sessionTemplate;
	
	@Override
	public List<UserDTO> selectAllUserList(){		
		List<UserDTO> list = sessionTemplate.selectList("user.selectUser");		
		return list;
	}

	@Override
	public boolean joinUser(UserDTO dto) {
		boolean flag = sessionTemplate.insert("user.joinUser", dto)>0?true:false;
		return flag;
	}

	@Override
	public UserDTO selectUser(UserDTO dto) {
		// TODO Auto-generated method stub
		UserDTO returnDTO = sessionTemplate.selectOne("user.selectUser", dto); 
		return returnDTO;
	}

	@Override
	public UserDTO loginUser(UserDTO dto) {
		// TODO Auto-generated method stub
		UserDTO returnDTO = sessionTemplate.selectOne("user.loginUser",dto);
		return returnDTO;
	}
}
