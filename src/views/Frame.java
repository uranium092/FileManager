package views;

import java.awt.Color;

import javax.swing.*;

public class Frame extends JFrame{
	public Frame() {
		setBounds(200,100,480,330);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new ViewContainer(new FramePopup()));  
		setVisible(true); 
	}
	public static void setStyle(JComponent e) {
		e.setBackground(Color.black);
		e.setForeground(Color.white); 
	}
}
class FramePopup extends JFrame{
	public FramePopup(){
		setBounds(675,100+330/4,330,330/2);
	}
}