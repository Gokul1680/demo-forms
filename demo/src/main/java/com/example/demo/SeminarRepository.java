package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SeminarRepository extends JpaRepository<Seminar, Integer>{

	
	@Query(value  = "SELECT count(s) FROM Seminar s WHERE s.q1 = ?1  AND s.sub = ?2")
	   public Integer getCountForQuestion1(int value , String code);
	 
	 @Query(value  = "SELECT count(s) FROM Seminar s WHERE s.q2 = ?1  AND s.sub = ?2")
	   public Integer getCountForQuestion2(int value , String code);
	 
	 @Query(value  = "SELECT count(s) FROM Seminar s WHERE s.q3 = ?1  AND s.sub = ?2")
	   public Integer getCountForQuestion3(int value , String code);
	 
	 @Query(value  = "SELECT count(s) FROM Seminar s WHERE s.q4 = ?1  AND s.sub = ?2")
	   public Integer getCountForQuestion4(int value , String code);
	 
	 @Query(value  = "SELECT count(s) FROM Seminar s WHERE s.q5 = ?1  AND s.sub = ?2")
	   public Integer getCountForQuestion5(int value , String code);
	 
	 @Query(value  = "SELECT count(s) FROM Seminar s WHERE s.q6 = ?1  AND s.sub = ?2")
	   public Integer getCountForQuestion6(int value , String code);
	 
	 @Query(value  = "SELECT count(s) FROM Seminar s WHERE s.q7 = ?1  AND s.sub = ?2")
	   public Integer getCountForQuestion7(int value , String code);
	 
	 @Query(value  = "SELECT count(s) FROM Seminar s WHERE s.q8 = ?1  AND s.sub = ?2")
	   public Integer getCountForQuestion8(int value , String code);
	 
	 @Query(value  = "SELECT count(s) FROM Seminar s WHERE s.q9 = ?1  AND s.sub = ?2")
	   public Integer getCountForQuestion9(int value , String code);
	 
	 @Query(value  = "SELECT count(s) FROM Seminar s WHERE s.q10 = ?1  AND s.sub = ?2")
	   public Integer getCountForQuestion10(int value , String code);
	 
	 @Query(value = "SELECT s FROM Seminar s WHERE s.sub = ?1 AND s.facultyName = ?2")
	 public Seminar getByRollNo(String code , String facultyName);
	 
	
}
