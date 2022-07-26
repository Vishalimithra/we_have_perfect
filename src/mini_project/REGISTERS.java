package mini_project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class REGISTERS extends JFrame {

	private JPanel contentPane;
	private JTextField txtname;
	private JTextField txtlast;
	private JTextField txtage;
	private JTextField txtphoneno;
	private JTextField txtemail;
	private JTextField txtuser;
	private JTextField txtworks;
	private JPasswordField txtpass;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					REGISTERS frame = new REGISTERS();
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
	public REGISTERS() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 481);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTERATION");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(120, 21, 139, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("FRIST_NAME");
		lblNewLabel_1.setForeground(Color.PINK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1.setBounds(34, 82, 83, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("LAST_NAME");
		lblNewLabel_2.setForeground(Color.PINK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_2.setBounds(33, 106, 73, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("AGE");
		lblNewLabel_3.setForeground(Color.PINK);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_3.setBounds(30, 136, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ADDRESS");
		lblNewLabel_4.setForeground(Color.PINK);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_4.setBounds(30, 169, 65, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("PHONE NUMBER");
		lblNewLabel_5.setForeground(Color.PINK);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_5.setBounds(30, 193, 87, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("EMAIL");
		lblNewLabel_6.setForeground(Color.PINK);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_6.setBounds(30, 220, 76, 13);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("PASSWORD");
		lblNewLabel_7.setForeground(Color.PINK);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_7.setBounds(30, 283, 65, 13);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("USERNAME");
		lblNewLabel_8.setForeground(Color.PINK);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_8.setBounds(30, 245, 87, 13);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("WORKS");
		lblNewLabel_9.setForeground(Color.PINK);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_9.setBounds(30, 307, 45, 13);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("GENDER");
		lblNewLabel_10.setForeground(Color.PINK);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_10.setBounds(30, 344, 45, 13);
		contentPane.add(lblNewLabel_10);
		
		txtname = new JTextField();
		txtname.setBounds(151, 79, 96, 19);
		contentPane.add(txtname);
		txtname.setColumns(10);
		
		txtlast = new JTextField();
		txtlast.setBounds(151, 103, 96, 19);
		contentPane.add(txtlast);
		txtlast.setColumns(10);
		
		txtage = new JTextField();
		txtage.setBounds(151, 133, 96, 19);
		contentPane.add(txtage);
		txtage.setColumns(10);
		
		JTextArea txtarea = new JTextArea();
		txtarea.setBounds(150, 163, 97, 22);
		contentPane.add(txtarea);
		
		txtphoneno = new JTextField();
		txtphoneno.setBounds(151, 190, 96, 19);
		contentPane.add(txtphoneno);
		txtphoneno.setColumns(10);
		
		txtemail = new JTextField();
		txtemail.setBounds(151, 217, 96, 19);
		contentPane.add(txtemail);
		txtemail.setColumns(10);
		
		txtuser = new JTextField();
		txtuser.setBounds(151, 242, 96, 19);
		contentPane.add(txtuser);
		txtuser.setColumns(10);
		
		txtworks = new JTextField();
		txtworks.setBounds(151, 304, 96, 19);
		contentPane.add(txtworks);
		txtworks.setColumns(10);
		
		JRadioButton rbFemale = new JRadioButton("FEMALE");
		buttonGroup.add(rbFemale);
		rbFemale.setFont(new Font("Tahoma", Font.BOLD, 10));
		rbFemale.setBounds(108, 340, 103, 21);
		contentPane.add(rbFemale);
		
		JRadioButton rbMale = new JRadioButton("MALE");
		buttonGroup.add(rbMale);
		rbMale.setFont(new Font("Tahoma", Font.BOLD, 10));
		rbMale.setBounds(226, 340, 103, 21);
		contentPane.add(rbMale);
		
		txtpass = new JPasswordField();
		txtpass.setBounds(151, 280, 96, 19);
		contentPane.add(txtpass);
		
		JButton btnreg = new JButton("REGISTER");
		btnreg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/miniproject","root","7500");
					String query="insert into registrations values(?,?,?,?,?,?,?,?,?,?)";
				    PreparedStatement ps=con.prepareCall(query);
				    ps.setString(1, txtname.getText()); 
				    ps.setString(2, txtlast.getText());
				    ps.setInt(3, Integer.parseInt(txtage.getText()));
				    ps.setString(4, txtarea.getText());
				    ps.setString(5, (txtphoneno.getText()));
				    ps.setString(6, txtemail.getText());
				    ps.setString(7, txtuser.getText());
				    ps.setString(8, txtpass.getText());
				    ps.setString(9, txtworks.getText());
				    if(rbFemale.isSelected())
				    	ps.setString(10,rbFemale.getText());
				    else
				    	ps.setString(10,rbMale.getText());
				    int i=ps.executeUpdate();
				    JOptionPane.showMessageDialog(btnreg,i+ "added sucessfully");
				    Loginup l=new Loginup();
				    String[] a= {"k"};
				    l.main(a);
				    ps.close();
				    con.close();
				}
				catch(Exception e1) {
					System.out.println(e1);
				}
			}
		});
		btnreg.setForeground(Color.BLACK);
		btnreg.setBackground(Color.PINK);
		btnreg.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnreg.setBounds(56, 388, 108, 21);
		contentPane.add(btnreg);
		
		JButton btnreset = new JButton("RESET");
		btnreset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtname.setText("");
				txtlast.setText("");
				txtage.setText("");
				txtarea.setText("");
				txtphoneno.setText("");
				txtemail.setText("");
				txtuser.setText("");
				txtpass.setText("");
				txtworks.setText("");
				buttonGroup.clearSelection();
			} 
		});
		btnreset.setForeground(Color.BLACK);
		btnreset.setBackground(Color.PINK);
		btnreset.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnreset.setBounds(174, 388, 85, 21);
		contentPane.add(btnreset);
	}
}
