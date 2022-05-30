package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentRepository extends JpaRepository<Parent, Integer> {
	

	 @Query(value  = "SELECT count(p) FROM Parent p WHERE p.q1 = ?1")
	   public Integer getCountForQuestion1(int value);
	 
	 @Query(value  = "SELECT count(p) FROM Parent p WHERE p.q2 = ?1")
	   public Integer getCountForQuestion2(int value);
	 
	 @Query(value  = "SELECT count(p) FROM Parent p WHERE p.q3 = ?1")
	   public Integer getCountForQuestion3(int value);
	 
	 @Query(value  = "SELECT count(p) FROM Parent p WHERE p.q4 = ?1")
	   public Integer getCountForQuestion4(int value);
	 
	 @Query(value  = "SELECT count(p) FROM Parent p WHERE p.q5 = ?1")
	   public Integer getCountForQuestion5(int value);
	 
	 @Query(value  = "SELECT count(p) FROM Parent p WHERE p.q6 = ?1")
	   public Integer getCountForQuestion6(int value);
	 
	 @Query(value  = "SELECT count(p) FROM Parent p WHERE p.q7 = ?1")
	   public Integer getCountForQuestion7(int value);
	 
	 @Query(value  = "SELECT count(p) FROM Parent p WHERE p.q8 = ?1")
	   public Integer getCountForQuestion8(int value);
	 
	 @Query(value  = "SELECT count(p) FROM Parent p WHERE p.q9 = ?1")
	   public Integer getCountForQuestion9(int value);
	 
	 @Query(value  = "SELECT count(p) FROM Parent p WHERE p.q10 = ?1")
	   public Integer getCountForQuestion10(int value);
	 
	 @Query(value  = "SELECT count(p) FROM Parent p WHERE p.q11 = ?1")
	   public Integer getCountForQuestion11(int value);
	 
	 @Query(value  = "SELECT count(p) FROM Parent p WHERE p.q12 = ?1")
	   public Integer getCountForQuestion12(int value);
	 
	 @Query(value = "SELECT p FROM Parent p WHERE p.studentId = ?1")
	 	public Parent getByRollNo(String regno);
	 
	 	
}
