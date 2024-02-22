package controller;


import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import dto.CompanyDTO;
import entity.Company;
import mapper.CompanyMapper;

import service.CompanyService;

@RestController
@RequestMapping("/api/v1")
public class CompanyController {

	@Autowired
	private CompanyService companyService;
	@Autowired
	private CompanyMapper companyMapper;

	@GetMapping("/companies")
	public ResponseEntity<List<CompanyDTO>> getAllCompanies() {
		List<Company> companyList = companyService.getACompanies();

		List<CompanyDTO> companyDTOList = new ArrayList<CompanyDTO>();

		for (Company entity : companyList) {
			companyDTOList.add(CompanyMapper.getCompanyDTO(entity));
		}
		return ResponseEntity.ok(companyDTOList);

	}

	@PostMapping("/companies")
	public ResponseEntity<CompanyDTO> addCompany(@RequestBody CompanyDTO companyDTO) {
		Company company = companyMapper.getCompany(companyDTO);
		Company newCompany = companyService.addCompany(company);
		CompanyDTO newCompanyDTO = CompanyMapper.getCompanyDTO(newCompany);
		return ResponseEntity.status(HttpStatus.CREATED).body(newCompanyDTO);
	}

	@PutMapping(value = "/companies/{id}")
	public ResponseEntity<CompanyDTO> updateCompany(@PathVariable(value = "id") Long id,
			@RequestBody CompanyDTO companyDTO) {
		Company company = companyMapper.getCompany(companyDTO);
		Company updatedCompany = companyService.updateCompany(id, company);
		CompanyDTO updatedCompanyDTO = CompanyMapper.getCompanyDTO(updatedCompany);
		return ResponseEntity.ok(updatedCompanyDTO);
	}
}