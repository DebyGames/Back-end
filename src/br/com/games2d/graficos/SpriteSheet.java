package br.com.games2d.graficos;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class SpriteSheet {
	private static BufferedImage spriteSheet;
	public static BufferedImage spriteCapy;
	
	public SpriteSheet() {
		try {
			spriteSheet = ImageIO.read(getClass().getResource("./res/capy.png"));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Caminho não encontrado");
		}
		spriteCapy = SpriteSheet.getSprite(0,11,16,16);
	}
	public static BufferedImage getSprite(int x, int y, int width, int height) {
		return spriteSheet.getSubimage(x, y, width, height);
	}

}
