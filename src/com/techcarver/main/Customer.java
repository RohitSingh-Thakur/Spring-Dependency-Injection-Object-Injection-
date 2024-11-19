package com.techcarver.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techcarver.entity.Shop;

public class Customer {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/techcarver/resources/applicationContext.xml");
		Shop customer1 = context.getBean("customer1", Shop.class);
		customer1.tv();
		
		Shop customer2 = context.getBean("customer2", Shop.class);
		customer2.mobile();
	}
}




