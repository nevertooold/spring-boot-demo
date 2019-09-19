package com.carrots.springbootdemo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.carrots.springbootdemo.entity.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long>{

	Project findByProjectIdentifier(String projectIdentifier);
	
	List<Project> findAll();
	
	void delete(Project project);
	
}
