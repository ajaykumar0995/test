package mapper;

import java.util.List;
import java.util.Set;

import dto.CompanyDTO;
import entity.Company;

public interface CompanyMapper {

	static CompanyDTO getCompanyDTO(Company entity) {
		// TODO Auto-generated method stub
		return null;
	}

	List<CompanyDTO> getCompanyDTOList(List<Company> entityList);

	Set<CompanyDTO> getCompanyDTOSet(Set<Company> entitySet);

	Company getCompany(CompanyDTO dto);
}
