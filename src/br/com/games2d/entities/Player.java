package br.com.games2d.entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import br.com.games2d.graficos.SpriteSheet;

public class Player extends Rectangle {

	private static final long serialVersionUID = 1L;

	public boolean up, down, left, right;
	public int spd = 4;

	public Player(int x, int y) {
		super(x, y, 32, 32);
	}

	public Player(int x, int y, int width, int height, BufferedImage sprite) {

	}

	public void tick() {
		if (right) {
			x += spd;
		} else if (left) {
			x -= spd;
		}
		if (up) {
			y -= spd;
		} else if (down) {
			y += spd;
		}
	}

//Render do player
	public void render(Graphics gf) {
//		gf.setColor(Color.green);
//		gf.fillRect(x, y, width, height);
		gf.drawImage(SpriteSheet.spriteCapy, x, y, 32, 32, null);
	}
}
