package formulaire;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class T extends JFrame {

	private JPanel contentPane;
	 JTextField nizar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					T frame = new T();
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
	public T() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrResulatFinale = new JTextArea();
		txtrResulatFinale.setBackground(Color.GRAY);
		txtrResulatFinale.setText("resulat finale");
		txtrResulatFinale.setBounds(10, 23, 414, 22);
		contentPane.add(txtrResulatFinale);
		
		nizar = new JTextField();
		nizar.setBounds(20, 105, 379, 20);
		contentPane.add(nizar);
		nizar.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\4na\\emoji-pleure-larme-1.png"));
		lblNewLabel.setBounds(172, 136, 170, 125);
		contentPane.add(lblNewLabel);
	}

}
