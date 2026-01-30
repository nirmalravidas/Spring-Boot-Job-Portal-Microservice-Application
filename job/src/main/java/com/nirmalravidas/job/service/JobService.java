package com.nirmalravidas.job.service;

import com.nirmalravidas.job.dto.JobWithCompanyDTO;
import com.nirmalravidas.job.model.Job;

import java.util.List;

public interface JobService {
    List<JobWithCompanyDTO> findAll();
    void createJob(Job job);
    Job getJobById(Long id);
    boolean deleteJobById(Long id);
    boolean updateJob(Long id, Job updatedJob);

}
