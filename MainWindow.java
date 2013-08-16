/*
 * MainWindow for the CHALK application
 * @author Zakaria Zakaria and Moukangwe Katlego
 */
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import javax.swing.*;
import java.util.*;
import java.util.List;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;

/*
 * workspace is the variable for the working or the right.
 * buttonBar is the panel on the left which has icons for specific functions.
 * a single listener is used for events on the menu-bar.
 */
public class MainWindow extends JFrame {
	
	
	private static JPanel workspace;
	private JPanel buttonBar = new JPanel();
	private static String pathToImage = "/Users/KatlegoMoukangwe/Downloads/image/32x32/";
	public int xPos = 0;
	public int yPos = 0;
	private int a = 20;
	//demo nodes
	private Ellipse2D ellipse;
	private Ellipse2D ellipse2;
	private Ellipse2D ellipse3;
	
	/*
	 * The constructor creates menubar items, images icons and sets the icons on Jbutton on the left panel
	 */
	public MainWindow(){
		super();
		setTitle("CHALK");
		setExtendedState(Frame.MAXIMIZED_BOTH);  
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new BorderLayout());
		JPanel main = new JPanel();
		main.setLayout(new BorderLayout());
		buttonBar.setBackground(Color.white);
		buttonBar.setPreferredSize(new Dimension(85,200));
		
		Listener buttonEar = new Listener();
		JMenuBar mainM = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenu Help = new JMenu("Help");
		
		JMenuItem newt = new JMenuItem("New");
		JMenuItem open = new JMenuItem("Open");
		JMenuItem save = new JMenuItem("Save");
		JMenuItem close = new JMenuItem("Close");
		
		newt.addActionListener(buttonEar);
		open.addActionListener(buttonEar);
		save.addActionListener(buttonEar);
		close.addActionListener(buttonEar);
		
		file.add(newt);
		file.add(open);
		file.add(save);
		file.add(close);
		
		mainM.add(file);
		mainM.add(Help);
		setJMenuBar(mainM);
		
		ImageIcon nodeImage = new ImageIcon(pathToImage+"node.jpg","one node");
		ImageIcon directedArrowImage = new ImageIcon(pathToImage+"rightarrow.png","Right arrow");
		ImageIcon directedArrowImage2 = new ImageIcon(pathToImage+"leftarrow.png","Left arrow");
		ImageIcon undirectedArrowImage = new ImageIcon(pathToImage+"undirectedarrow.png","undirectedarrow");
		ImageIcon undirectedArrowImage2 = new ImageIcon(pathToImage+"undirectedarrow2.png","undirectedarrow2");
		ImageIcon deleteImage = new ImageIcon(pathToImage+"delete.jpg","delete image");
		ImageIcon textImage = new ImageIcon(pathToImage+"text.jpg","text");
		
		JButton node = new JButton(new ImageIcon(getScaledImage(nodeImage.getImage(),40,40)));
		JButton directedArrow = new JButton(new ImageIcon(getScaledImage(directedArrowImage.getImage(),40,40)));
		JButton directedArrow2 = new JButton(new ImageIcon(getScaledImage(directedArrowImage2.getImage(),35,35)));
		JButton undirectedArrow = new JButton(new ImageIcon(getScaledImage(undirectedArrowImage.getImage(),35,35)));
		JButton undirectedArrow2 = new JButton(new ImageIcon(getScaledImage(undirectedArrowImage2.getImage(),35,35)));
		JButton text = new JButton(new ImageIcon(getScaledImage(textImage.getImage(),35,35)));
		JButton delete = new JButton(new ImageIcon(getScaledImage(deleteImage.getImage(),35,35)));
		
		node.setBackground(Color.white);
		directedArrow.setBackground(Color.WHITE);
		undirectedArrow.setBackground(Color.white);
		text.setBackground(Color.white);
		delete.setBackground(Color.white);
		directedArrow2.setBackground(Color.white);
		undirectedArrow2.setBackground(Color.white);
		
		buttonBar.add(node);
		buttonBar.add(directedArrow);
		buttonBar.add(undirectedArrow);
		buttonBar.add(directedArrow2);
		buttonBar.add(undirectedArrow2);
		buttonBar.add(undirectedArrow);
		buttonBar.add(text);
		buttonBar.add(delete);

		//Mouselistener for dragging and dropping.
		MouseListener mouselistener = new MouseListener();
		add(buttonBar,BorderLayout.WEST);
		workspace = new JPanel() {
		    public void paint(Graphics g) {
		    	Graphics2D g2D = (Graphics2D) g;
		    	ellipse = new Ellipse2D.Double(xPos, yPos, 40, 40);
		    	ellipse3 = new Ellipse2D.Double(xPos+a-60-20,yPos+2*a+60-20,40,40);
		    	ellipse2 = new Ellipse2D.Double(xPos+a+60-20,yPos+2*a+60-20,40,40);
		    	
		    	g2D.fill(ellipse);
		    	g2D.drawLine(xPos + a, yPos + 2*a, xPos + a + 60, yPos + 2*a + 60);
		    	g2D.drawLine(xPos + a ,yPos + 2*a ,xPos + a - 60,yPos + 2*a + 60);
		    	g2D.fill(ellipse2);
		    	g2D.fill(ellipse3);
		    }
		    
			
		};
		this.addMouseMotionListener(mouselistener);
		add(workspace,BorderLayout.CENTER);
	}
	//Method used for re-scalling images to specified dimensions. 
	//Uses BufferedImage and then redraws to new Image
    private Image getScaledImage(Image srcImg, int w, int h){
        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = resizedImg.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, w, h, null);
        g2.dispose();
        return resizedImg;
    }
    
    class MouseListener implements MouseMotionListener {

    	public MouseListener() {
    	}
    	
    	//Get mouse drag coordinates and then repaint.
    	public void mouseDragged(MouseEvent arg0) {
    		xPos = arg0.getX() - 103;
    		yPos = arg0.getY() - 64;
    		repaint();
    	}

    	//need to be overwritten if class implements MouseMotionListener.
    	public void mouseMoved(MouseEvent arg0) {
    		
    	}
    	
    }
}