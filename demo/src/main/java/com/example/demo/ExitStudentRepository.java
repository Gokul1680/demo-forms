package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ExitStudentRepository extends JpaRepository<ExitStudent, Integer> {

	@Query(value  = "SELECT count(e) FROM ExitStudent  e WHERE e.q1 = ?1")
	   public Integer getCountForQuestion1(int value);
	 
	 @Query(value  = "SELECT count(e) FROM ExitStudent  e WHERE e.q2 = ?1")
	   public Integer getCountForQuestion2(int value);
	 
	 @Query(value  = "SELECT count(e) FROM ExitStudent  e WHERE e.q3 = ?1")
	   public Integer getCountForQuestion3(int value);
	 
	 @Query(value  = "SELECT count(e) FROM ExitStudent  e WHERE e.q4 = ?1")
	   public Integer getCountForQuestion4(int value);
	 
	 @Query(value  = "SELECT count(e) FROM ExitStudent  e WHERE e.q5 = ?1")
	   public Integer getCountForQuestion5(int value);
	 
	 @Query(value  = "SELECT count(e) FROM ExitStudent  e WHERE e.q6 = ?1")
	   public Integer getCountForQuestion6(int value);
	 
	 @Query(value  = "SELECT count(e) FROM ExitStudent  e WHERE e.q7 = ?1")
	   public Integer getCountForQuestion7(int value);
	 
	 @Query(value  = "SELECT count(e) FROM ExitStudent  e WHERE e.q8 = ?1")
	   public Integer getCountForQuestion8(int value);
	 
	 @Query(value  = "SELECT count(e) FROM ExitStudent  e WHERE e.q9 = ?1")
	   public Integer getCountForQuestion9(int value);
	 
	 @Query(value  = "SELECT count(e) FROM ExitStudent  e WHERE e.q10 = ?1")
	   public Integer getCountForQuestion10(int value);
	 
	 @Query(value  = "SELECT count(e) FROM ExitStudent  e WHERE e.q11 = ?1")
	   public Integer getCountForQuestion11(int value);
	 
	 @Query(value  = "SELECT count(e) FROM ExitStudent  e WHERE e.q12 = ?1")
	   public Integer getCountForQuestion12(int value);
	 
	 @Query(value  = "SELECT count(e) FROM ExitStudent  e WHERE e.q13 = ?1")
	   public Integer getCountForQuestion13(int value);
	 
	 @Query(value  = "SELECT count(e) FROM ExitStudent  e WHERE e.q14 = ?1")
	   public Integer getCountForQuestion14(int value);
	 
	 @Query(value  = "SELECT count(e) FROM ExitStudent  e WHERE e.q15 = ?1")
	   public Integer getCountForQuestion15(int value);
	 
	 @Query(value = "SELECT e FROM ExitStudent e WHERE e.studentId = ?1")
	 	public ExitStudent getByRollNo(String regno);
	 
}
