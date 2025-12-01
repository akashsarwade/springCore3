package spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.core.resources.SpingConfigFile;

public class Main {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpingConfigFile.class);

		Company c = (Company) context.getBean("company");
		c.toString();
	
		Company c1=(Company) context.getBean("companyBeanObj");
		c1.toString();
		
		Company c2=(Company) context.getBean("companyBeanObj2");
		c1.toString();
		
		
	
	}
}
