package com.ziki.client.view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
public class actionEvent
{
	JButton jb1;
	JLabel jl3;
	public actionEvent(){}

	public actionEvent(JButton jb1,JLabel jl3){
		this.jb1 = jb1;
		this.jl3 = jl3;
		init();
	}

	private void init(){
			jb1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				//System.out.println("sdsd");
				
				  
			}
		});
			jl3.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e){
				jl3.setForeground(Color.red);
			}
			public void mouseExited(MouseEvent e){
				jl3.setForeground(Color.blue);
			}
			public void mousePressed(MouseEvent e){
				try {
			//Runtime.getRuntime().exec("cmd /c start " + url);
					Runtime.getRuntime().exec("cmd /c start " + "http://106.15.194.163:8768/mould/register.php");//假定
				} catch (IOException e1) {
					System.out.println("打开注册页面失败");
				}
			}

		});
	}
}