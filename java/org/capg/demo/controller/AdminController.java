package org.capg.demo.controller;

import org.capg.demo.entity.Admin;
import org.capg.demo.service.IAdminService;
import org.capg.demo.util.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
@Autowired

LoginServiceImpl ls;

@GetMapping("/{username}/{password}")
public String validateCredentials(@PathVariable String username,@PathVariable String password) {
	return ls.validateCredentials(username,password);
}
}
