package com.bridgelabz.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bridgelabz.demo.component.DemoBean;
import com.bridgelabz.demo.component.EmployeeBean;

@SpringBootApplication
public class SpringBootLoggerApplication {

	public static final Logger logger = LoggerFactory.getLogger(SpringBootLoggerApplication.class);
	
	public static void main(String[] args)
	{
		
		logger.info("Welcome to Spring Concept Demo");
		ApplicationContext context = SpringApplication .run(SpringBootLoggerApplication.class, args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		logger.debug("Demo Bean= "+demoBean.toString());
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEid(104);
		employeeBean.setEname("Pratik Hajare");
		employeeBean.showEmployeeDetails();
	}

}
