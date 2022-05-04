import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GameHistoryScene extends Scene{

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
        String gameList = createGameHistory();
        Label results = new Label(gameList);
        game.getChildren().addAll(results);
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

    public String createGameHistory()
    {
        int i = 0;
        StringBuilder output = new StringBuilder("Nothing");
        for(Game game:Main.games)
        {
            System.out.println(game.getGame());
            output.append(game.getGame());
            output.append(i);
            i++;
        }
        return output.toString();
    }

    public void setBackButtonTargets(Stage mainStage, Scene targetScene) {
        back.setOnAction(e -> mainStage.setScene(targetScene));
    }
}
