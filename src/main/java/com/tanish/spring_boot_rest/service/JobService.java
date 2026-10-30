package com.tanish.spring_boot_rest.service;


import com.tanish.spring_boot_rest.Repository.JobRepository;
import com.tanish.spring_boot_rest.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {


    @Autowired
    private JobRepository Repository;


    // method to add a jobPost
    public void addJob(JobPost jobPost){
        Repository.save(jobPost);
    }

    //method to return all jobPosts
    public List<JobPost> getAllJobs(){
        return Repository.findAll();
    }

    //method to return single jobPosts by postId
    public JobPost getJob(int postId) {
        return Repository.findById(postId).orElse(new JobPost());
    }

    public void updateJob(JobPost jobPost) {
        Repository.save(jobPost);
    }

    public void deleteJob(int postId) {
        Repository.deleteById(postId);
    }

    public void load() {

        List<JobPost> jobs =
                new ArrayList<>(List.of(
                        new JobPost(1, "Software Engineer", "Exciting opportunity for a skilled software engineer.", 3, List.of("Java", "Spring", "SQL")),
                        new JobPost(2, "Data Scientist", "Join our data science team and work on cutting-edge projects.", 5, List.of("Python", "Machine Learning", "TensorFlow")),
                        new JobPost(3, "Frontend Developer", "Create amazing user interfaces with our talented frontend team.", 2, List.of("JavaScript", "React", "CSS")),
                        new JobPost(4, "Network Engineer", "Design and maintain our robust network infrastructure.", 4, List.of("Cisco", "Routing", "Firewalls")),
                        new JobPost(5, "UX Designer", "Shape the user experience with your creative design skills.", 3, List.of("UI/UX Design", "Adobe XD", "Prototyping"))

                ));
        Repository.saveAll(jobs);

    }

    public List<JobPost> search(String keyword) {

        return Repository.findByPostProfileContainingOrPostDescContaining(keyword,keyword);
    }
}
