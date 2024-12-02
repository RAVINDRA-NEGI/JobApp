package com.raj.JobApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.raj.JobApp.model.JobPost;
import com.raj.JobApp.service.JobService;

@Controller
public class jobController {
	
	@Autowired
	private JobService service;
	
	@GetMapping({"/","home"})
		public String home() {
			return "home";
		}
	
	@GetMapping("addjob")
	public String addjob() {
		return "addjob";
	}
	
	@PostMapping("handleForm")
	public String handleForm(JobPost jobpost) {
		service.addJob(jobpost);
		return "success";
		
	}
	
	@GetMapping("viewalljobs")
	public String viewJobs(Model m) {
		List<JobPost> jobs = service.getAllJobs();
		m.addAttribute("jobPosts" , jobs);
		return "viewalljobs";
	}
	
	@GetMapping("load")
	public String loadData() {
		service.load();
		
		
		return "success";
	}
}
