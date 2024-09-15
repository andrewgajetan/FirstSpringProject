package com.andrew.gaming.app.examples.h1;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.andrew.gaming.app.game.GameRunner;

public class XMLContextAppLauncher 
{
	public static void main(String[] args) 
	{
		try (var context = new ClassPathXmlApplicationContext("contextConfiuration.xml")) 
		{
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			
			context.getBean(GameRunner.class).run();
		}
	}
}