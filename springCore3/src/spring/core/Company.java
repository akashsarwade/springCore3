package spring.core;

import org.springframework.stereotype.Component;

@Component
public class Company {

	private int companyId;
	private String companyName;
	private String companyAddress;
	private String companyCEO;
	private int companyProfit;

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyCEO() {
		return companyCEO;
	}

	public void setCompanyCEO(String companyCEO) {
		this.companyCEO = companyCEO;
	}

	public int getCompanyProfit() {
		return companyProfit;
	}

	public void setCompanyProfit(int companyProfit) {
		this.companyProfit = companyProfit;
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", companyAddress=" + companyAddress
				+ ", companyCEO=" + companyCEO + ", companyProfit=" + companyProfit + "]";
	}

}
