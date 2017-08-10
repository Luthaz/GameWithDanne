import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
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

        Button startButton = new Button("Start");

        Button optionsButton = new Button("Options");

        Button exitButton = new Button("Exit");

        StackPane pane = new StackPane();
        pane.getChildren().add(startButton);
        pane.getChildren().add(optionsButton);
        pane.getChildren().add(exitButton);

        Scene scene = new Scene(pane);

        primaryStage.setTitle("Sagan om den stora dasen");
        primaryStage.setMaximized(true);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
