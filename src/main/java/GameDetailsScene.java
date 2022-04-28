import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GameDetailsScene extends Scene {

    private Label fakeData1 = new Label("___");
    private Label fakeData2 = new Label("___");
    private Label fakeData3 = new Label("___");
    private Label fakeData4 = new Label("___");

    private Button back = new Button("Back");

    public GameDetailsScene() {

        super(new BorderPane());
        BorderPane stageLayout = (BorderPane)this.getRoot();
        Label headerLabel = new Label("GAME DETAILS");
        Label roundNumber = new Label("Round 1");
        Label roundNumber2 = new Label("Round 2");
        VBox listOfGames = new VBox(10);
        HBox header = new HBox();
        HBox game = new HBox(5);
        HBox game2 = new HBox(5);
        HBox backBox = new HBox();

        header.getChildren().add(headerLabel);
        game.getChildren().addAll(roundNumber, fakeData1,fakeData2);
        game2.getChildren().addAll(roundNumber2, fakeData3,fakeData4);
        listOfGames.getChildren().addAll(game, game2, backBox);
        backBox.getChildren().add(back);

        header.setAlignment(Pos.CENTER);
        game.setAlignment(Pos.CENTER);
        game2.setAlignment(Pos.CENTER);
        listOfGames.setAlignment(Pos.CENTER);
        backBox.setAlignment(Pos.CENTER);

        stageLayout.setTop(header);
        stageLayout.setCenter(listOfGames);



    }



    public void setBackButtonTargets(Stage mainStage, Scene targetScene) {
        back.setOnAction(e -> mainStage.setScene(targetScene));
    }

}
