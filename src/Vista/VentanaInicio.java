package Vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class VentanaInicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInicio frame = new VentanaInicio();
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
	public VentanaInicio() {
		setTitle("Ventana Inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 751, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblTitulo = new JLabel("SISTEMA DE GESTION DE RECETAS DE COCINA");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(175, 10, 385, 20);
		contentPane.add(lblTitulo);
		
		ImageIcon imageIcon = new ImageIcon(VentanaInicio.class.getResource("/img/conifer-fingerprint-verification.png"));
        Image image = imageIcon.getImage();
        Image newImage = image.getScaledInstance(329, 292, Image.SCALE_SMOOTH);
        
		JLabel lblBanner = new JLabel("",new ImageIcon(newImage), SwingConstants.CENTER);
		lblBanner.setBounds(10, 107, 715, 227);
		contentPane.add(lblBanner);
		
		JButton btnLogin = new JButton("INICIAR SESION");
		btnLogin.setIcon(new ImageIcon(VentanaInicio.class.getResource("/img/icons8-iniciar-sesión-16.png")));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login lg = new Login();
				lg.setVisible(true);
				lg.setLocationRelativeTo(null);
			}
		});
		btnLogin.setBounds(288, 359, 180, 42);
		contentPane.add(btnLogin);
		
		JLabel lblCreate = new JLabel("Crear una Cuenta");
		lblCreate.setBounds(288, 405, 131, 14);
		contentPane.add(lblCreate);
		lblCreate.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblNewLabel = new JLabel("Porfavor inicia sesion para ver las diferentes recetas que tenemos,"
				+ " en caso no tenga una cuenta,"
				+ "puedes crear una.");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel.setBounds(55, 41, 651, 32);
		contentPane.add(lblNewLabel);
		
        lblCreate.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
    			Register rg = new Register();
				rg.setVisible(true);
				rg.setLocationRelativeTo(null);
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                // Cambiar el color del texto a otro color cuando el mouse entra
                lblCreate.setForeground(Color.BLUE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Restaurar el color original cuando el mouse sale
                lblCreate.setForeground(Color.BLACK);
            }
        });
	}
	
}
