package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class CancelarController implements ActionListener {
	private JFrame frame;
	
	public CancelarController(JFrame frame) {
		this.frame=frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame.dispose();
		
	}

}
