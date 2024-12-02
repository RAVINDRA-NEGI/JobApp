package com.raj.JobApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.raj.JobApp.model.JobPost;
import com.raj.JobApp.repo.JobRepo;

@Service
public class JobService {
	
	@Autowired
	private JobRepo repo;

	public void addJob(JobPost jobpost ) {
		repo.save(jobpost);
	}
	
	public List<JobPost>getAllJobs(){
		return repo.findAll();
		
	}
	
	
	
	public void load() {
	  List<JobPost> jobs = new ArrayList<>(Arrays.asList(
		        new JobPost(1, "Software Engineer", "Develop software solutions", 3, Arrays.asList("Java", "Spring", "SQL")),
		        new JobPost(2, "Data Scientist", "Analyze data and build models", 2, Arrays.asList("Python", "TensorFlow", "SQL")),
		        new JobPost(3, "DevOps Engineer", "Manage CI/CD pipelines and cloud infrastructure", 4, Arrays.asList("Docker", "Kubernetes", "AWS")),
		        new JobPost(4, "Frontend Developer", "Build and maintain web applications", 2, Arrays.asList("JavaScript", "React", "CSS"))
		    ));
	  
	  repo.saveAll(jobs);
	}
	
}
	






