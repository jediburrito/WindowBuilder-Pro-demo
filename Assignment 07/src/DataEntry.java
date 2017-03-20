import java.awt.BorderLayout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.CardLayout;
import javax.swing.SpringLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class DataEntry extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblName;
	private JLabel lblNewLabel;
	private JLabel lblPhone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DataEntry dialog = new DataEntry();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DataEntry() {
		setBounds(100, 100, 190, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		
		{
			lblName = new JLabel("Name: ");
		}
		{
			 
			textField = new JTextField();
			textField.setColumns(10);
			
			
			
		}
		{
			lblNewLabel = new JLabel("Email");
		}
		{
			textField_1 = new JTextField();
			textField_1.setColumns(10);
		}
		{
			lblPhone = new JLabel("Phone");
		}
		{
			textField_2 = new JTextField();
			textField_2.setColumns(10);
		}
		
		
		
		
		contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		contentPanel.add(lblName);
		contentPanel.add(textField);
		contentPanel.add(lblNewLabel);
		contentPanel.add(textField_1);
		contentPanel.add(lblPhone);
		contentPanel.add(textField_2);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
			
			{
				JButton okButton = new JButton("OK");
				okButton.addMouseListener(new MouseAdapter() {
					
					
					@Override
					
					public void mouseClicked(MouseEvent arg0) {
						

						
						
						
					String name =  textField.getText();
					String email = textField_1.getText();
					 String phone = textField_2.getText();
					 
						
					 
					 
					System.out.println("Name: " + name + "\nEmail: " + email + "\nPhone: " + phone);
					 
					 }
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			JButton cancelButton = new JButton("Cancel");
			cancelButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked (MouseEvent e) {
					System.exit(0);
				}
			});
			cancelButton.setActionCommand("Cancel");
			buttonPane.add(cancelButton);
		}
				
		
		
			
	

		
		
	}	

}


