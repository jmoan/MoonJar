package com.jmoan.moonjar.admin.home.dao;

import java.util.List;

public interface AdminHomeDAO {

	void uploadPicture(String fileName);

	String getMainPicture();

	List<String> getMainWorks();

}
