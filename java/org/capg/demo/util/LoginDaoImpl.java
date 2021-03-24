package org.capg.demo.util;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.capg.demo.entity.Admin;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class LoginDaoImpl implements LoginDao {
	@PersistenceContext
	EntityManager em;

	@Override
	public String validateCredintals(Object obj) {
		if (obj instanceof Admin) {
			Admin a = (Admin) obj;
		
			TypedQuery<Admin> q =  em.createQuery("select a from Admin a where a.admin_name=:aname and a.password=:pass",Admin.class);
			q.setParameter("uname", a.getAdmin_name());
			q.setParameter("pass", a.getPassword());

			
			List<Admin> adminList =  q.getResultList();
			if (adminList.size() > 0)
				return "success";
			else
				return "Invalid";
		}
		return null;
	}

	@Override
	public String signOut(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}
}
