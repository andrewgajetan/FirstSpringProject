package com.andrew.gaming.app.examples.f1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@Configuration
@ComponentScan("com.andrew.gaming.app.examples.f1")
public class PrePostAnnotationAppLauncher 
{
	@Component
	public class SomeClass
	{
		Somedependency somedependency;
		
		public SomeClass(Somedependency somedependency)
		{
			super();
			this.somedependency = somedependency; 
			
			System.out.println("Some Dependency");
		}
		
		@PostConstruct
		public void initialize()
		{
			somedependency.getReady();
		}
		
		@PreDestroy
		public void cleanUp()
		{
			System.out.println("Cleaned Up");
		}
	}
	
	@Component
	public class Somedependency
	{

		public void getReady() 
		{
			System.out.println("Object got ready");
		}
	}
	
	public static void main(String[] args) 
	{
		try (var context = new AnnotationConfigApplicationContext(PrePostAnnotationAppLauncher.class)) 
		{
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}
}