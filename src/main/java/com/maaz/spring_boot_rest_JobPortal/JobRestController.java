package com.maaz.spring_boot_rest_JobPortal;

import com.maaz.spring_boot_rest_JobPortal.model.JobPost;
import com.maaz.spring_boot_rest_JobPortal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping("jobPosts")
    @ResponseBody
    public List<JobPost> getAllJobs(){
        return service.getAllJobPost();
    }

    @GetMapping("jobPost/{postId}")
    @ResponseBody
    public JobPost getJob(@PathVariable("") Integer postId){
        return service.getJob(postId);
    }

    @PostMapping("jobPost")
    @ResponseBody
    public JobPost addJob(@RequestBody JobPost jobPost){
        service.addJob(jobPost);
        return service.getJob(jobPost.getPostId());

    }

    @PutMapping("jobPost")
    @ResponseBody
    public JobPost updateJob(@RequestBody JobPost jobPost){
        service.updateJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{postId}")
    @ResponseBody
    public String deleteJobPost(@PathVariable Integer postId){
        service.deleteJob(postId);
        return "Deleted!";
    }
}
