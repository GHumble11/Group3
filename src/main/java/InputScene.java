import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class InputScene extends Scene {
    private Button p1rockButton = new Button("Rock");
    private Button p1paperButton = new Button("Paper");
    private Button p1scissorsButton = new Button("Scissors");
    private Button p2rockButton = new Button("Rock");
    private Button p2paperButton = new Button("Paper");
    private Button p2scissorsButton = new Button("Scissors");

    private Button back = new Button("back");

    public InputScene() {
        super(new BorderPane());
        BorderPane stageLayout = (BorderPane)this.getRoot();
        Label p1Label = new Label("PLAYER 1");
        Label p2Label = new Label("PLAYER 2");
        VBox playerOneButtonPanel = new VBox(10);
        VBox playerTwoButtonPanel = new VBox(10);

        playerOneButtonPanel.getChildren().addAll(p1Label, p1rockButton, p1paperButton, p1scissorsButton);
        playerTwoButtonPanel.getChildren().addAll(p2Label, p2rockButton, p2paperButton, p2scissorsButton, back);

        playerOneButtonPanel.setAlignment(Pos.CENTER);
        playerTwoButtonPanel.setAlignment(Pos.CENTER);
        stageLayout.setLeft(playerOneButtonPanel);
        stageLayout.setRight(playerTwoButtonPanel);
    }

    public void setBackButtonTargets(Stage mainStage, Scene targetScene) {
        back.setOnAction(e -> mainStage.setScene(targetScene));
    }
}
