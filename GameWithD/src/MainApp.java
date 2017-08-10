import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Created by Lukas on 10/08/2017.
 */
public class MainApp extends Application {
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
    	
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("main.fxml"));
    	
        primaryStage.setTitle("Sagan om den stora dasen");
        primaryStage.setMaximized(true);
        primaryStage.setScene(new Scene(loader.load()));

        primaryStage.show();
    }
}
