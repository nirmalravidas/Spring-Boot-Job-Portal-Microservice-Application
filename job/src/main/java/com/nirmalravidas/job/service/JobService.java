package com.nirmalravidas.job.service;

import com.nirmalravidas.job.dto.JobDTO;
import com.nirmalravidas.job.model.Job;

import java.util.List;

public interface JobService {
    List<JobDTO> findAll();
    void createJob(Job job);
    JobDTO getJobById(Long id);
    boolean deleteJobById(Long id);
    boolean updateJob(Long id, Job updatedJob);

}
