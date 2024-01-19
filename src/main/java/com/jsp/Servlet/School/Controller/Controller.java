package com.jsp.Servlet.School.Controller;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.servlet.annotation.WebServlet;

import com.jsp.Servlet.School.Model.Admin;
import com.jsp.Servlet.School.Model.Student;

@WebServlet(loadOnStartup = 1)
public class Controller {
	
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("psql_school");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();	
	
	//admin login check
	public Admin admin_login(String user) {
		String jpql = "SELECT a FROM Admin a";
		TypedQuery<Admin> typedQuery = entityManager.createQuery(jpql, Admin.class);
		List<Admin> list = typedQuery.getResultList();
		for (Admin admin : list) {
			if (admin.getAdmin_username().equals(user)) {
				System.out.println(admin.getAdmin_username());
				return admin;
			}
		}
		return null;
	}
	
	//student login check
	public Student student_login(String user) {
		String jpql = "SELECT s FROM Student s";
		TypedQuery<Student> typedQuery = entityManager.createQuery(jpql, Student.class);
		List<Student> list = typedQuery.getResultList();
		for (Student student : list) {
			if (student.getStudent_user().equals(user)) {
				System.out.println(student.getStudent_user());
				return student;
			}
		}
		return null;
	}
	
	public boolean add_student(String...arg) {
		Student student = new Student();
		student.setStudent_name(arg[0]);
		int age = Integer.parseInt(arg[1]);
		student.setStudent_age(age);
		
		boolean gender;
		
		if (arg[2].equals("Male")) {
			gender = true;
		} else {
			gender = false;
		}
		
		student.setStudent_gender(gender);
		student.setStudent_gamil(arg[3]);
		student.setStudent_contact(arg[4]);
		student.setStudent_address(arg[5]);
		student.setStudent_user(arg[6]);
		student.setStudent_pass(arg[7]);
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		return true;
		
	}

	public Student find_student_by_id(int id) {
		Student student = entityManager.find(Student.class, id);
		
		if (student!=null) {
			return student;
		} else {
			return null;
		}
	}
	
	public boolean updateStudent(String...arg) {
		int id = Integer.parseInt(arg[7]);
		Student student = entityManager.find(Student.class,id);
		student.setStudent_name(arg[0]);
		int age = Integer.parseInt(arg[1]);
		student.setStudent_age(age);
		student.setStudent_pass(arg[2]);
		student.setStudent_gamil(arg[3]);
		student.setStudent_contact(arg[4]);
		student.setStudent_address(arg[5]);
		student.setStudent_user(arg[6]);
		
		
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
		
		return true;
		
		
		
	}

	public boolean deleteStudent(int id) {
		Student find = entityManager.find(Student.class, id);
		if (find!=null) {
			entityTransaction.begin();
			entityManager.remove(find);
			entityTransaction.commit();
			return true;
		}
		return false;
		
	}

}
