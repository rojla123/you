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
import java.awt.event.ActionEvent;

public class F extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F frame = new F();
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
	public F() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrEstceQueVous = new JTextArea();
		txtrEstceQueVous.setBackground(Color.GRAY);
		txtrEstceQueVous.setText("Est-ce que vous avez \u00E9t\u00E9 en voyage \u00E0 l'\u00E9tranger ces deux derni\u00E8res semaines ? ");
		txtrEstceQueVous.setBounds(10, 11, 424, 22);
		contentPane.add(txtrEstceQueVous);
		
		JRadioButton non = new JRadioButton("non");
		non.setBounds(82, 114, 109, 23);
		contentPane.add(non);
		
		JRadioButton oui = new JRadioButton("oui");
		oui.setBounds(82, 182, 109, 23);
		contentPane.add(oui);
		
		JButton btnNewButton = new JButton("NEXT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				G a=new G();
				a.setVisible(true);
			}
		});
		btnNewButton.setBounds(305, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\hp\\eclipse-workspace\\formulaire\\virus.png"));
		lblNewLabel.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel);
	}

}
