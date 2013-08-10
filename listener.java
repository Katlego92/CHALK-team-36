import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.io.*;
//import java.nio.file.FileAlreadyExistsException;

public class listener implements ActionListener{
	//firstwindow i = new firstwindow();
	public void actionPerformed(ActionEvent e){
		String buttonstring = e.getActionCommand();
		if (buttonstring.equals("New"))
			(firstwindow.workspace).setBackground(Color.white);
		else if(buttonstring.equals("Save")){
			JFileChooser save = new JFileChooser();
			int val = save.showOpenDialog(null);
			if (val == JFileChooser.APPROVE_OPTION){
				File file = save.getSelectedFile();
				File dir = save.getCurrentDirectory();
				String dirname = save.getDescription(dir);
				String filename = file.getName();
				
				try {
					file.createNewFile();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
			
		}
		
		else if (buttonstring.equals("Open")){
			JFileChooser open = new JFileChooser();
			open.showOpenDialog(null);
		}
		else if(buttonstring.equals("Close"))
			System.exit(0);
			
		/*if (buttonstring.equals("white"))
			(firstwindow.white).setBackground(Color.white);
		if (buttonstring.equals("green"))
			(firstwindow.grey).setBackground(Color.green);*/
		//System.exit(0);
	}

}
