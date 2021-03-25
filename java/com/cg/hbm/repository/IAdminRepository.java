package com.cg.hbm.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.hbm.entites.Admin;
@Repository
public interface IAdminRepository extends JpaRepository<Admin, String> {

}