package com.maaz.spring_boot_rest_JobPortal.service;

import com.maaz.spring_boot_rest_JobPortal.model.JobPost;
import com.maaz.spring_boot_rest_JobPortal.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo ;

    public void addJob(JobPost jobPost){
        System.out.println("Add Job in Service");

        repo.addJobs(jobPost);
        System.out.println(jobPost);

    }

    public List<JobPost> getAllJobPost(){
//        System.out.println("Get all Job in Service");

        return repo.getAllJobPost();
    }


    public JobPost getJob(int i) {
//        System.out.println(i + " service job post ");
//        System.out.println( " return ho kr service k pass bhi ai he  "+ repo.getJob(i));
        return  repo.getJob(i);
    }

    public void updateJob(JobPost jobPost) {
         repo.updateJobPost(jobPost);
    }

    public void deleteJob(Integer postId) {
        repo.deleteJob(postId);
    }
}
