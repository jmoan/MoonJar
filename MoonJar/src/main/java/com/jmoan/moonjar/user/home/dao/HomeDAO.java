package com.jmoan.moonjar.user.home.dao;

import java.util.List;

import com.jmoan.moonjar.common.dto.UserDTO;

public interface HomeDAO {

	public List<UserDTO> selectAllUserList();

	public boolean joinUser(UserDTO dto);

	public UserDTO selectUser(UserDTO dto);

	public UserDTO loginUser(UserDTO dto);
}
