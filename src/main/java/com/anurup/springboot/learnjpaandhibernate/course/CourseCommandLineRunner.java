package com.anurup.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.anurup.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	
	//@Autowired
	//private CourseJdbcRepository repository;
	
	//@Autowired
	//private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "AWS Jpa", "Anurup Dey"));
		repository.save(new Course(2, "Azure Jpa", "Anurup Dey"));
		repository.save(new Course(3, "DevOps Jpa", "Anurup Dey"));
		repository.save(new Course(4, "Full Stack Jpa", "Anurup Dey"));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("Anurup Dey"));
		System.out.println(repository.findByAuthor(""));
		
		System.out.println(repository.findByName("DevOps Jpa"));
		System.out.println(repository.findByName("Full Stack Jpa"));
		
	}

}
