package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddReceta extends JFrame {

	private JPanel contentPane;
	private JComboBox<String> comboBoxOpciones;
	private JTextField textFieldNombreReceta;
	private JTextField textFieldTiempoPrep;
	private JTextField textFieldNombreIngred;
	private JTextField textFieldMedida;
	private JTextField textFieldCantidad;
	private JTextField textFieldNombreAutor;
	private JTextField textFieldFecha;
	private JTextField textFieldCategoria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddReceta frame = new AddReceta();
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
	public AddReceta() {
		setTitle("AGREGAR RECETA");
		setBounds(100, 100, 758, 542);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombre.setBounds(10, 105, 69, 14);
		contentPane.add(lblNombre);
		
		textFieldNombreReceta = new JTextField();
		textFieldNombreReceta.setBounds(10, 119, 162, 20);
		contentPane.add(textFieldNombreReceta);
		textFieldNombreReceta.setColumns(10);
		
		JLabel lblDescrip = new JLabel("Descripción: ");
		lblDescrip.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDescrip.setBounds(10, 370, 69, 14);
		contentPane.add(lblDescrip);
		
		JTextArea textAreaDescripcion = new JTextArea();
		textAreaDescripcion.setBounds(10, 386, 162, 57);
		contentPane.add(textAreaDescripcion);
		
		JLabel lblTiempoPrepa = new JLabel("Tiempo de preparación: ");
		lblTiempoPrepa.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTiempoPrepa.setBounds(10, 150, 162, 14);
		contentPane.add(lblTiempoPrepa);
		
		textFieldTiempoPrep = new JTextField();
		textFieldTiempoPrep.setColumns(10);
		textFieldTiempoPrep.setBounds(10, 164, 162, 20);
		contentPane.add(textFieldTiempoPrep);
		
		JLabel lblInstruccinDePreparacin = new JLabel("Instrucción de preparación: ");
		lblInstruccinDePreparacin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblInstruccinDePreparacin.setBounds(10, 286, 162, 14);
		contentPane.add(lblInstruccinDePreparacin);
		
		JTextArea textAreaInstruccionPrep = new JTextArea();
		textAreaInstruccionPrep.setBounds(10, 302, 162, 57);
		contentPane.add(textAreaInstruccionPrep);
		
		JLabel lblDificultad = new JLabel("Dificultad: ");
		lblDificultad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDificultad.setBounds(10, 195, 69, 14);
		contentPane.add(lblDificultad);
		
		JComboBox comboBoxOpciones = new JComboBox();
		comboBoxOpciones.setBounds(10, 208, 162, 22);
		 DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
		 	comboBoxModel.addElement("");
	        comboBoxModel.addElement("Fácil");
	        comboBoxModel.addElement("Intermedio");
	        comboBoxModel.addElement("Difícil");

	        comboBoxOpciones.setModel(comboBoxModel);
	        contentPane.add(comboBoxOpciones);
	        
	        JLabel lblNombreDeIngrediente = new JLabel("Nombre de Ingrediente: ");
	        lblNombreDeIngrediente.setFont(new Font("Tahoma", Font.PLAIN, 12));
	        lblNombreDeIngrediente.setBounds(196, 105, 162, 14);
	        contentPane.add(lblNombreDeIngrediente);
	        
	        textFieldNombreIngred = new JTextField();
	        textFieldNombreIngred.setColumns(10);
	        textFieldNombreIngred.setBounds(196, 119, 162, 20);
	        contentPane.add(textFieldNombreIngred);
	        
	        JLabel lblMedida = new JLabel("Medida:");
	        lblMedida.setFont(new Font("Tahoma", Font.PLAIN, 12));
	        lblMedida.setBounds(196, 150, 69, 14);
	        contentPane.add(lblMedida);
	        
	        textFieldMedida = new JTextField();
	        textFieldMedida.setColumns(10);
	        textFieldMedida.setBounds(196, 164, 162, 20);
	        contentPane.add(textFieldMedida);
	        
	        JLabel lblCantidad = new JLabel("Cantidad: ");
	        lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 12));
	        lblCantidad.setBounds(196, 196, 69, 14);
	        contentPane.add(lblCantidad);
	        
	        textFieldCantidad = new JTextField();
	        textFieldCantidad.setColumns(10);
	        textFieldCantidad.setBounds(196, 210, 162, 20);
	        contentPane.add(textFieldCantidad);
	        
	        JLabel lblTitleComentarios = new JLabel("COMENTARIO:");
	        lblTitleComentarios.setFont(new Font("Tahoma", Font.BOLD, 12));
	        lblTitleComentarios.setBounds(395, 80, 103, 14);
	        contentPane.add(lblTitleComentarios);
	        
	        JLabel lblNombreDelAutor = new JLabel("Nombre del Autor: ");
	        lblNombreDelAutor.setFont(new Font("Tahoma", Font.PLAIN, 12));
	        lblNombreDelAutor.setBounds(395, 105, 162, 14);
	        contentPane.add(lblNombreDelAutor);
	        
	        textFieldNombreAutor = new JTextField();
	        textFieldNombreAutor.setColumns(10);
	        textFieldNombreAutor.setBounds(395, 119, 162, 20);
	        contentPane.add(textFieldNombreAutor);
	        
	        JLabel lblFecha = new JLabel("Fecha: ");
	        lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 12));
	        lblFecha.setBounds(395, 150, 69, 14);
	        contentPane.add(lblFecha);
	        
	        textFieldFecha = new JTextField();
	        textFieldFecha.setColumns(10);
	        textFieldFecha.setBounds(395, 164, 162, 20);
	        contentPane.add(textFieldFecha);
	        
	        JLabel lblComentario = new JLabel("Comentario: ");
	        lblComentario.setFont(new Font("Tahoma", Font.PLAIN, 12));
	        lblComentario.setBounds(395, 195, 162, 14);
	        contentPane.add(lblComentario);
	        
	        JTextArea textAreaComentario = new JTextArea();
	        textAreaComentario.setBounds(395, 211, 162, 57);
	        contentPane.add(textAreaComentario);
	        
	        JLabel lblCategoria = new JLabel("Categoria: ");
	        lblCategoria.setFont(new Font("Tahoma", Font.PLAIN, 12));
	        lblCategoria.setBounds(10, 241, 69, 14);
	        contentPane.add(lblCategoria);
	        
	        textFieldCategoria = new JTextField();
	        textFieldCategoria.setColumns(10);
	        textFieldCategoria.setBounds(10, 255, 162, 20);
	        contentPane.add(textFieldCategoria);
	        
	        JLabel lblTitleIngredientes = new JLabel("INGREDIENTE:");
	        lblTitleIngredientes.setFont(new Font("Tahoma", Font.BOLD, 12));
	        lblTitleIngredientes.setBounds(196, 81, 103, 14);
	        contentPane.add(lblTitleIngredientes);
	        
	        JLabel lblTitleFavorito = new JLabel("FAVORITO:");
	        lblTitleFavorito.setFont(new Font("Tahoma", Font.BOLD, 12));
	        lblTitleFavorito.setBounds(584, 81, 103, 14);
	        contentPane.add(lblTitleFavorito);
	        
	        JButton btnGuardar = new JButton("GUARDAR");
	        btnGuardar.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		
	        	}
	        });
	        btnGuardar.setBounds(378, 422, 120, 36);
	        contentPane.add(btnGuardar);
	        
	        JLabel lblTitleReceta = new JLabel("RECETA:");
	        lblTitleReceta.setFont(new Font("Tahoma", Font.BOLD, 12));
	        lblTitleReceta.setBounds(10, 80, 162, 14);
	        contentPane.add(lblTitleReceta);
	}
}
