package com.andrew.gaming.app.examples.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class BusinessClass
{
	
	Dependency1 dep1;
	
	Dependency2 dep2;
	
	public BusinessClass(Dependency1 dep1, Dependency2 dep2) 
	{
		super();
		this.dep1 = dep1;
		this.dep2 = dep2;
		
		System.out.println("Dependency1 Constructor Injection");
		System.out.println("Dependency2 Constructor Injection");
	}

//	@Autowired
//	public void setDep1(Dependency1 dep1) 
//	{
//		System.out.println("Dependency1 Setter Injection");
//		this.dep1 = dep1;
//	}
//
//	@Autowired
//	public void setDep2(Dependency2 dep2) 
//	{
//		System.out.println("Dependency2 Setter Injection");
//		this.dep2 = dep2;
//	}

	public String toString()
	{
		return "Using " + dep1 + " and " + dep2; 
	}
}

@Component
class Dependency1
{
	
}

@Component
class Dependency2
{
	
}

@Configuration
@ComponentScan("com.andrew.gaming.app.examples.a1")
public class DepInjectionGamingAppLauncher {

	public static void main(String[] args) 
	{
		try (var context = new AnnotationConfigApplicationContext(DepInjectionGamingAppLauncher.class)) 
		{
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean(BusinessClass.class));
		}
	}
}