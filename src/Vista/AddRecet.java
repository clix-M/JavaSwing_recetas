package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class AddRecet extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNomRece;
	private JTextField textFieldTimePrepar;
	private JTextField textFieldNomIngre;
	private JTextField textFieldMedida;
	private JTextField textFieldAutor;
	private JTextField textFieldFecha;
	private JTextField textFieldCantidad;
	private JComboBox<String> comboBoxOptionDif;
	private JComboBox<String> comboBoxOptionCat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddRecet frame = new AddRecet();
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
	public AddRecet() {
		setBounds(100, 100, 739, 521);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("CREA TU RECETA");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitle.setBounds(287, 11, 156, 14);
		contentPane.add(lblTitle);
		
		JLabel lblNom = new JLabel("Nombre: ");
		lblNom.setBounds(95, 79, 62, 14);
		contentPane.add(lblNom);
		
		textFieldNomRece = new JTextField();
		textFieldNomRece.setBounds(151, 76, 136, 20);
		contentPane.add(textFieldNomRece);
		textFieldNomRece.setColumns(10);
		
		JLabel lblDescri = new JLabel("Descripcion: ");
		lblDescri.setBounds(95, 108, 192, 14);
		contentPane.add(lblDescri);
		
		JTextArea textAreaDescrip = new JTextArea();
		textAreaDescrip.setBounds(95, 122, 191, 63);
		contentPane.add(textAreaDescrip);
		
		JLabel lblTimePrep = new JLabel("Tiempo de Preparación: ");
		lblTimePrep.setBounds(95, 194, 150, 14);
		contentPane.add(lblTimePrep);
		
		textFieldTimePrepar = new JTextField();
		textFieldTimePrepar.setBounds(238, 191, 49, 20);
		contentPane.add(textFieldTimePrepar);
		textFieldTimePrepar.setColumns(10);
		
		JLabel lblDetallPrep = new JLabel("Instrución de Preparación: ");
		lblDetallPrep.setBounds(95, 228, 192, 14);
		contentPane.add(lblDetallPrep);
		
		JTextArea textAreaDetailPrep = new JTextArea();
		textAreaDetailPrep.setBounds(95, 242, 191, 63);
		contentPane.add(textAreaDetailPrep);
		
		JLabel lblDificult = new JLabel("Dificultad: ");
		lblDificult.setBounds(95, 315, 77, 14);
		contentPane.add(lblDificult);
		
		JComboBox comboBoxOptionDif = new JComboBox();
		comboBoxOptionDif.setBounds(163, 316, 124, 20);
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
        comboBoxModel.addElement("");
        comboBoxModel.addElement("Fácil");
        comboBoxModel.addElement("Medio");
        comboBoxModel.addElement("Difícil");

        comboBoxOptionDif.setModel(comboBoxModel);
		contentPane.add(comboBoxOptionDif);
		
		JLabel lblSubTitleIngred = new JLabel("INGREDIENTE:");
		lblSubTitleIngred.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSubTitleIngred.setBounds(396, 79, 188, 14);
		contentPane.add(lblSubTitleIngred);
		
		JLabel lblNomIngre = new JLabel("Nombre: ");
		lblNomIngre.setBounds(392, 120, 62, 14);
		contentPane.add(lblNomIngre);
		
		textFieldNomIngre = new JTextField();
		textFieldNomIngre.setColumns(10);
		textFieldNomIngre.setBounds(448, 117, 136, 20);
		contentPane.add(textFieldNomIngre);
		
		JLabel lblMedida = new JLabel("Medida: ");
		lblMedida.setBounds(392, 149, 62, 14);
		contentPane.add(lblMedida);
		
		textFieldMedida = new JTextField();
		textFieldMedida.setColumns(10);
		textFieldMedida.setBounds(448, 146, 136, 20);
		contentPane.add(textFieldMedida);
		
		JLabel lblSubTitleComent = new JLabel("COMENTARIO: ");
		lblSubTitleComent.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSubTitleComent.setBounds(392, 232, 188, 14);
		contentPane.add(lblSubTitleComent);
		
		JLabel lblAutor = new JLabel("Autor: ");
		lblAutor.setBounds(392, 270, 62, 14);
		contentPane.add(lblAutor);
		
		textFieldAutor = new JTextField();
		textFieldAutor.setColumns(10);
		textFieldAutor.setBounds(448, 267, 136, 20);
		contentPane.add(textFieldAutor);
		
		JLabel lblFecha = new JLabel("Fecha: ");
		lblFecha.setBounds(392, 298, 62, 14);
		contentPane.add(lblFecha);
		
		textFieldFecha = new JTextField();
		textFieldFecha.setColumns(10);
		textFieldFecha.setBounds(448, 295, 136, 20);
		contentPane.add(textFieldFecha);
		
		JLabel lblComent = new JLabel("Comentario: ");
		lblComent.setBounds(392, 328, 150, 14);
		contentPane.add(lblComent);
		
		JTextArea textAreaComentario = new JTextArea();
		textAreaComentario.setBounds(392, 342, 191, 63);
		contentPane.add(textAreaComentario);
		
		JLabel lblCateg = new JLabel("Categoria: ");
		lblCateg.setBounds(95, 347, 77, 14);
		contentPane.add(lblCateg);
		
		JComboBox comboBoxOptionCat = new JComboBox();
		comboBoxOptionCat.setBounds(163, 348, 124, 20);
        DefaultComboBoxModel<String> comboBoxModel2 = new DefaultComboBoxModel<>();
        comboBoxModel2.addElement("");
        comboBoxModel2.addElement("Test");
        comboBoxModel2.addElement("Test2");
        comboBoxModel2.addElement("Test3");

        comboBoxOptionCat.setModel(comboBoxModel2);
		contentPane.add(comboBoxOptionCat);
		
		JLabel lblCantidad = new JLabel("Cantidad: ");
		lblCantidad.setBounds(392, 178, 62, 14);
		contentPane.add(lblCantidad);
		
		textFieldCantidad = new JTextField();
		textFieldCantidad.setColumns(10);
		textFieldCantidad.setBounds(448, 175, 136, 20);
		contentPane.add(textFieldCantidad);
		
		JButton btnCrear = new JButton("CREAR");
		btnCrear.setBounds(306, 436, 116, 35);
		contentPane.add(btnCrear);
	}
}
