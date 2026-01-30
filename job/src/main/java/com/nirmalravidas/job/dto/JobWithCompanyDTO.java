package com.nirmalravidas.job.dto;

import com.nirmalravidas.job.external.Company;
import com.nirmalravidas.job.model.Job;

public class JobWithCompanyDTO {
    private Job job;
    private Company company;

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
