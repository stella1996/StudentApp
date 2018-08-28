package com.student.studentapp.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.student.studentapp.model.Student;

public interface  StudentRepository extends JpaRepository<Student,Integer>{
	
	@Transactional
	@Modifying
	@Query("DELETE FROM Student b WHERE  b.id=?1")
	public int delete( Integer id);
	
	@Transactional
	@Modifying
	@Query("UPDATE Student b SET b.age = ?2 WHERE b.id =?1")
	public int update( Integer id,Integer age);

}
