package SegPar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class WinCliente {

	private JFrame frmPdPractica;
	private JTextField txtId;
	private JTextField txtNombre;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WinCliente window = new WinCliente();
					window.frmPdPractica.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WinCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPdPractica = new JFrame();
		frmPdPractica.setTitle("Crud Practice");
		frmPdPractica.setBounds(100, 100, 600, 192);
		frmPdPractica.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPdPractica.getContentPane().setLayout(null);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(10, 11, 46, 14);
		frmPdPractica.getContentPane().add(lblId);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(20, 36, 46, 14);
		frmPdPractica.getContentPane().add(lblNombre);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(30, 61, 56, 14);
		frmPdPractica.getContentPane().add(lblDireccion);
		
		JLabel lblNewLabel = new JLabel("Telefono");
		lblNewLabel.setBounds(40, 86, 56, 14);
		frmPdPractica.getContentPane().add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(50, 111, 46, 14);
		frmPdPractica.getContentPane().add(lblEmail);
		
		txtId = new JTextField();
		txtId.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtId.getText().length()>=3) {
					e.consume();
					}
			}
		});
		txtId.setBounds(88, 8, 140, 20);
		frmPdPractica.getContentPane().add(txtId);
		txtId.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtNombre.getText().length()>=50) {
					e.consume();
					}
			}
		});
		txtNombre.setColumns(10);
		txtNombre.setBounds(98, 33, 140, 20);
		frmPdPractica.getContentPane().add(txtNombre);
		
		txtDireccion = new JTextField();
		txtDireccion.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtDireccion.getText().length()>=100) {
					e.consume();
					}
			}
		});
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(108, 58, 140, 20);
		frmPdPractica.getContentPane().add(txtDireccion);
		
		txtTelefono = new JTextField();
		txtTelefono.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtTelefono.getText().length()>=10) {
					e.consume();
					}
			}
		});
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(118, 83, 140, 20);
		frmPdPractica.getContentPane().add(txtTelefono);
		
		txtEmail = new JTextField();
		txtEmail.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtEmail.getText().length()>=40) {
					e.consume();
					}
			}
		});
		txtEmail.setColumns(10);
		txtEmail.setBounds(128, 108, 140, 20);
		frmPdPractica.getContentPane().add(txtEmail);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cliente np = new cliente();
					np.setId(txtId.getText());
					np.setNombre(txtNombre.getText());
					np.setDireccion(txtDireccion.getText());
					np.setTelefono(txtTelefono.getText());
					np.setEmail(txtEmail.getText());
					limpiar();
					if(np.insertarCliente()) {
						limpiar();
						JOptionPane.showMessageDialog(null, "Cliente Registrado");
					}else {
						JOptionPane.showMessageDialog(null, "ERROR :(");
					}
				}catch (Exception e2){
					JOptionPane.showMessageDialog(null, "ERROR :(");
				}
			}
		});
		btnInsertar.setBounds(367, 7, 89, 23);
		frmPdPractica.getContentPane().add(btnInsertar);
		
		JButton btnCargar = new JButton("Cargar");
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String Id = JOptionPane.showInputDialog("ID del Cliente");
					cliente np = new cliente();
					np.setId(Id);
					if (np.cargarCliente()) {
					txtId.setText(""+np.getId());
					txtNombre.setText(np.getNombre());
					txtDireccion.setText(np.getDireccion());
					txtTelefono.setText(""+np.getTelefono());
					txtEmail.setText(""+np.getEmail());
					JOptionPane.showMessageDialog(null, "Cliente Encontrado");
					} else {
					JOptionPane.showMessageDialog(null, "ERROR :(");
					}
					} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ERROR :(");
					}
			}
		});
		btnCargar.setBounds(377, 32, 89, 23);
		frmPdPractica.getContentPane().add(btnCargar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cliente np= new cliente();
					np.setId(txtId.getText());
					np.setNombre(txtNombre.getText());
					np.setDireccion(txtDireccion.getText());
					np.setTelefono(txtTelefono.getText());
					np.setEmail(txtEmail.getText());
					if (np.actualizarCliente()) {
					limpiar();
					JOptionPane.showMessageDialog(null, "Datos de Cliente Actualizado");
					} else {
					JOptionPane.showMessageDialog(null, "ERROR :(");
					}
					} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ERROR :(");
					}
			}
		});
		btnActualizar.setBounds(387, 57, 89, 23);
		frmPdPractica.getContentPane().add(btnActualizar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String Id = JOptionPane.showInputDialog("Id del Cliente a eliminar");
					cliente np = new cliente();
					np.setId(Id);
					if (np.eliminarCliente()) {
					JOptionPane.showMessageDialog(null, "Cliente Eliminado");
					} else {
					JOptionPane.showMessageDialog(null, "ERROR :(");
					}
					} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ERROR :(");
					}
			}
		});
		btnEliminar.setBounds(397, 82, 89, 23);
		frmPdPractica.getContentPane().add(btnEliminar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiar();
			}
		});
		btnBorrar.setBounds(407, 111, 89, 23);
		frmPdPractica.getContentPane().add(btnBorrar);
	}
	public void limpiar() {
		txtId.setText("");
		txtNombre.setText("");
		txtDireccion.setText("");
		txtTelefono.setText("");
		txtEmail.setText("");
	}
}
