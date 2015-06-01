import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JComponent.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;



public class BacteriaBattle extends JPanel{
  
  
  private JFrame mainFrame;
  private JPanel backgroundPanel = new JPanel(new BorderLayout());
  private JPanel tronPanel = new JPanel(new BorderLayout());
  //private BufferedImage image;
  ImageIcon image = new ImageIcon("C:/Users/mathe_000/Environment1.png");
  ImageIcon tron = new ImageIcon("C:/Users/mathe_000/TRON.png");
  private JLabel backgroundPicture = new JLabel("",image,JLabel.CENTER);
  private JLabel tronLabel = new JLabel("",tron,JLabel.CENTER);
  
  
  public BacteriaBattle(){
    setupGUI();
     /* try {                
      image = ImageIO.read(new File("C:/Users/mathe_000/TRON.png"));
    } catch (IOException ex) {
      //exception
    }*/
  }
  
  
  //---Entry Point---
  public static void main(String[] args){
    BacteriaBattle back = new BacteriaBattle();
    back.showPanel();
    
  }
  
  
  
  public void setupGUI(){
    mainFrame = new JFrame("BacteriaBattle");
    mainFrame.setSize(1280,720);
    mainFrame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
      }        
    });
    
    backgroundPanel = new JPanel();
    backgroundPanel.setBackground(Color.BLUE);
    backgroundPanel.setLayout(new FlowLayout());
    backgroundPanel.add(backgroundPicture, BorderLayout.PAGE_START);
   
    /*mainFrame.add(backgroundPanel);
    mainFrame.setVisible(true);*/
    
    tronLabel.setPreferredSize(new Dimension(640,480));
    tronPanel.setPreferredSize(new Dimension(640,480));
    tronPanel.setOpaque(false);
    //tronPanel.setBackground(Color.magenta);
    tronPanel.setLayout(new FlowLayout());        
    tronPanel.add(tronLabel,BorderLayout.CENTER);
    
    
    
    mainFrame.add(backgroundPanel); 
    mainFrame.add(tronPanel);
    mainFrame.setVisible(true);
    
  }

  
  public void showPanel(){
    //JPanel panel = new JPanel();
    
    /*panel.setPreferredSize(new Dimension(640, 480));
    panel.setBackground(Color.magenta);
    panel.setLayout(new FlowLayout());        
    panel.add(tronLabel,BorderLayout.CENTER);
    
    
    mainFrame.add(panel);  
    
    mainFrame.setVisible(true);*/
  }
}
