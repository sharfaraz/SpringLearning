package com.peer.pkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		Point p = (Point) applicationContext.getBean("Point10");
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		Calculator cal = (Calculator) applicationContext.getBean("calc");
		System.out.println(cal.add());
		System.out.println(cal.subtract());
		System.out.println(cal.multiply());
		System.out.println(cal.divide());
	}

}
