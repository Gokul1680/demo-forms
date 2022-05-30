package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer> {
	
	@Query(value  = "SELECT user FROM Login user WHERE user.username = ?1")
	   public Login getByUserName(String uname);

}
