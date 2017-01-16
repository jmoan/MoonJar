package com.jmoan.moonjar.admin.home.service;

import java.util.List;

public interface AdminHomeService {

	void uploadPicture(String fileName);

	String getMainPicture();

	List<String> getMainWorks();

}
