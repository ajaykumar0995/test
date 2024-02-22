package dto;

public class CompanyDTO {

	private Long id;
	private String companyName;
	private String email;
	private Integer strength;
	private String websireURL;

	@Override
	public String toString() {
		return "CompanyDTO [id=" + id + ", companyName=" + companyName + ", email=" + email + ", strength=" + strength
				+ ", websireURL=" + websireURL + "]";
	}

	public CompanyDTO() {
		super();
	}

	public CompanyDTO(Long id, String companyName, String email, Integer strength, String websireURL) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.email = email;
		this.strength = strength;
		this.websireURL = websireURL;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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

	public String getWebsireURL() {
		return websireURL;
	}

	public void setWebsireURL(String websireURL) {
		this.websireURL = websireURL;
	}
}
