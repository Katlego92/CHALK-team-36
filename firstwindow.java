import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

import java.awt.*;

public class firstwindow extends JFrame {
	public static final int W = 600;
	public static final int H = 500;
	
	public static JPanel workspace;
	public static JPanel white;
	public static JPanel grey;
	public static JTextField trial ;
	public firstwindow(){
		super();
		setTitle("CHALK");
		setSize(W,H);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Label
		/*
		 * MEnu
		 */
		listener buttonEar = new listener();
		JMenuBar mainM = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenu Help = new JMenu("Help");
		JMenuItem newt = new JMenuItem("New");
		newt.addActionListener(buttonEar);
		JMenuItem open = new JMenuItem("Open");
		open.addActionListener(buttonEar);
		JMenuItem save = new JMenuItem("Save");
		save.addActionListener(buttonEar);
		JMenuItem close = new JMenuItem("Close");
		close.addActionListener(buttonEar);
		file.add(newt);
		file.add(open);
		file.add(save);
		file.add(close);
		mainM.add(file);
		mainM.add(Help);
		setJMenuBar(mainM);
	
		trial = new JTextField("Enter text here:", 40);
		//setLayout(new BorderLayout());
		JPanel main = new JPanel();
		main.setLayout(new BorderLayout());
		JPanel drawings = new JPanel();
		drawings.setBackground(Color.cyan);
		drawings.setPreferredSize(new Dimension(70,200));
		workspace = new JPanel();
		workspace.setBackground(Color.gray);
		main.add(drawings, BorderLayout.WEST);
		main.add(workspace, BorderLayout.CENTER);
		add(main);
		/*main.setLayout(new GridLayout(1,3));
		
		blue = new JPanel();
		blue.setBackground(Color.GRAY);
		main.add(blue);
		white = new JPanel();
		white.setBackground(Color.GRAY);
		main.add(white);
		grey = new JPanel();
		grey.setBackground(Color.GRAY);
		main.add(grey);
		add(main, BorderLayout.CENTER);
		
		JPanel buttonp = new JPanel();
		JButton blueb = new JButton("blue");
		listener buttonEar = new listener();
		blueb.addActionListener(buttonEar);
		blueb.setBackground(Color.blue);
		JButton greyb = new JButton("green");
		greyb.setBackground(Color.green);
		greyb.addActionListener(buttonEar);
	//	listener buttonEar = new listener();
		blueb.addActionListener(buttonEar);
		JButton whiteb = new JButton("white");
		whiteb.setBackground(Color.white);
	//	listener buttonEar = new listener();
		whiteb.addActionListener(buttonEar);
		buttonp.add(blueb);
		buttonp.add(whiteb);
		buttonp.add(greyb);
		*/
		
		
		//add(buttonp, BorderLayout.SOUTH);
		
	}

}

