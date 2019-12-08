import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class demo {
	public demo() {
		// TODO Auto-generated constructor stub
		JFrame f = new JFrame("hello");
		JTextField jf1 = new JTextField(20);
		JTextField jf2 = new JTextField(20);
		JButton b = new JButton("µÇÂ¼");
		
		f.add(jf1,"North");
		f.add(jf2);
		f.add(b,"South");
		
		
		
		f.pack();
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource() == b) {
					jf2.setText(jf1.getText().trim());
				}
			}
		});
	}
	
	public static void main(String[] args) {
		new demo();
	}
}
