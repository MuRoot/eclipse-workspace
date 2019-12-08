package com.ziki.client.view;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class chatDialog {
	JDialog jd = null;
	JPanel p = new JPanel();
	// JPanel p1 = new JPanel();
	JScrollPane jsp = new JScrollPane();
	JPanel p1 = new JPanel();
	JTextArea ta = new JTextArea(30, 20);
	JTextField tf = new JTextField(20);
	JButton jb = new JButton("submit");
	String name;

	chatDialog(String name) {
		this.name = name;
		jd = new JDialog();
		ta.setLineWrap(false);
		ta.setBackground(new Color(180, 180, 180));
		ta.setFont(new Font("幼圆", Font.BOLD, 18));
		ta.setForeground(Color.orange);
		p1.add(ta);
		jsp.getViewport().add(p1);
		// jsp.add(ta);
		p.add(tf);
		p.add(jb);
		
		jd.add(jsp);
		jd.add(p, "South");
		jd.setTitle(" withing " + name + " chat ");

		jd.setLocation(800, 300);
		jd.setSize(400, 350);
		jd.setVisible(true);
		// jd.add(ta);
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = tf.getText();
				ta.append(str + "\r\n");
			}
		});
		tf.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					String str = tf.getText();
					ta.append(str + "\r\n");

				}

			}

			public void keyRealeased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					tf.setText(" ");
				}
			}
		});

		jd.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				jd.dispose();
			}
		});

	}

}