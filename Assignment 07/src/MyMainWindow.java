import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class MyMainWindow {

	private JFrame frame;
	private JTextField txtHelloGuiWorld;
	private JTextField txtHelloGuiWorld_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyMainWindow window = new MyMainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyMainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton myOtherName = new JButton("Click me!");
		myOtherName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			textField.setText("Hello GUI world!");
			
			}
		});
		myOtherName.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(myOtherName);
		
		textField = new JTextField();
		textField.setBounds(151, 90, 150, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
	
	}
}
