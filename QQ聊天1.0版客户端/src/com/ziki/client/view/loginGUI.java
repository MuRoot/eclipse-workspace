package com.ziki.client.view;



import com.ziki.client.mode.clientUser;
import com.ziki.common.User;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Window;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class loginGUI{
	JFrame f;
	JLabel jl;
	JLabel jl1, jl2, jl3;
	JPanel jp;
	JTextField tf;
	JPasswordField pf;
	JButton jb1;

	loginGUI() {
		f = new JFrame();
		f.setLayout(null);
		jp = new JPanel();

		// jp.setBackground(Color.orange);

		jl = new JLabel(new ImageIcon("images/6.jpg"));
		jl.setBounds(0, 0, 556, 156);

		jl1 = new JLabel(new ImageIcon("images/QQ.png"));
		jl1.setBounds(75, 199, 48, 48);

		jl2 = new JLabel(new ImageIcon("images/锁.png"));
		jl2.setBounds(75, 250, 48, 48);

		jl3 = new JLabel("注册账号");
		jl3.setBounds(10, 330, 55, 20);
		jl3.setForeground(Color.blue);

		tf = new JTextField(300);
		tf.setBounds(121, 199, 300, 40);
		tf.setFont(new Font("宋体", Font.BOLD, 22));

		pf = new JPasswordField(300);
		pf.setBounds(121, 250, 300, 40);
		pf.setFont(new Font("幼圆", Font.BOLD, 50));

		jb1 = new JButton("登录");
		//响应用户点击响应、
		
		
		
		jb1.setBackground(new Color(4, 186, 251));
		jb1.setBounds(121, 300, 297, 44);
		jb1.setFont(new Font("幼圆", Font.BOLD, 30));

		f.add(jl1);
		f.add(jl2);
		f.add(jl3);
		f.add(pf);
		f.add(jp);
		f.add(jl);
		f.add(tf);
		f.add(jb1);
		

		// this.setIconImage(new ImageIcon());new Color(4,186,251)
		// this.setBackground(Color.red);
		f.setTitle("QQ");
		f.setIconImage(new ImageIcon("images/logo.png").getImage());
		f.setSize(536, 410);
		f.setResizable(false);
		f.setLocation(600, 300); 
		f.setVisible(true);
		
jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 if (e.getSource() == jb1) {
					 clientUser pc = new clientUser();
					 User u = new User();
					 u.setUserId(tf.getText().trim());
					 u.setPassWord(new String(pf.getPassword()));
					 
					 //判断服务端返回的检查值
					 String value = pc.checkUser(u);
					 if (value.equals("1")) {
						new mainGUI();
						f.dispose();
					}else if(value.equals("2")){
						JOptionPane note = new JOptionPane("账号或密码有错！");
						//note.showMessageDialog(null, "账号或密码有错！", "账号或密码有错！", , icon);
					}
					 
					 
				}
			}
		});
	
	}


	public static void main(String[] args) {
		new loginGUI();
	}
}
