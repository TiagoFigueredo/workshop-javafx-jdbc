package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {
	
	@FXML
	private MenuItem ButtonVendedor;
	
	@FXML
	private MenuItem ButtonDepartamento;
	
	@FXML
	private MenuItem ButtonAbout;
	
	@FXML
	public void onButtonVendedorAction() {
		System.out.println("BOTAO VENDEDOR");
	}
	
	@FXML
	public void onButtonDepartamentoAction() {
		System.out.println("BOTAO DEPARTAMENTO");
	}
	
	@FXML
	public void onButtonAboutAction() {
		System.out.println("BOTAO ABOUT");
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
	}

}
