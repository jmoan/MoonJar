package com.jmoan.moonjar.user.home.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.jmoan.moonjar.common.dto.UserDTO;
import com.jmoan.moonjar.user.home.dao.HomeDAO;
import com.jmoan.moonjar.user.home.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{

	@Inject
	HomeDAO dao;
	
	@Override
	public List<UserDTO> selectAllUserList(){
		return dao.selectAllUserList();
	}

	@Override
	public boolean joinUser(UserDTO dto) {
		// TODO Auto-generated method stub
		return dao.joinUser(dto);
	}

	@Override
	public UserDTO selectUser(UserDTO dto) {
		// TODO Auto-generated method stub
		return dao.selectUser(dto);
	}

	@Override
	public UserDTO loginUser(UserDTO dto) {
		// TODO Auto-generated method stub
		return dao.loginUser(dto);
	}
}
