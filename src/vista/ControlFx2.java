package vista;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
/**
 * 
 * @author jose
 *@version 1.0
 */
public class ControlFx2 implements Initializable{

	@FXML
	JFXButton action2;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Metodo para apagar la app
	 * 
	 */
	@FXML
	public void exit(){
		System.exit(0);
	}
	

}
