import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

import java.util.*;
import java.util.List;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;

public class MainWindow extends JFrame {
	
	public static JPanel workspace;
	public static JPanel white;
	public static JPanel grey;
	public JPanel buttonBar = new JPanel();
	private static String pathToImage = "/Users/KatlegoMoukangwe/Downloads/image/32x32/";
	
	public MainWindow(){
		super();
		setTitle("CHALK");
		setExtendedState(Frame.MAXIMIZED_BOTH);  
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		// initialise menubar
		MenuBar menubar = new MenuBar();
		setJMenuBar(menubar);
		setLayout(new BorderLayout());
		JPanel main = new JPanel();
		main.setLayout(new BorderLayout());
		//drawings = new JPanel();
		buttonBar.setBackground(Color.white);
		buttonBar.setPreferredSize(new Dimension(85,200));
		//Icon Images
		
		ImageIcon nodeImage = new ImageIcon(pathToImage+"node.jpg","one node");
		ImageIcon directedArrowImage = new ImageIcon(pathToImage+"arrow.png","arrow");
		ImageIcon undirectedArrowImage = new ImageIcon(pathToImage+"undirectedarrow.jpg","undirectedarrow");
		ImageIcon directedTrieImage = new ImageIcon(pathToImage+"directed.png","directed trie");
		ImageIcon undirectedTrieImage = new ImageIcon(pathToImage+"undirected.png","undirected trie");
		
		JButton node = new JButton(new ImageIcon(getScaledImage(nodeImage.getImage(),32,32)));
		JButton directedArrow = new JButton(new ImageIcon(getScaledImage(directedArrowImage.getImage(),32,32)));
		JButton undirectedArrow = new JButton(new ImageIcon(getScaledImage(undirectedArrowImage.getImage(),32,32)));
		JButton directedTrie = new JButton(new ImageIcon(getScaledImage(directedTrieImage.getImage(),32,32)));
		JButton undirectedTrie = new JButton(new ImageIcon(getScaledImage(undirectedTrieImage.getImage(),32,32)));
		
		buttonBar.add(node);
		buttonBar.add(directedArrow);
		buttonBar.add(undirectedArrow);
		buttonBar.add(undirectedArrow);
		buttonBar.add(directedTrie);
		buttonBar.add(undirectedTrie);
		
		add(buttonBar,BorderLayout.WEST);
		workspace = new JPanel();
		add(workspace,BorderLayout.CENTER);
	}
    private Image getScaledImage(Image srcImg, int w, int h){
        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = resizedImg.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, w, h, null);
        g2.dispose();
        return resizedImg;
    }
}