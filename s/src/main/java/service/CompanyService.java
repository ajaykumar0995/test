package service;

import java.util.List;

import entity.Company;

public interface CompanyService {
	
	List<Company> getACompanies();

	Company addCompany(Company company);

	Company updateCompany(Long id, Company company);

}
