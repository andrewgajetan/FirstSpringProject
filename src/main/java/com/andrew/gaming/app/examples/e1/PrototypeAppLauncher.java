package com.andrew.gaming.app.examples.e1;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Configuration
@ComponentScan
public class PrototypeAppLauncher 
{
	@Component
	public class NormalClass
	{
		
	}
	
	@Component
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public class PrototypeClass
	{
		
	}
	
	public static void main(String[] args) 
	{
		try (var context = new AnnotationConfigApplicationContext(PrototypeAppLauncher.class)) 
		{
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}
}