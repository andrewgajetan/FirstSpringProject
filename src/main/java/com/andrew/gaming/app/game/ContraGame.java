package com.andrew.gaming.app.game;

import org.springframework.stereotype.Component;

@Component
public class ContraGame implements GamingConsole {

	@Override
	public void up()
	{
		System.out.println("FORWARD");
	}

	@Override
	public void down() 
	{
		System.out.println("BACKWARD");
	}

	@Override
	public void left() 
	{
		System.out.println("LEFT");
	}

	@Override
	public void right() 
	{
		System.out.println("RIGHT");
	}
}
