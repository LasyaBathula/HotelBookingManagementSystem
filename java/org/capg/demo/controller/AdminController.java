package org.capg.demo.controller;
import org.capg.demo.entity.Admin;
import org.capg.demo.util.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {   
	  @Autowired
	 LoginServiceImpl ls;
	
	  @GetMapping("/{login}")
	public String validateCredentials(@RequestBody Admin admin) {


		return ls.validateCredentials(admin);
		
		
	}
}
