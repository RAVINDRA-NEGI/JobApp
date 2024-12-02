package com.raj.JobApp.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raj.JobApp.model.JobPost;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer>{
		
	
	 
	
//	
//	public List<JobPost> getAllJobs(){
//		return jobs;
//	}
//	
//	public void addJob(JobPost job) {
//		jobs.add(job);
//	}
}
