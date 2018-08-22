import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Calculator {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextArea textArea = new JTextArea(2, 10);
	
	public Calculator() {
		frame.setSize(340, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Calculator");
		
		frame.add(panel);
		panel.setBackground(Color.LIGHT_GRAY);
		Border border = BorderFactory.createLineBorder(Color.RED, 4);
		panel.setBorder(border);
		
		panel.add(textArea);
		
		textArea.setBackground(Color.BLACK);
		Border textAreaBorder = BorderFactory.createLineBorder(Color.BLUE, 3);
		
		textArea.setBorder(textAreaBorder);
		Font font = new Font("Arial", Font.BOLD, 33);
		textArea.setFont(font);
		textArea.setForeground(Color.WHITE);
		textArea.setPreferredSize(new Dimension(2, 10));
		textArea.setLineWrap(true);
	}
}

