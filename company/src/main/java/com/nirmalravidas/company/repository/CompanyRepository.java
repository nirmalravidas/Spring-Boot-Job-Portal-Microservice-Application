package com.nirmalravidas.company.repository;

import com.nirmalravidas.company.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
