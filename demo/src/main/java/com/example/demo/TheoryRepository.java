package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TheoryRepository  extends JpaRepository<Theory, Integer> {

	@Query(value = "SELECT count(t) FROM Theory t WHERE t.q1 = ?1 AND t.sub = ?2")
	   public Integer getCountForQuestion1(int value , String code);
	 
	 @Query(value  = "SELECT count(t) FROM Theory t WHERE t.q2 = ?1 AND t.sub = ?2")
	   public Integer getCountForQuestion2(int value , String code);
	 
	 @Query(value  = "SELECT count(t) FROM Theory t WHERE t.q3 = ?1 AND t.sub = ?2")
	   public Integer getCountForQuestion3(int value , String code);
	 
	 @Query(value  = "SELECT count(t) FROM Theory t WHERE t.q4 = ?1 AND t.sub = ?2")
	   public Integer getCountForQuestion4(int value , String code);
	 
	 @Query(value = "SELECT count(t) FROM Theory t WHERE t.q5 = ?1 AND t.sub = ?2")
	   public Integer getCountForQuestion5(int value , String code);
	 
	 @Query(value  = "SELECT count(t) FROM Theory t WHERE t.q6 = ?1 AND t.sub = ?2")
	   public Integer getCountForQuestion6(int value , String code);
	 
	 @Query(value   = "SELECT count(t) FROM Theory t WHERE t.q7 = ?1 AND t.sub = ?2")
	   public Integer getCountForQuestion7(int value , String code);
	 
	 @Query(value   = "SELECT count(t) FROM Theory t WHERE t.q8 = ?1 AND t.sub = ?2")
	   public Integer getCountForQuestion8(int value , String code);
	 
	 @Query(value  = "SELECT count(t) FROM Theory t WHERE t.q9 = ?1 AND t.sub = ?2")
	   public Integer getCountForQuestion9(int value , String code);
	 
	 @Query(value   = "SELECT count(t) FROM Theory t WHERE t.q10 = ?1 AND t.sub = ?2")
	   public Integer getCountForQuestion10(int value , String code);
	 
	 @Query(value  = "SELECT count(t) FROM Theory t WHERE t.q11 = ?1 AND t.sub = ?2")
	   public Integer getCountForQuestion11(int value , String code);
	 
	 @Query(value = "SELECT count(t) FROM Theory t WHERE t.q12 = ?1 AND t.sub = ?2")
	   public Integer getCountForQuestion12(int value , String code);
	
	 @Query(value = "SELECT t FROM Theory t WHERE t.sub = ?1 AND t.facultyName = ?2")
	 public Theory getByRollNo(String code , String facultyName);
	 
}
