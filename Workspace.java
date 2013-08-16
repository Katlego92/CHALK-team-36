import java.awt.*;
import javax.swing.*;


public class Workspace extends JPanel {

   private static final int DRAWING_SIZE = 100;
   private static final int SUBDIVISIONS = 2;
   private static final int SUBDIVISION_SIZE = DRAWING_SIZE / SUBDIVISIONS;

   public Workspace() 
   {
      setSize(300, 300);
      setLayout(new GridBagLayout());
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.weightx = 1.0;
      gbc.weighty = 1.0;
      gbc.gridx = 0;
      gbc.gridy = 0;
      JLabel drawingBoard = new JLabel("Drawing Board");
      gbc.anchor = GridBagConstraints.SOUTH;
      drawingBoard.setFont(new Font("Serif", Font.BOLD, 28));
      add(drawingBoard, gbc);
      
      setPreferredSize(new Dimension(DRAWING_SIZE, DRAWING_SIZE));
      setBackground(Color.WHITE);
      setBorder(BorderFactory.createLineBorder(Color.BLACK));
      gbc.gridy++;
      gbc.anchor = GridBagConstraints.CENTER;
      add(this, gbc);
      JButton saveDrawing = new JButton("SAVE DRAWING");
      gbc.gridy++;
      gbc.anchor = GridBagConstraints.NORTH;
      add(saveDrawing, gbc);
   }
   
   public void paintComponent(Graphics g) {
       super.paintComponent(g);
       Graphics2D g2 = (Graphics2D) g;
       g2.setPaint(Color.GRAY);
       for (int i = 1; i < SUBDIVISIONS; i++) {
          int x = i * SUBDIVISION_SIZE;
          g2.drawLine(x, 0, x, getSize().height);
       }
       for (int i = 1; i < SUBDIVISIONS; i++) {
          int y = i * SUBDIVISION_SIZE;
          g2.drawLine(0, y, getSize().width, y);
       }
    }
}