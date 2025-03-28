package views;

import java.awt.*;
import java.awt.Color;


import java.awt.event.*;
import java.io.*;

import javax.swing.*;

import services.*;
public class Panel_Down extends JPanel{
	private JButton filter=new JButton("Filtrar");
	private JTextField field;
	private JTextArea infoArea;
	public Panel_Down(JTextField e,JRadioButton b1,JRadioButton b2,JTextArea area,JFrame PopUp) {
		field=e;
		infoArea=area;
		JTextField getPath=new JTextField(28); 
		Frame.setStyle(getPath); 
		JButton Open=new JButton("Abrir");
		Open.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().open(new File(getPath.getText()));
				}catch(Exception exp) {
					
				}
			}
		});
		Frame.setStyle(Open);
		JPanel Container=new JPanel();
		Container.setLayout(new BorderLayout());
		Container.add(new JLabel("Ruta:",JLabel.CENTER),BorderLayout.NORTH);
		JPanel ContField=new JPanel();
		ContField.add(getPath);
		Container.add(ContField);
		Container.add(Open,BorderLayout.SOUTH);
		PopUp.add(Container);
		b1.addActionListener(new Listener(b1.getActionCommand()));
		b2.addActionListener(new Listener(b2.getActionCommand()));
		JButton clear=new JButton("Limpiar");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				area.setText("");
			}
		});
		filter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent o) {
				area.setText("");
				File file=new File(field.getText());
				if(filter.getActionCommand().equals("Borrar")) {
					PopUp.setVisible(false);
					if(file.exists()==false) setMessageInfoArea(new Color(115,115,115),"Ruta inexistente"); 
					else {
						setMessageInfoArea(Color.black,"Ok."); 
						if(file.isDirectory()) {
							FileManager.executeFileOperation(true,file,null,"");
						}else {
							file.delete();
						}
					}
				}else {
					if(file.exists()==false||file.isDirectory()==false) setMessageInfoArea(new Color(115,115,115),"-ERROR- Ruta inexistente, y/o hay fichero en vez de directorio...");
					else {
						field.setBackground(Color.black);
						area.setText("<root> "+file.getName()+"\n.\n");
						FileManager.executeFileOperation(false,file,infoArea,"");
					}
					if(file.exists()) {
						getPath.setText(file.getAbsolutePath());
						PopUp.setVisible(true);
					}
				}
			}
		});
		add(filter);
		add(clear);
		Frame.setStyle(clear);
		Frame.setStyle(filter);
	}
	private void setMessageInfoArea(Color color,String text) {
		field.setBackground(color);
		infoArea.setText(text); 
	}
	private class Listener implements ActionListener{
		private String textButon;
		public Listener(String textButon) {
			this.textButon=textButon;
		}
		public void actionPerformed(ActionEvent e) {
			filter.setText(textButon); 
		}
		
	}
}