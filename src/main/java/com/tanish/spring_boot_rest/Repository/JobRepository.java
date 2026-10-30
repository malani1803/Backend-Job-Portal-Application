package com.tanish.spring_boot_rest.Repository;

import com.tanish.spring_boot_rest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<JobPost,Integer> {

    List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile,String postDesc);

}
    // ArrayList to store JobPost objects
//    List<JobPost> jobs =
//            new ArrayList<>(List.of(
//                    new JobPost(1, "Software Engineer", "Exciting opportunity for a skilled software engineer.", 3, List.of("Java", "Spring", "SQL")),
//                    new JobPost(2, "Data Scientist", "Join our data science team and work on cutting-edge projects.", 5, List.of("Python", "Machine Learning", "TensorFlow")),
//                    new JobPost(3, "Frontend Developer", "Create amazing user interfaces with our talented frontend team.", 2, List.of("JavaScript", "React", "CSS")),
//                    new JobPost(4, "Network Engineer", "Design and maintain our robust network infrastructure.", 4, List.of("Cisco", "Routing", "Firewalls")),
//                    new JobPost(5, "UX Designer", "Shape the user experience with your creative design skills.", 3, List.of("UI/UX Design", "Adobe XD", "Prototyping"))
//
//            ));
//
//    // method to return all JobPosts
//    public List<JobPost> getAllJobs() {
//        return jobs;
//    }
//
//    /// / method to save a job post object into arrayList
//    public void addJob(JobPost job) {
//        jobs.add(job);
//        System.out.println(jobs);
//
//    }
//
//    //method to get a job by postId
//    public JobPost getJob(int postId) {
//        for (JobPost job : jobs) {
//            if (job.getPostId() == postId)
//                return job;
//        }
//        return null;
//    }
//
//    public void updateJob(JobPost jobPost) {
//        for (JobPost jobPost1 : jobs) {
//            if (jobPost1.getPostId() == jobPost.getPostId()) {
//                jobPost1.setPostProfile(jobPost.getPostProfile());
//                jobPost1.setPostDesc(jobPost1.getPostDesc());
//                jobPost1.setReqExperience(jobPost.getReqExperience());
//                jobPost1.setPostTechStack(jobPost.getPostTechStack());
//
//            }
//        }
//    }
//
//    public void deleteJob(int postId) {
//        for (JobPost jobPost : jobs) {
//            if (jobPost.getPostId() == postId) {
//                jobs.remove(jobPost);
//            }
//        }
//    }

