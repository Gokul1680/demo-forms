package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer>{

	@Query(value  = "SELECT count(p) FROM Project p WHERE p.q1 = ?1  AND p.sub = ?2")
	   public Integer getCountForQuestion1(int value,String code);
	 
	 @Query(value  = "SELECT count(p) FROM Project p WHERE p.q2 = ?1  AND p.sub = ?2")
	   public Integer getCountForQuestion2(int value,String code);
	 
	 @Query(value  = "SELECT count(p) FROM Project p WHERE p.q3 = ?1  AND p.sub = ?2")
	   public Integer getCountForQuestion3(int value,String code);
	 
	 @Query(value  = "SELECT count(p) FROM Project p WHERE p.q4 = ?1  AND p.sub = ?2")
	   public Integer getCountForQuestion4(int value,String code);
	 
	 @Query(value  = "SELECT count(p) FROM Project p WHERE p.q5 = ?1  AND p.sub = ?2")
	   public Integer getCountForQuestion5(int value,String code);
	 
	 @Query(value  = "SELECT count(p) FROM Project p WHERE p.q6 = ?1  AND p.sub = ?2")
	   public Integer getCountForQuestion6(int value,String code);
	 
	 @Query(value  = "SELECT count(p) FROM Project p WHERE p.q7 = ?1  AND p.sub = ?2")
	   public Integer getCountForQuestion7(int value,String code);
	 
	 @Query(value  = "SELECT count(p) FROM Project p WHERE p.q8 = ?1  AND p.sub = ?2")
	   public Integer getCountForQuestion8(int value,String code);
	 
	 @Query(value  = "SELECT count(p) FROM Project p WHERE p.q9 = ?1  AND p.sub = ?2")
	   public Integer getCountForQuestion9(int value,String code);
	 
	 @Query(value  = "SELECT count(p) FROM Project p WHERE p.q10 = ?1  AND p.sub = ?2")
	   public Integer getCountForQuestion10(int value,String code);
	 
	 @Query(value = "SELECT p FROM Project p WHERE p.sub = ?1 AND p.facultyName = ?2")
	 public Project getByRollNo(String code , String facultyName);
	 
	
	
}
