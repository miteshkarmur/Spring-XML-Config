package com.infy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Employee emp1=(Employee) context.getBean("emp");
		System.out.println(emp1.getEmpID());
		System.out.println(emp1.getAddress().getCountry());
		System.out.println(emp1.getAddress().getPin());
		context.close();
	}

}
