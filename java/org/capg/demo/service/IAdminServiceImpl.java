package org.capg.demo.service;

import org.capg.demo.Jpa.IAdminRepository;
import org.capg.demo.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;

public class IAdminServiceImpl implements IAdminService{
@Autowired
IAdminRepository AdminDao;
	@Override
	public Admin signIn(Admin admin) {
		// TODO Auto-generated method stub
		return AdminDao.signIn(admin);
	}

	@Override
	public Admin signOut(Admin admin) {
		// TODO Auto-generated method stub
		
		return AdminDao.signOut(admin);
	}

}
