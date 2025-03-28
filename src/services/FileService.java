package services;

import java.io.*;

import javax.swing.*;

public class FileService {
	public static void executeFileOperation(boolean isDelete,File file, JTextArea area,String identationLevel){
		for(String filePath:file.list()) {
			if(new File(file.getAbsolutePath()+"/"+filePath).isDirectory()) {
				File childFile=new File(file.getAbsoluteFile()+"/"+filePath);
				if(isDelete==false) {
					area.setText(area.getText()+identationLevel+"├── "+filePath+"\n");
				}
				executeFileOperation(isDelete,childFile,area,identationLevel+"       ");
			}else {
				if(isDelete) {
					new File(file.getAbsoluteFile()+"/"+filePath).delete();
				}else {
					area.append(identationLevel+"├── "+filePath+"\n");
				}
			}
		}
		if(isDelete) {
			file.delete();
		}
		
	}
}