package org.alvas.student_servlet_crudt.dao;

import java.io.PrintWriter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.alvas.student_servlet_crudt.dto.Student;

public class StudentDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager;
	EntityTransaction entityTransaction;

	public Student saveStudent(Student student) {

		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();

		return student;
	}

	public Student updateStudent(int id, String name, String email) {

		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();

		Student student2 = entityManager.find(Student.class, id);

		student2.setStudentName(name);
		student2.setStudentEmail(email);

		entityTransaction.begin();

		entityManager.merge(student2);

		entityTransaction.commit();

		return student2;
	}

	public List<Student> getAllStudent() {

		entityManager = entityManagerFactory.createEntityManager();

		String select = "Select s From Student s";

		Query query = entityManager.createQuery(select);

		List<Student> student = query.getResultList();

		return student;
	}
	
	public Student deleteStudent(int id) {
		
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		
		Student student = entityManager.find(Student.class, id);
		
		entityTransaction.begin();

		entityManager.remove(student);

		entityTransaction.commit();

		return student;
		
	}
	
	/* getstduentById */
	public Student getStudentById(int id) {
		
		entityManager = entityManagerFactory.createEntityManager();
		return  entityManager.find(Student.class, id);
		
	}
	
	/* updateStudentById */
	public Student updateStudentById(Student student,int id) {
		
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		
	    Student student2 = entityManager.find(Student.class, id);
	    
	    if(student2!=null) {
	    	entityTransaction.begin();
	    	entityManager.merge(student);
	    	entityTransaction.commit();
	    	
	    }else {
	    	return null;
	    }
		
	    return student;
	}
}
