package spring.core.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.core.Company;

@Configuration
public class SpingConfigFile {


	@Bean
	public Company company() {
		Company comp = new Company();
		comp.setCompanyId(684635);
		comp.setCompanyName("ACCENTURE SOLUTION PVT LTD");
		comp.setCompanyAddress("Phase 1 Pune");
		comp.setCompanyProfit(6984696);
		comp.setCompanyCEO("Jwelly Sweet");
		System.out.println("Company Details-" + comp);
		return comp;
	}
	
	
	@Bean("companyBeanObj")
	public Company company1() {
		Company comp = new Company();
		comp.setCompanyId(684635);
		comp.setCompanyName("Infosys PVT LTD");
		comp.setCompanyAddress("Phase 3 Pune");
		comp.setCompanyProfit(1000);
		comp.setCompanyCEO("S K Murthy");
		System.out.println("Company Details-" + comp);
		return comp;
	}
	
	
	@Bean("companyBeanObj2")
	public Company company2() {
		Company comp = new Company();
		comp.setCompanyId(4635);
		comp.setCompanyName("TCc");
		comp.setCompanyAddress("Phase 3 Pune");
		comp.setCompanyProfit(1300);
		comp.setCompanyCEO("TaTa group");
		System.out.println("Company Details-" + comp);
		return comp;
	}

}
