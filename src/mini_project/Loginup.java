package mini_project;
import java.sql.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class Loginup extends JFrame {

	private JPanel contentPane;
	private JTextField txtusers;
	private JTextField txtpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loginup frame = new Loginup();
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
	public Loginup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel txtuser = new JLabel("username");
		txtuser.setFont(new Font("Tahoma", Font.BOLD, 10));
		txtuser.setForeground(Color.PINK);
		txtuser.setHorizontalAlignment(SwingConstants.TRAILING);
		txtuser.setBounds(10, 69, 90, 43);
		contentPane.add(txtuser);
		
		JLabel txtpass = new JLabel("password");
		txtpass.setForeground(Color.PINK);
		txtpass.setFont(new Font("Tahoma", Font.BOLD, 10));
		txtpass.setBounds(46, 122, 66, 13);
		contentPane.add(txtpass);
		
		txtusers = new JTextField();
		txtusers.setBounds(122, 81, 96, 19);
		contentPane.add(txtusers);
		txtusers.setColumns(10);
		
		txtpassword = new JTextField();
		txtpassword.setBounds(122, 119, 96, 19);
		contentPane.add(txtpassword);
		txtpassword.setColumns(10);
		
		JButton btnlogin = new JButton("LOGIN");
		btnlogin.setBackground(Color.PINK);
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/miniproject","root","7500");
					String query="select * from registrations where username=?;";
				    PreparedStatement ps=con.prepareStatement(query);
				    ps.setString(1, txtusers.getText());
				    
				    ResultSet rs=ps.executeQuery();
				    rs.next();
				    String p = rs.getString("password");
				    String w = "Welcome "+ rs.getString("frist_name");
				    if(p.equals(txtpassword.getText()))
				    JOptionPane.showMessageDialog(btnlogin,w+ "loged in sucessfully");
				    itemdetails i =new itemdetails();
				    String[] a= {"k"};
				    i.main(a);
				    ps.close();
				    con.close();
				    
				    
				}
				catch(Exception e1) {
					System.out.println(e1);
				}
			
			}
		});
		btnlogin.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnlogin.setBounds(62, 180, 85, 21);
		contentPane.add(btnlogin);
		
		JButton btnreset = new JButton("RESET");
		btnreset.setBackground(Color.PINK);
		btnreset.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnreset.setForeground(Color.BLACK);
		btnreset.setBounds(163, 180, 85, 21);
		contentPane.add(btnreset);
		
		JLabel lblNewLabel = new JLabel("LOGIN PAGE");
		lblNewLabel.setForeground(Color.PINK);
		lblNewLabel.setBounds(122, 10, 141, 38);
		contentPane.add(lblNewLabel);
	}
}
