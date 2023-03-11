package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.BuscarController;
import controller.CancelarController;
import controller.ProcessosController;

public class Executar extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JButton OkButton;
	private JButton CancelarButton;
	private JButton ProcurarButton;
	private JFrame Executar;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Executar frame = new Executar();
					frame.setVisible(true);
					frame.setResizable(false);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			};
		});
	}

	/**
	 * Create the frame.
	 */
	public Executar() {
		
		setTitle("Executar");
		
		getContentPane().setLayout(null);
		setBounds(100,100,650,200);
		JLabel lblNewLabel = new JLabel("Digite o caminho do executavel ou procure o mesmo.");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(109, 45, 354, 34);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setBounds(61, 89, 460, 25);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Abrir:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 90, 70, 19);
		getContentPane().add(lblNewLabel_1);
		
		OkButton = new JButton("Ok");
		OkButton.setForeground(Color.BLACK);
		OkButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		OkButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		OkButton.setBounds(71, 131, 85, 25);
		getContentPane().add(OkButton);
		
		CancelarButton = new JButton("Cancelar");
		CancelarButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		CancelarButton.setBounds(166, 130, 105, 26);
		getContentPane().add(CancelarButton);
		
		ProcurarButton = new JButton("Procurar");
		ProcurarButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		ProcurarButton.setBounds(278, 131, 105, 25);
		getContentPane().add(ProcurarButton);
		
		BuscarController buscar = new BuscarController(textField);
		ProcessosController m = new ProcessosController(textField,this);
		CancelarController cancela = new CancelarController(this);
		OkButton.addActionListener(m);
		CancelarButton.addActionListener(cancela);
		ProcurarButton.addActionListener(buscar);
		
	}
	
	
	
}
