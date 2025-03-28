package views;
import java.awt.event.*;

import javax.swing.*;
public class Panel_Up extends JPanel{
	private JTextField fieldFilter;
	private ButtonGroup group;
	private JRadioButton filter,delete;
	Panel_Down down;
	public Panel_Up() {
		add(new JLabel("Ruta:"));
		fieldFilter=new JTextField(24);
		Frame.setStyle(fieldFilter);
		group=new ButtonGroup();
		filter=new JRadioButton("Filtrar");
		filter.setActionCommand("Filtrar");
		filter.setSelected(true); 
		delete=new JRadioButton("Borrar");
		delete.setActionCommand("Borrar"); 
		group.add(filter);
		group.add(delete);
		Frame.setStyle(delete);
		Frame.setStyle(filter);
		add(fieldFilter);
		add(filter);
		add(delete); 
	}
	public JTextField getField() {
		return fieldFilter;
	}
	public JRadioButton getRadio(int x) {
		return x==0?filter:delete; 
	}
}