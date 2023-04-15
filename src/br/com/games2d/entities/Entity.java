package br.com.games2d.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Entity {
	private int x, y, width, height;
	private BufferedImage sprite;

	public Entity(int x, int y, int width, int height, BufferedImage sprite) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.sprite = sprite;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void render(Graphics gf) {
		gf.drawImage(sprite, this.getX(), this.getY(), null);

	}
}
