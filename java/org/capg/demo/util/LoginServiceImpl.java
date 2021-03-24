package org.capg.demo.util;

import org.springframework.beans.factory.annotation.Autowired;

public class LoginServiceImpl implements LoginService {
@Autowired
LoginDao ld;
@Override

public String validateCredentials(Object obj) {
	return ld.validateCredintals(obj);
}
}

