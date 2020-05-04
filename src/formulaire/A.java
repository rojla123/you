package formulaire;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class A extends JFrame {

	private JPanel contentPane;
public	 JTextField txt;
 JTextField text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					A frame = new A();
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
	public A() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrResultatFinale = new JTextArea();
		txtrResultatFinale.setBackground(Color.GRAY);
		txtrResultatFinale.setText("resultat finale");
		txtrResultatFinale.setBounds(10, 11, 443, 22);
		contentPane.add(txtrResultatFinale);
		
		JTextArea txtrReultat = new JTextArea();
		txtrReultat.setBackground(Color.RED);
		txtrReultat.setText("REULTAT");
		txtrReultat.setBounds(29, 87, 99, 22);
		contentPane.add(txtrReultat);
		
		text = new JTextField();
		text.setBounds(29, 117, 395, 42);
		contentPane.add(text);
		text.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\formulaire\\t\u00E9l\u00E9chargement.jpg"));
		lblNewLabel.setBounds(97, 170, 245, 80);
		contentPane.add(lblNewLabel);
	}
}
