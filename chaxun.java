import java.awt.Color;
import java.awt.Container;
//import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.applet.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

//class Lines extends Applet{
//    private static final long serialVersionUID = 1L;
//    public void paint(Graphics g){
//	    g.drawLine(90, 160, 151, 33);
//      }
//     }

 public class chaxun extends JFrame implements ActionListener{
	 private static final long serialVersionUID = 1L;
	
	  JButton btnClear ;//�˳�
      JButton btncx ;//��Ѱ
    
      JButton  btnreturn ;
	
	JTextField txtNum;//���
	JTextField txtName;//����
	JTextField txtAge ;//����
	JTextField txtTel;//��ϵ��ʽ
	JTextField txtTel2;
	JTextField txtName2;
	JLabel lblPhotoShow;
	
	/*��Ѱ������*/
	
	public chaxun(){
		  this.setTitle("ͨѶ¼");
			this.setSize(350, 430);
			this.setLocationRelativeTo(null);//���ھ���
			this.setResizable(false);
		                                                                                                                                                                                                                                                                                                                        
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container con = this.getContentPane();
			con.setLayout(null);
			
			JLabel lblNum = new JLabel("�û����:");
			lblNum.setBounds(20, 20, 60, 25);//��ǩλ��
			con.add(lblNum);
			txtNum = new JTextField();
			txtNum.setBounds(90, 20, 100, 25);//�ı���λ��
			txtNum.setEditable(false);
			con.add(txtNum);
			
			lblPhotoShow = new JLabel("            ��Ƭ");
			lblPhotoShow.setBounds(233, 15, 95, 105);
			lblPhotoShow.setBorder(BorderFactory.createLineBorder(Color.gray));
			con.add(lblPhotoShow);
		
		JLabel lblName = new JLabel("��        ��:");
		lblName.setBounds(20, 55, 60, 25);
		con.add(lblName);
		txtName = new JTextField();
		txtName.setBounds(90, 55, 100, 25);
		con.add(txtName);
		
		JLabel lblName2 = new JLabel("��������:");
		lblName2.setBounds(20, 175, 60, 25);
		con.add(lblName2);
		txtName2 = new JTextField();
		txtName2.setBounds(90,175, 100, 25);
		con.add(txtName2);

		JLabel lblAge = new JLabel("��        ��:");
		lblAge.setBounds(20, 90, 60, 25);
		con.add(lblAge);
		txtAge = new JTextField();
		txtAge.setBounds(90, 90, 50, 25);
		//txtAge.getDocument().addDocumentListener(new TextChange());
		con.add(txtAge);
		

		JLabel lblTel = new JLabel("��ϵ��ʽ:");
		lblTel.setBounds(20, 135, 60, 25);
		con.add(lblTel);
		txtTel = new JTextField();
		txtTel.setBounds(90, 135, 150, 25);
		//txtTel.getDocument().addDocumentListener(new TextChange());
		con.add(txtTel);
		
     

		JLabel lblTel1 = new JLabel("�绰��ѯ:");
		lblTel1.setBounds(20, 215, 60, 25);
		con.add(lblTel1);
		txtTel2 = new JTextField();
		txtTel2.setBounds(90, 215, 150, 25);
		//txtTel.getDocument().addDocumentListener(new TextChange());
		con.add(txtTel2);
		
		btncx=new JButton("��ѯ");
	    btncx.setBounds(200, 275, 60, 25);
		con.add(btncx);
		
		 btnClear=new JButton("���");
		 btnClear.setBounds(100, 275, 60, 25);
		con.add( btnClear);
	
		 btnreturn=new JButton("����");
		 btnreturn.setBounds(10, 275, 60, 25);
		con.add(btnreturn);
		
		/*��հ�ť*/
	btncx.addActionListener(this);
	btnClear.addActionListener(new ActionListener() {
		public void actionPerformed( ActionEvent e) {
			 txtNum.setText("");
			 txtTel2.setText("");
		      txtName.setText("");
		      txtAge.setText("");
		      txtTel.setText("");
		      txtName2.setText("");
		      lblPhotoShow.setIcon(new ImageIcon(""));
		}
		});
	
	/*���ذ�ť*/
	btnreturn.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				setVisible(false);
			new MainWindow();
			
			}
			});

		setVisible(true);
		

//	         public  void cx(User user){
//		
//	        	if(user.getName().equals(txtName.getText()) ){
//	        		txtNum.setText(user.getNo());
//	                txtName.setText(user.getName());
//	                txtAge.setText(user.getAge()+"");
//	                txtTel.setText(user.getPhone());
//	        	}else {
//	        	System.out.println("asdfdf");
//	        	}
	}
	 
	/*�������绰��Ѱ*/
	 public void actionPerformed(ActionEvent e) {
	        	 if(e.getSource() == btncx){
	        		 AnNiu bo=new AnNiu();
	        		 if ("".equals(txtName2.getText().trim())&&("".equals(txtTel2.getText().trim())) ){
	        			
	     	           		JOptionPane.showMessageDialog(this, "�û�������绰����һ�����в�Ѱ!");
	     	         
	        		 
	     	           		}
	     	           	    	
	        		   for(int i=0;i<bo.users.length;i++)
	        		 {
	        			 
	        			 if(bo.users[i].getName().equals(txtName2.getText()) ){ //�Ƚ�����
	     	        		txtNum.setText(bo.users[i].getNo());
	     	                txtName.setText(bo.users[i].getName());
	     	                txtAge.setText(bo.users[i].getAge()+"");
	     	                txtTel.setText(bo.users[i].getPhone());
	     	                lblPhotoShow.setIcon(new ImageIcon(bo.users[i].getImagePath())); 
	     	                break;
	     	        	}else if(bo.users[i].getPhone().equals(txtTel2.getText())){//�Ƚϵ绰
	     	        		txtNum.setText(bo.users[i].getNo());
	     	                txtName.setText(bo.users[i].getName());
	     	                txtAge.setText(bo.users[i].getAge()+"");
	     	                txtTel.setText(bo.users[i].getPhone());
	     	               lblPhotoShow.setIcon(new ImageIcon(bo.users[i].getImagePath()));
	     	                break;

	     	        	} 
//	     	        	else if(e.getSource() == btnClear){
//	        			      txtNum.setText("");
//	        			      txtName.setText("");
//	        			      txtAge.setText("");
//	        			      txtTel.setText("");
//	        			      lblPhotoShow.setIcon(new ImageIcon(""));
//	        				 }
	        			 // System.out.print("asf");
	    	        	 
	        		 }}}}
	        		   
	        		
	     	        	
// public static void main(String args[])
//	{
//		new chaxun();
//	}};