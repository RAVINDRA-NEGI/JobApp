package com.raj.JobApp.model;



import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Component
@Entity

public class JobPost {
	@Id
    private int postId;
    private String postProfile;
    private String postDesc;
    private int reqExperience;
    private List<String> postTechStack;

    // No-argument constructor
    public JobPost() {}

    // All-argument constructor
    public JobPost(int postId, String postProfile, String postDesc, int reqExperience, List<String> postTechStack) {
        this.postId = postId;
        this.postProfile = postProfile;
        this.postDesc = postDesc;
        this.reqExperience = reqExperience;
        this.postTechStack = postTechStack;
    }

    // Getters and Setters
    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getPostProfile() {
        return postProfile;
    }

    public void setPostProfile(String postProfile) {
        this.postProfile = postProfile;
    }

    public String getPostDesc() {
        return postDesc;
    }

    public void setPostDesc(String postDesc) {
        this.postDesc = postDesc;
    }

    public int getReqExperience() {
        return reqExperience;
    }

    public void setReqExperience(int reqExperience) {
        this.reqExperience = reqExperience;
    }

    public List<String> getPostTechStack() {
        return postTechStack;
    }

    public void setPostTechStack(List<String> postTechStack) {
        this.postTechStack = postTechStack;
    }

    // toString method
    @Override
    public String toString() {
        return "JobPost{" +
                "postId=" + postId +
                ", postProfile='" + postProfile + '\'' +
                ", postDesc='" + postDesc + '\'' +
                ", reqExperience=" + reqExperience +
                ", postTechStack=" + postTechStack +
                '}';
    }

    // equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobPost jobPost = (JobPost) o;
        return postId == jobPost.postId &&
                reqExperience == jobPost.reqExperience &&
                Objects.equals(postProfile, jobPost.postProfile) &&
                Objects.equals(postDesc, jobPost.postDesc) &&
                Objects.equals(postTechStack, jobPost.postTechStack);
    }

    // hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(postId, postProfile, postDesc, reqExperience, postTechStack);
    }
}
