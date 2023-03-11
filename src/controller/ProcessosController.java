package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import view.Executar;


public class ProcessosController implements ActionListener {
	private JTextField textfield;
	private JFrame frame;

	
	public ProcessosController(JTextField textfield, JFrame frame ) {
		this.textfield=textfield;
		this.frame=frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		RecebeProcesso();
		frame.dispose();
		}
	
	public void RecebeProcesso() {
		try {
			Runtime.getRuntime().exec(textfield.getText());
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,"ERRO" + JOptionPane.ERROR_MESSAGE);
		}
		
	}
	

		
	
	
	

}
