package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "company")
public class Company extends Base {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@Override
	public String toString() {
		return "Company [id=" + id + ", CompanyName=" + CompanyName + ", email=" + email + ", strength=" + strength
				+ ", websiteURL=" + websiteURL + "]";
	}

	public Company() {
		super();
	}

	public Company(Long id, String companyName, String email, Integer strength, String websiteURL) {
		super();
		this.id = id;
		CompanyName = companyName;
		this.email = email;
		this.strength = strength;
		this.websiteURL = websiteURL;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getStrength() {
		return strength;
	}

	public void setStrength(Integer strength) {
		this.strength = strength;
	}

	public String getWebsiteURL() {
		return websiteURL;
	}

	public void setWebsiteURL(String websiteURL) {
		this.websiteURL = websiteURL;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "company_name")
	private String CompanyName;
	@Column(name = "email")
	private String email;
	@Column(name = "strength")
	private Integer strength;
	@Column(name = "website_url")
	private String websiteURL;

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
