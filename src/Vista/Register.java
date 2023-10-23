package Vista;

import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Register extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 * remodific
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon imageIcon = new ImageIcon(Register.class.getResource("/img/conifer-fingerprint-verification.png"));
        Image image = imageIcon.getImage();
        Image newImage = image.getScaledInstance(329, 292, Image.SCALE_SMOOTH);
        
		JLabel lblNewLabel = new JLabel("",new ImageIcon(newImage), SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 210, 292);
		contentPane.add(lblNewLabel);
		
		JLabel lblRegister = new JLabel("REGISTER");
		lblRegister.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRegister.setBounds(335, 25, 93, 14);
		contentPane.add(lblRegister);
		
		JLabel lblUsuario = new JLabel("Nombre de Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUsuario.setIcon(new ImageIcon(Register.class.getResource("/img/icons8-usuario-16.png")));
		lblUsuario.setBounds(300, 67, 169, 14);
		contentPane.add(lblUsuario);
		
		JTextField textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(300, 81, 169, 20);
		contentPane.add(textField);
		
		JLabel lblContraseña = new JLabel("Contraseña");
		lblContraseña.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblContraseña.setIcon(new ImageIcon(Register.class.getResource("/img/icons8-contraseña-16.png")));
		lblContraseña.setBounds(300, 157, 169, 14);
		contentPane.add(lblContraseña);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(300, 173, 169, 20);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("REGISTER");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogin.setIcon(new ImageIcon(Register.class.getResource("/img/icons8-añadir-usuario-masculino-16.png")));
		btnLogin.setBounds(300, 232, 169, 23);
		contentPane.add(btnLogin);
		
		JButton btnRegister = new JButton("LOGIN");
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRegister.setIcon(new ImageIcon(Register.class.getResource("/img/icons8-iniciar-sesión-16.png")));
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login lg = new Login();
				lg.setVisible(true);
				lg.setLocationRelativeTo(null);
				dispose();			
			}
		});
		btnRegister.setBounds(300, 266, 169, 23);
		contentPane.add(btnRegister);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCorreo.setIcon(new ImageIcon(Register.class.getResource("/img/icons8-correo-16.png")));
		lblCorreo.setBounds(300, 112, 169, 14);
		contentPane.add(lblCorreo);
		
		JTextField textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(300, 126, 169, 20);
		contentPane.add(textField_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Ver contraseña");
		chckbxNewCheckBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JCheckBox checkBox = (JCheckBox) e.getSource();
                if (checkBox.isSelected()) {
                    passwordField.setEchoChar((char) 0); // Muestra la contraseña
                } else {
                    passwordField.setEchoChar('\u2022'); // Oculta la contraseña con viñetas
                }
			}
		});
		chckbxNewCheckBox.setBounds(300, 193, 169, 14);
		contentPane.add(chckbxNewCheckBox);
	}

}
