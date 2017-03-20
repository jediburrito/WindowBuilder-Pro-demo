import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicBuild extends JFrame{

	public static void main(String[] args){
	
	JFrame myMainFrame = new JFrame();
	myMainFrame.setTitle("Hey I'm the Title");
	myMainFrame.setSize(400, 300);
	myMainFrame.setLocation(100, 100);
	myMainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	myMainFrame.setVisible(true);
	
	
	JButton myButton = new JButton("Click Here");
	
	myMainFrame.setLayout(new FlowLayout());
	myMainFrame.add(myButton);
	
	MyButtonHandler mbh = new MyButtonHandler();
	myButton.addActionListener(mbh);
	
	JButton otherButton = new JButton("Other Button");
	myMainFrame.add(otherButton);
	
	otherButton.addActionListener(
			new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
			System.out.println("I hear the other button!");
			}
			}
			
			);
	
	}
	
	
	
	
}

	
 class MyButtonHandler implements ActionListener{

	@Override
	public  void actionPerformed(ActionEvent e) {
		System.out.println("I hear the button!");
//		System.out.println(e);
	}
	
	
	
	
}