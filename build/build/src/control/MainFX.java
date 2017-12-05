package control;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;


/**
 * 
 * @author jose
 * @version 1.0
 * @see vista.ControlFx
 * @see vista.ControlFx2
 * 
 * Metodo para arrancar la app
 *
 */
public class MainFX extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		  FXMLLoader loader =new FXMLLoader(getClass().getResource("../vista/Login.fxml"));
	        AnchorPane pane=loader.load();
	        Scene scene=new Scene(pane);
	        scene.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
	        Font.loadFont(getClass().getResourceAsStream("../vista/assets/fonts/PoiretOne-Regular.ttf"), 20);
	        primaryStage.setTitle("PruebaJFX");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
