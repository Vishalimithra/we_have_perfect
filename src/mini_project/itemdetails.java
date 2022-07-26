package mini_project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class itemdetails extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					itemdetails frame = new itemdetails();
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
	public itemdetails() {
		setBackground(Color.PINK);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\abifr\\OneDrive\\Desktop\\java assessments\\ICON.jpg"));
		setTitle("PICK YOUR DRESSES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 507);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHOOSE DRESSES");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setForeground(Color.PINK);
		lblNewLabel.setBounds(208, 31, 248, 47);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("MEN");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User u =new User();
				String[] a= {"k"};
			    u.main(a);
			  
			}
		});
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setBounds(10, 184, 159, 47);
		contentPane.add(btnNewButton);
		
		JButton btnWomen = new JButton("WOMEN");
		btnWomen.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnWomen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Women w =new Women();
				String[] a= {"k"};
			    w.main(a);
			}
		});
		btnWomen.setBackground(Color.PINK);
		btnWomen.setBounds(194, 184, 159, 47);
		contentPane.add(btnWomen);
		
		
	}
}
