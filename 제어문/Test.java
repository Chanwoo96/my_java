package 제어문;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Panel;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;

public class Test {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(102, 204, 255));
		f.setSize(400, 400);
		f.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("New button");
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		f.setVisible(true);
	}

	
	
}


