package org.capg.demo.service;


	import org.capg.demo.entity.*;

	public interface IAdminService {
		public Admin signIn(int admin_id);
		public Admin signOut(Admin admin);
		public Admin findAdmin(int admin_id);
		
	}


