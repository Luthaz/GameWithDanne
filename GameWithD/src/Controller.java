import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {
	
    @FXML
    public Button startButton;
    
    @FXML
    public Button optionsButton;
    
    @FXML
    public Button exitButton;
 
    public void handlePressMe(){
        System.out.println("Danneboi är king");
    }
}
