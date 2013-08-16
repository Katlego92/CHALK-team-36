
import java.awt.event.*;

import javax.swing.*;

public class MenuBar extends JMenuBar implements ActionListener 
{
	public MenuBar()
	{
		super();
		JMenu file = new JMenu("File");
		JMenuItem newt = new JMenuItem("New");
		newt.addActionListener(this);
		JMenuItem open = new JMenuItem("Open");
		open.addActionListener(this);
		JMenuItem save = new JMenuItem("Save");
		save.addActionListener(this);
		JMenuItem close = new JMenuItem("Close");
		close.addActionListener(this);
		file.add(newt);
		file.add(open);
		file.add(save);
		file.add(close);
		add(file);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		//
	}
	
}