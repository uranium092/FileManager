package Brain;

import java.io.*;

import javax.swing.*;

public class Come_On {
	public static void Kernel(boolean isDelete,File file, JTextArea area,String inside){
		for(String x:file.list()) {
			if(new File(file.getAbsolutePath()+"/"+x).isDirectory()) {
				File fileT=new File(file.getAbsoluteFile()+"/"+x);
				if(isDelete==false) {
					area.setText(area.getText()+inside+"         "+x+" <dir>:\n");
				}
				Kernel(isDelete,fileT,area,inside+"         ");
			}else {
				if(isDelete) {
					new File(file.getAbsoluteFile()+"/"+x).delete();
				}else {
					area.setText(area.getText()+inside+x+"\n");
				}
			}
		}
		if(isDelete) {
			file.delete();
		}
		
	}
}