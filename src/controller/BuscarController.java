package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class BuscarController implements ActionListener {
private JTextField textfield;
	
	public BuscarController(JTextField textfield) {
		this.textfield=textfield;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		BuscarProcesso();
		}
	
	public void BuscarProcesso(){
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivos Executaveis (.exe)", "exe");
		String diretoriobase = System.getProperty("user.home")+"/Desktop";
		File dir= new File(diretoriobase);
		JFileChooser chooser = new JFileChooser();
		chooser.setCurrentDirectory(dir);
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		chooser.setAcceptAllFileFilterUsed(false);
		chooser.addChoosableFileFilter(filtro);
		String caminhoArquivo="";
		int retorno = chooser.showOpenDialog(null);
		if (retorno==JFileChooser.APPROVE_OPTION) {
			caminhoArquivo=chooser.getSelectedFile().getAbsolutePath();
			textfield.setText(caminhoArquivo);
		}
		
	}

}
