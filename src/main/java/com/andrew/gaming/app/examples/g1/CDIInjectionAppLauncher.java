package com.andrew.gaming.app.examples.g1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
class BusinessService
{
	private DataService dataService;

	public DataService getDataService() {
		return dataService;
	}

	@Inject
	public void setDataService(DataService dataService) 
	{
		System.out.println("Setter Injection");
		this.dataService = dataService;
	}
}

@Named
class DataService
{}

@Configuration
@ComponentScan("com.andrew.gaming.app.examples.g1")
public class CDIInjectionAppLauncher 
{
	public static void main(String[] args) 
	{
		try (var context = new AnnotationConfigApplicationContext(CDIInjectionAppLauncher.class)) 
		{
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean(BusinessService.class));
		}
	}
}