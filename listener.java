//import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.io.*;


public class Listener implements ActionListener{
	/*
	 * listened to action pressed and give response
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	public void actionPerformed(ActionEvent e){
		String buttonstring = e.getActionCommand();
		if (buttonstring.equals("New"))
			;
		else if(buttonstring.equals("Save")){
			JFileChooser save = new JFileChooser();
			int val = save.showSaveDialog(null); // open save dialogbox
			if (val == JFileChooser.APPROVE_OPTION){
				File file = save.getSelectedFile();  
				File dir = save.getCurrentDirectory();// save file with give name
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
			open.showOpenDialog(null); // open load dialog box
		}
		else if(buttonstring.equals("Close"))
			System.exit(0); //close window.
			

	}

}
