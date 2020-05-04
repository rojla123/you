package formulaire;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.awt.event.ActionEvent;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

public class G extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					G frame = new G();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public G() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrK = new JTextArea();
		txtrK.setBackground(Color.GRAY);
		txtrK.setText("Est-ce que vous avez \u00E9t\u00E9 en contact, pendant les deux derni\u00E8res semaines, avec une personne revenant d\u2019un voyage \u00E0 l'\u00E9tranger? ");
		txtrK.setBounds(10, 11, 438, 22);
		contentPane.add(txtrK);
		
		JRadioButton oui = new JRadioButton("oui");
		buttonGroup.add(oui);
		oui.setBounds(78, 118, 109, 23);
		contentPane.add(oui);
		
		JRadioButton non = new JRadioButton("non");
		buttonGroup.add(non);
		non.setBounds(78, 186, 109, 23);
		contentPane.add(non);
		
		JButton btnNewButton = new JButton("validation");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A a=new A();
				a.setVisible(true);
				
			Enumeration<AbstractButton> bg=buttonGroup.getElements();
			while(bg.hasMoreElements())
			{
				JRadioButton oui=(JRadioButton) bg.nextElement();
				if(oui.isSelected())
				{
					conn.i++;
				}
				else
				{
					conn.i+=0;
				}
			}
			if(conn.i<=2)
			{
				A n=new A();
				n.setVisible(true);
				n.text.setText("vous etes en bonne sante");
			}
			else
			{
				T n=new T();
				n.setVisible(true);
				n.nizar.setText("vous avez besoin d un test");	
			}
			}
		});
		btnNewButton.setBounds(311, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\hp\\eclipse-workspace\\formulaire\\virus.png"));
		lblNewLabel.setBounds(0, 0, 448, 261);
		contentPane.add(lblNewLabel);
	}

}
