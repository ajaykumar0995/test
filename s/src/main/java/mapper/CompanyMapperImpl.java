package mapper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import dto.CompanyDTO;
import entity.Company;

public class CompanyMapperImpl implements CompanyMapper {

    public CompanyDTO getCompanyDTO(Company entity) {
        CompanyDTO dto = new CompanyDTO();
        dto.setId(entity.getId());
        dto.setCompanyName(entity.getCompanyName());
        dto.setEmail(entity.getEmail());
        dto.setStrength(entity.getStrength());
        dto.setWebsireURL(entity.getWebsiteURL()); // Corrected typo in method name
        return dto;
    }

    @Override
    public List<CompanyDTO> getCompanyDTOList(List<Company> entityList) {
        List<CompanyDTO> dtoList = new ArrayList<>();
        for (Company entity : entityList) {
            dtoList.add(getCompanyDTO(entity));
        }
        return dtoList;
    }

    @Override
    public Set<CompanyDTO> getCompanyDTOSet(Set<Company> entitySet) {
        Set<CompanyDTO> dtoSet = new HashSet<>();
        for (Company entity : entitySet) {
            dtoSet.add(getCompanyDTO(entity));
        }
        return dtoSet;
    }

    @Override
    public Company getCompany(CompanyDTO dto) {
        Company entity = new Company();
        entity.setId(dto.getId());
        entity.setCompanyName(dto.getCompanyName());
        entity.setEmail(dto.getEmail());
        entity.setStrength(dto.getStrength());
        entity.setWebsiteURL(dto.getWebsireURL()); // Corrected typo in method name
        return entity;
    }
}