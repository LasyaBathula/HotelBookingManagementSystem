package org.capg.demo.Jpa;
import org.capg.demo.entity.*;
public interface IAdminRepository {
	public Admin signIn(Admin admin);
	public Admin signOut(Admin admin);
	
}
