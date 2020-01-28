package pixel;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.w3c.dom.css.RGBColor;

public class main {
	public static void main(String[]args)
	{
		main m = new main();
		m.image();
	}
	public void image()
	{
		File imagem = new File("challenge_strider.png");
		Color cor;
		int vermelhos = 0;
		try {
			BufferedImage buff = ImageIO.read(imagem);
			for(int i = 0; i < buff.getWidth(); i++)
			{
				for(int j = 0; j < buff.getHeight(); j++)
				{
					cor = new Color(buff.getRGB(i, j));
					if(cor.getRGB() == Color.red.getRGB())
					{
						vermelhos++;
					}
				}
			}
			System.out.println("A quantidade de de pixels vermelhos é de: " + vermelhos);
		}
		catch(IOException ex){
			System.out.println("Erro"+ex);
		}
	}
}
