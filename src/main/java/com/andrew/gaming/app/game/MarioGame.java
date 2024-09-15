package com.andrew.gaming.app.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {

	@Override
	public void up()
	{
		System.out.println("JUMP");
	}

	@Override
	public void down() 
	{
		System.out.println("IN TO THE HOLE");
	}

	@Override
	public void left() 
	{
		System.out.println("MOVE BACKWARD");
	}

	@Override
	public void right() 
	{
		System.out.println("MOVE FORWARD");
	}

}
