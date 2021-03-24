package org.capg.demo.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	LoginDao ld;

	@Override
	public String validateCredentials(Object obj) {
		return ld.validateCredintals(obj);
	}

	@Override
	public String signOut(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}
}
