package com.philam18.demohibernate;

import com.philam18.demohibernate.dao.CircleDAO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;


@ImportResource("com/philam18/demohibernate/spring.xml")
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		CircleDAO db = context.getBean("CircleDAO", CircleDAO.class);
		System.out.println(db.getCircleCount());



	}

}
