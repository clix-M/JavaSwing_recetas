package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Conexion;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class CreateRecet extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNameRecet;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateRecet frame = new CreateRecet();
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
	public CreateRecet() {
		setType(Type.UTILITY);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CREA TU RECETA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(141, 11, 146, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(67, 79, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textFieldNameRecet = new JTextField();
		textFieldNameRecet.setBounds(141, 76, 230, 20);
		contentPane.add(textFieldNameRecet);
		textFieldNameRecet.setColumns(10);
		
		JButton btnNewButton = new JButton("CREAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				
				if(e.getSource()== btnNewButton) {
					try {
						String nombre = textFieldNameRecet.getText();
						
						Statement data = Conexion.getConnection().createStatement();
						data.executeUpdate("INSERT INTO Receta  (nombre ) VALUES ('"+ nombre +"') ");
						
						JOptionPane.showMessageDialog(contentPane, "Registro existosa.");
						dispose();
						
						
						AddRecet ar= new AddRecet();
		    			ar.setVisible(true);
		    			ar.setLocationRelativeTo(null);
		    			
		    			dispose();
		    			
		    
					} catch (SQLException ex) {
		                throw new RuntimeException(ex);
		            }
				}
    		
				
			}
		});
		btnNewButton.setBounds(67, 184, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnCancelar) {
					dispose();
				}
			}
		});
		btnCancelar.setBounds(263, 184, 108, 23);
		contentPane.add(btnCancelar);
	}
}
