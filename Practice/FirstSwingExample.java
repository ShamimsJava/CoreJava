import javax.swing.*;

public class FirstSwingExample{
	public static void main(String[] args){
		JFrame f = new JFrame(); // instance of JFrame 
		JButton b = new JButton("Click Me!");
		
		b.setBounds(130, 100, 100, 40);
		f.add(b);

		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		
		
	}
}