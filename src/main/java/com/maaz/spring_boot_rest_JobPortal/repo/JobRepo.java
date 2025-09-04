package com.maaz.spring_boot_rest_JobPortal.repo;

import com.maaz.spring_boot_rest_JobPortal.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(

            new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                    List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),

            new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3,
                    List.of("HTML", "CSS", "JavaScript", "React")),

            new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
                    List.of("Python", "Machine Learning", "Data Analysis")),

            new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5,
                    List.of("Networking", "Cisco", "Routing", "Switching")),

            new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3,
                    List.of("iOS Development", "Android Development", "Mobile App"))
    ));

    public List<JobPost> getAllJobPost(){
        System.out.println("Get All Job from Repooooooooo");
        System.out.println(jobs);
            return jobs;
    }

    public void addJobs(JobPost jobPost){
        System.out.println("Add Job in repo");

        jobs.add(jobPost);
        System.out.println("==================");
        System.out.println(jobs);
        System.out.println("==================");
    }

    public JobPost getJob(int id) {
//        System.out.println(id + " repo job post id to agai he ");

        for (JobPost job:jobs){
//            System.out.println("for k loop main hn");
            if (job.getPostId() == id){
                System.out.println(job + " repo return job post ");

                return job;

            }
        }

        return null;
    }

    public void updateJobPost(JobPost updateJobPost) {
        for (JobPost job : jobs){
            if(job.getPostId() == updateJobPost.getPostId()){
                job.setPostProfile(updateJobPost.getPostProfile());
                job.setPostId(updateJobPost.getPostId());
                job.setPostDescription(updateJobPost.getPostDescription());
                job.setReqExp(updateJobPost.getReqExp());
                job.setPostTechStack(updateJobPost.getPostTechStack());
            }
        }
    }

    public void deleteJob(Integer postId) {
        for (JobPost job : jobs){
            if(job.getPostId() == postId){
                jobs.remove(job);
            }
        }
    }
}
