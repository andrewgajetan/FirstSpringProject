package com.andrew.gaming.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.andrew.gaming.app.game.GameRunner;
import com.andrew.gaming.app.game.GamingConsole;


@Configuration
@ComponentScan("com.andrew.gaming.app.game")
public class GamingAppLauncher {

	public static void main(String[] args) 
	{
		try (var context = new AnnotationConfigApplicationContext(GamingAppLauncher.class)) 
		{
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
	}
}