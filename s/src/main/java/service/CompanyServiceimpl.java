package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Company;
import repository.CompanyRepository;

@Service
public class CompanyServiceimpl implements CompanyService {

	@Autowired
	private CompanyRepository companyRepository;

	@Override
	public List<Company> getACompanies() {
		ArrayList<Company> companyList = new ArrayList<Company>();
		companyRepository.findAll().forEach(companyList::add);
		return companyList;
	}

	@Override
	public Company addCompany(Company company) {
		return companyRepository.save(company);
	}

	@Override
	public Company updateCompany(Long id, Company company) {
		Company ExistingCompany = companyRepository.findById(company.getId()).orElse(null);
		ExistingCompany.setCompanyName(company.getCompanyName());
		return companyRepository.save(ExistingCompany);

	}

}
