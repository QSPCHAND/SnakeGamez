package kingCobra;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public class Snake {

	Snake(){
		
	}
	public static void main(String[] args)
	{
       JFrame frame=new JFrame("Snake Game"); 
       frame.setBounds(10, 10, 905, 700);
       frame.setResizable(false);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLocation(300,100);
       
       GamePanel panel=new GamePanel();
       panel.setBackground(Color.DARK_GRAY);
       frame.add(panel);
       
       frame.setVisible(true); 
	}
	

}
