package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{


	@Query(value  = "SELECT count(e) FROM Employee e WHERE e.q1 = ?1")
	   public Integer getCountForQuestion1(int value);
	 
	 @Query(value  = "SELECT count(e) FROM Employee e WHERE e.q2 = ?1")
	   public Integer getCountForQuestion2(int value);
	 
	 @Query(value  = "SELECT count(e) FROM Employee e WHERE e.q3 = ?1")
	   public Integer getCountForQuestion3(int value);
	 
	 @Query(value  = "SELECT count(e) FROM Employee e WHERE e.q4 = ?1")
	   public Integer getCountForQuestion4(int value);
	 
	 @Query(value  = "SELECT count(e) FROM Employee e WHERE e.q5 = ?1")
	   public Integer getCountForQuestion5(int value);
	 
	 @Query(value  = "SELECT count(e) FROM Employee e WHERE e.q6 = ?1")
	   public Integer getCountForQuestion6(int value);
	 
	 @Query(value  = "SELECT count(e) FROM Employee e WHERE e.q7 = ?1")
	   public Integer getCountForQuestion7(int value);
	 
	 @Query(value  = "SELECT count(e) FROM Employee e WHERE e.q8 = ?1")
	   public Integer getCountForQuestion8(int value);
	 
	 @Query(value  = "SELECT count(e) FROM Employee e WHERE e.q9 = ?1")
	   public Integer getCountForQuestion9(int value);
	 
	 @Query(value  = "SELECT count(e) FROM Employee e WHERE e.q10 = ?1")
	   public Integer getCountForQuestion10(int value);
	 
	 @Query(value = "SELECT e FROM Employee e WHERE e.employeeId = ?1")
	 	public Employee getByRollNo(String regno);
	 

	
}
