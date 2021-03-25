package com.cg.hbm.controller;

import com.cg.hbm.entites.Admin;


import com.cg.hbm.service.IAdminService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private IAdminService ls;

	@PostMapping(value="/login")
	public ResponseEntity<String> validateCredintials(@RequestBody Admin admin) {
		if(admin!=null) {
			Admin admin1=ls.signIn(admin);
			return new ResponseEntity<String>("Login sucess",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("Login failed",HttpStatus.NOT_FOUND);
		}
		


		}
	
	}


