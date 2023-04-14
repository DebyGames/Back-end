package br.com.games2d.principal;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable, KeyListener {

	private static final long serialVersionUID = 1L;
	
	public static int WIDTH = 480, HEIGHT = 480;

	public static void main(String[] args) {
		Game jogo = new Game();
		JFrame frame = new JFrame();
		frame.add(jogo);
		frame.setTitle("projeto debygames");
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		new Thread(jogo).start();
	}

	public Game() {
		this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		this.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {

		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {

		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {

		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {

		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {

		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {

		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {

		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {

		}

	}

	@Override
	public void run() {
		while (true) {
			tick();
			render();
			try {
				Thread.sleep(1000 / 60);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void tick() {

	}

	public void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		Graphics gf = bs.getDrawGraphics();
		gf.setColor(Color.black);
		gf.fillRect(0, 0, WIDTH, HEIGHT);
		bs.show();
	}

}
