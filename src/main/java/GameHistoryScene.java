import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GameHistoryScene extends Scene{

    private Label results = new Label("_____");
    private Button fakeName1 = new Button("GAME 1");
    private Button fakeName2 = new Button("GAME 2");

    private Button back = new Button("Back");

    public GameHistoryScene(Stage startingStage) {

        super(new BorderPane());
        BorderPane stageLayout = (BorderPane)this.getRoot();
        Label headerLabel = new Label("GAME RECORDS");
        VBox listOfGames = new VBox(10);
        HBox header = new HBox();
        HBox game = new HBox(5);
        HBox game2 = new HBox(5);
        HBox backBox = new HBox();

        header.getChildren().add(headerLabel);
        game.getChildren().addAll(fakeName1, results);
       // game2.getChildren().addAll(fakeName2, results);
        listOfGames.getChildren().addAll(game, game2, backBox);
        backBox.getChildren().add(back);

        header.setAlignment(Pos.CENTER);
        game.setAlignment(Pos.CENTER);
        game2.setAlignment(Pos.CENTER);
        listOfGames.setAlignment(Pos.CENTER);
        backBox.setAlignment(Pos.CENTER);

        stageLayout.setTop(header);
        stageLayout.setCenter(listOfGames);

        GameDetailsScene gameDetailsScene = new GameDetailsScene();
        fakeName1.setOnAction(e -> {
            startingStage.setScene(gameDetailsScene);
        });
    }

    public void setBackButtonTargets(Stage mainStage, Scene targetScene) {
        back.setOnAction(e -> mainStage.setScene(targetScene));
    }
}
