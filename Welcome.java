import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.awt.Color;
import java.awt.Container;

public class Welcome extends JFrame  implements ActionListener {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private JLabel textJLable1;
    private JLabel pictureJLablel;
    JButton btna ;
   public Welcome()
   {
   
   
	   Container contentPane=getContentPane();
	   contentPane.setBackground(Color.YELLOW);
	   contentPane.setLayout(null);
	  
  
	   textJLable1 = new JLabel();
	   textJLable1.setText("Welcome to Java Programming!");
	   textJLable1.setLocation(35,0);
	   textJLable1.setSize(550, 88);
	   textJLable1.setFont(new Font("SanSerif",Font.PLAIN,36));
	   textJLable1.setHorizontalAlignment(JLabel.CENTER);
       contentPane.add(textJLable1);
       
       pictureJLablel=new JLabel();
       pictureJLablel.setIcon(new ImageIcon("config/snapshot20070703214240.jpg"));
       pictureJLablel.setBounds(54,120,500,250);
       pictureJLablel.setHorizontalAlignment(JLabel.CENTER);
       contentPane.add(pictureJLablel);
       
       btna=new JButton("½øÈë");
	   btna.setBounds(280, 380, 60, 25);
	   contentPane.add(btna);
	   btna.addActionListener(this);
	   btna.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				  setVisible(false);
			       
			new MainWindow();
			}
			});

       setTitle("Welcome");
       setSize(608,450);
       this.setLocationRelativeTo(null);
       this.setResizable(false);
       setVisible(true);
       
   }
   public static void main(String[] agrs)
   {
	 
	   Welcome application=new Welcome();
	   application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
@Override
public void actionPerformed(ActionEvent e) {
	
	
}
}
