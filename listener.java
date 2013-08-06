import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;;

public class listener implements ActionListener{
	//firstwindow i = new firstwindow();
	public void actionPerformed(ActionEvent e){
		String buttonstring = e.getActionCommand();
		if (buttonstring.equals("New"))
			(firstwindow.workspace).setBackground(Color.white);
		else if(buttonstring.equals("Close"))
			System.exit(0);
			
		/*if (buttonstring.equals("white"))
			(firstwindow.white).setBackground(Color.white);
		if (buttonstring.equals("green"))
			(firstwindow.grey).setBackground(Color.green);*/
		//System.exit(0);
	}

}
