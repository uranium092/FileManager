package views;

import java.awt.*;

import javax.swing.*;

public class ViewContainer extends JPanel{
	public ViewContainer(JFrame Popup){ 
		setLayout(new BorderLayout());
		add(new JPanel(),BorderLayout.WEST);
		add(new JPanel(),BorderLayout.EAST);
		JTextArea write=new JTextArea();
		Frame.setStyle(write); 
		write.setEditable(false);
		add(new JScrollPane(write)); 
		Panel_Up up=new Panel_Up();
		add(up,BorderLayout.NORTH);
		Panel_Down down=new Panel_Down(up.getField(),up.getRadio(0),up.getRadio(1),write,Popup);  
		add(down,BorderLayout.SOUTH);
	}
}