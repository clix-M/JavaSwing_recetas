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
    			AddReceta ar = new AddReceta();
    			ar.setVisible(true);
    			ar.setLocationRelativeTo(null);
			}
		});
		btnAddReceta.setBounds(10, 379, 147, 38);
		contentPane.add(btnAddReceta);
		
		JButton btnVerRecetas = new JButton("VER RECETA");
		btnVerRecetas.setBounds(210, 379, 147, 38);
		contentPane.add(btnVerRecetas);
		
		JButton btnEditarReceta = new JButton("EDITAR RECETA");
		btnEditarReceta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEditarReceta.setBounds(399, 379, 147, 38);
		contentPane.add(btnEditarReceta);
		
		JButton btnEliminarReceta = new JButton("ELIMINAR RECETA");
		btnEliminarReceta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminarReceta.setBounds(592, 379, 147, 38);
		contentPane.add(btnEliminarReceta);
		
		table = new JTable();
		table.setBounds(10, 11, 729, 349);
		contentPane.add(table);
	}

}
