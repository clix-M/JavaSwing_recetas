package Vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Modelo.Conexion;

public class Login extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 * remodific
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Login");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 543, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 527, 314);
		contentPane.add(panel);
		panel.setLayout(null);
		
		ImageIcon imageIcon = new ImageIcon(Login.class.getResource("/img/company-woman-opening-lock-with-a-key.png"));
        Image image = imageIcon.getImage();
        Image newImage = image.getScaledInstance(329, 292, Image.SCALE_SMOOTH);
        
		JLabel lblNewLabel = new JLabel("",new ImageIcon(newImage), SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(10, 11, 244, 292);
		panel.add(lblNewLabel);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setForeground(SystemColor.textHighlight);
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLogin.setBounds(343, 40, 54, 14);
		panel.add(lblLogin);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setIcon(new ImageIcon(Login.class.getResource("/img/icons8-usuario-16.png")));
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUsuario.setBounds(296, 91, 180, 14);
		panel.add(lblUsuario);
		
		JTextField textUsuario = new JTextField();
		textUsuario.setForeground(new Color(0, 0, 0));
		textUsuario.setToolTipText("");
		textUsuario.setBounds(296, 105, 180, 20);
		panel.add(textUsuario);
		textUsuario.setColumns(10);
		
		JLabel lblContraseña = new JLabel("Contraseña");
		lblContraseña.setIcon(new ImageIcon(Login.class.getResource("/img/icons8-contraseña-16.png")));
		lblContraseña.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblContraseña.setBounds(296, 136, 180, 14);
		panel.add(lblContraseña);
		
		JPasswordField passwFieldContraseña = new JPasswordField();
		passwFieldContraseña.setBounds(296, 152, 180, 20);
		panel.add(passwFieldContraseña);
		
		// this is sign-in
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setIcon(new ImageIcon(Login.class.getResource("/img/icons8-iniciar-sesión-16.png")));
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogin.setBounds(296, 212, 180, 23);
		panel.add(btnLogin);
		
		JCheckBox chckbxContraseña = new JCheckBox("Ver Contraseña");
		chckbxContraseña.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		chckbxContraseña.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JCheckBox checkBox = (JCheckBox) e.getSource();
                if (checkBox.isSelected()) {
                	passwFieldContraseña.setEchoChar((char) 0); // Muestra la contraseña
                } else {
                	passwFieldContraseña.setEchoChar('\u2022'); // Oculta la contraseña con viñetas
                }
			}
		});
		chckbxContraseña.setBounds(296, 171, 180, 23);
		panel.add(chckbxContraseña);
		// validation
		
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String user = textUsuario.getText();
				String contrasena = new String(passwFieldContraseña.getPassword());
				
				if(user.equals("") || passwFieldContraseña.getPassword().length == 0) {
					JOptionPane.showMessageDialog(panel, "ingrese el usuario y la contraseña");
					return;
				}
				try {
					Statement data = Conexion.getConnection().createStatement();
					ResultSet query = data.executeQuery("SELECT * FROM Usuario WHERE nombre='" + user + "' AND contrasena='" + contrasena + "'");
					
					if(query.next()) {
						dispose();
						
						//abrira la ventana principal si ya tiene una cuenta creada...
		    			VentanaPrincipal vp = new VentanaPrincipal();
		    			vp.setVisible(true);
		    			vp.setLocationRelativeTo(null);
					}else {
						JOptionPane.showMessageDialog(panel, "Necesitas registrarte.");
					}
					
					data.close();
					
					
					
				}catch (SQLException ex) {
	                ex.printStackTrace();
	            }
				
			}
		});
		
		
	
		/* this is sign-up
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.setIcon(new ImageIcon(Login.class.getResource("/img/icons8-añadir-usuario-masculino-16.png")));
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register rg = new Register();
				rg.setVisible(true);
				rg.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnRegister.setBounds(296, 235, 180, 23);
		panel.add(btnRegister);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(128, 128, 128));
		separator_1.setForeground(new Color(0, 0, 0));
		separator_1.setBounds(296, 123, 180, 2);
		panel.add(separator_1);
		
       
		JLabel lbliconUser = new JLabel("");
		lbliconUser.setIcon(new ImageIcon(Login.class.getResource("/img/icons8-usuario-masculino-en-círculo-48.png")));
		lbliconUser.setBounds(358, 36, 48, 50);
		panel.add(lbliconUser);
	}*/

	}
}
