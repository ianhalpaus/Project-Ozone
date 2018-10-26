package com.ozone.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class PurpleEnemy extends GameObject{

	private Handler handler;
	
	public PurpleEnemy(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		
		this.handler = handler;
		
		velX = 2;
		velY = 2;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick() {
		x += velX;
		y += velY;
		
		if(y<0 || y>= Game.HEIGHT -40) velY *= -1; 
		if(x<0 || x>= Game.WIDTH -16) velX *= -1;
		
		handler.addObject(new Trail(x, y, ID.Trail, Color.MAGENTA, 7, 7, 0.01f, handler));
		
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.MAGENTA);
		g.fillRect(x, y, 7, 7);
	}

	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return new Rectangle(x, y, 7, 7);
	}

}
