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
        startButton.setTranslateY(-100);
        startButton.setMaxSize(150, 50);
        startButton.setStyle("-fx-background-color: green");

        Button optionsButton = new Button("Options");
        optionsButton.setMaxSize(150, 50);
        optionsButton.setStyle("-fx-background-color: blue");

        Button exitButton = new Button("Exit");
        exitButton.setTranslateY(100);
        exitButton.setMaxSize(150, 50);
        exitButton.setStyle("-fx-border-color: yellow");
        exitButton.setStyle("-fx-border-width: 1px");
        exitButton.setStyle("-fx-border-style: solid");
        exitButton.setStyle("-fx-background-color: red");


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
