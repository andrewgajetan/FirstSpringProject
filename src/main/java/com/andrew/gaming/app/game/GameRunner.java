package com.andrew.gaming.app.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner 
{
	private GamingConsole console;
	
	public GameRunner(@Qualifier("PacManQualifier") GamingConsole aConsole)
	{
		console = aConsole;
	}
	
	public void run()
	{
		console.up();
		console.down();
		console.left();
		console.right();
	}
	
}
