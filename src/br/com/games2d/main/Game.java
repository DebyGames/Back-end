package br.com.games2d.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

import br.com.games2d.entities.Player;
import br.com.games2d.graficos.SpriteSheet;

public class Game extends Canvas implements Runnable, KeyListener {

	private static final long serialVersionUID = 1L;

	public static int WIDTH = 480, HEIGHT = 480;
	public Player player;

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

//Construtor game
	public Game() {
		this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		this.addKeyListener(this);
		new SpriteSheet();
		player = new Player(0, 0);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

//Tecla clicada
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			player.right = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			player.left = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			player.up = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			player.down = true;
		}

	}

//Tecla soltada
	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			player.right = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			player.left = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			player.up = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			player.down = false;
		}

	}

	@Override
	public void run() {
		while (true) {
			tick();
			render();
			try {
				Thread.sleep(1000 / 120);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

//Metodo Tick
	public void tick() {
		player.tick();
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
		player.render(gf);
		bs.show();
	}

}
