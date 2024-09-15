package com.andrew.gaming.app.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Configuration
@ComponentScan
public class LazyInitializationGamingAppLauncher 
{
	@Component
	public class ClassA
	{
		
	}
	
	@Component
	@Lazy
	public class ClassB
	{
		ClassA classA;
		
		public ClassB(ClassA classA)
		{
			System.out.println("Class B initialization !!!");
			
			this.classA = classA;
		}
		
		public void doSomething()
		{
			System.out.println("Doing Somehing !!!");
		}
	}
	
	public static void main(String[] args) 
	{
		try (var context = new AnnotationConfigApplicationContext(LazyInitializationGamingAppLauncher.class)) 
		{
			System.out.println("Context Load Completed !!!");
			
			context.getBean(ClassB.class).doSomething();
		}
	}
}