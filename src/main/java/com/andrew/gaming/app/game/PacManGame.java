package com.andrew.gaming.app.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PacManQualifier")
public class PacManGame implements GamingConsole {

	@Override
	public void up()
	{
		System.out.println("Go Forward");
	}

	@Override
	public void down() 
	{
		System.out.println("Go Backward");
	}

	@Override
	public void left() 
	{
		System.out.println("Move Left");
	}

	@Override
	public void right() 
	{
		System.out.println("Move Right");
	}

}
