package Vista;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton btnVerReceta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setTitle("Ventana Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 765, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAddReceta = new JButton("AGREGAR RECETA");
		btnAddReceta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateRecet ar = new CreateRecet();
    			ar.setVisible(true);
    			ar.setLocationRelativeTo(null);
    			
			}
		});
		btnAddReceta.setBounds(221, 386, 147, 38);
		contentPane.add(btnAddReceta);
		
		table = new JTable();
		table.setBounds(10, 11, 729, 349);
		contentPane.add(table);
		
		btnVerReceta = new JButton("VER RECETA");
		btnVerReceta.setBounds(385, 386, 147, 38);
		contentPane.add(btnVerReceta);
	}

}
