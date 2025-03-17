package G_Interface;
import java.awt.event.*;

import javax.swing.*;
public class Panel_Up extends JPanel{
	private JTextField input;
	private ButtonGroup group;
	private JRadioButton filter,del;
	Panel_Down down;
	public Panel_Up() {
		add(new JLabel("Ruta:"));
		input=new JTextField(24);
		Frame.setStyle(input);
		group=new ButtonGroup();
		filter=new JRadioButton("Filtrar");
		filter.setActionCommand("Filtrar");
		filter.setSelected(true); 
		del=new JRadioButton("Borrar");
		del.setActionCommand("Borrar"); 
		group.add(filter);
		group.add(del);
		Frame.setStyle(del);
		Frame.setStyle(filter);
		add(input);
		add(filter);
		add(del); 
	}
	public JTextField getField() {
		return input;
	}
	public JRadioButton getRadio(int x) {
		return x==0?filter:del; 
	}
}