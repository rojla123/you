package formulaire;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class conne extends JFrame {

	 JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					conne frame = new conne();
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
	public conne() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("la temperature est superieure a 37\u00B08");
		chckbxNewCheckBox.setBounds(26, 37, 349, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("vous ressentez une  une fatigue inhabituelle?");
		chckbxNewCheckBox_1.setBounds(26, 66, 349, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JTextArea txtrCesDerniersJours = new JTextArea();
		txtrCesDerniersJours.setBackground(Color.LIGHT_GRAY);
		txtrCesDerniersJours.setText("Ces derniers jours, avez-vous eu ou ressenti un de ces sympt\u00F4mes ?");
		txtrCesDerniersJours.setBounds(0, 8, 424, 22);
		contentPane.add(txtrCesDerniersJours);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("vous avez une perte de l odorat");
		chckbxNewCheckBox_2.setBounds(26, 106, 238, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("vous avez la perte de l appetit");
		chckbxNewCheckBox_3.setBounds(26, 142, 238, 23);
		contentPane.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("votre etat physique n est pas comme d habitude?");
		chckbxNewCheckBox_4.setBounds(29, 185, 263, 23);
		contentPane.add(chckbxNewCheckBox_4);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F b=new F();
				b.setVisible(true);
				for(Component c : contentPane.getComponents())
				{
					if(c.getClass().equals(JCheckBox.class))
					{
						JCheckBox j=(JCheckBox) c;
						if(j.isSelected())
						{
						conn.i++;	
						}
					}
				}
			}
		});
		btnNewButton.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\hp\\eclipse-workspace\\formulaire\\virus.png"));
		lblNewLabel.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel);
	}
}
