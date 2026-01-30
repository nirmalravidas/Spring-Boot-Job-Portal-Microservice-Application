package com.nirmalravidas.job.repository;


import com.nirmalravidas.job.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
