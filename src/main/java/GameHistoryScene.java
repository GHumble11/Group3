import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.collections.FXCollections;

public class GameHistoryScene extends Scene{

    private Button back = new Button("Back");

    public GameHistoryScene(Stage startingStage) {

        super(new BorderPane());
        BorderPane stageLayout = (BorderPane)this.getRoot();
        Label headerLabel = new Label("GAME RECORDS");
        VBox listOfGames = new VBox(10);
        HBox header = new HBox();
        HBox game = new HBox(5);
        HBox backBox = new HBox();

        header.getChildren().add(headerLabel);
        game.getChildren().addAll(new ListView(Main.games));
        listOfGames.getChildren().addAll(new ListView(Main.games), backBox);
        backBox.getChildren().add(back);

        header.setAlignment(Pos.CENTER);
        game.setAlignment(Pos.CENTER);
        listOfGames.setAlignment(Pos.CENTER);
        backBox.setAlignment(Pos.BOTTOM_CENTER);

        stageLayout.setTop(header);
        stageLayout.setCenter(listOfGames);
    }

    /*
    public String createGameHistory()
    {
        int i = 0;
        for(Game game:Main.games)
        {
            System.out.println(game.getGame());
            output.append(game.getGame());
            output.append(i);
            i++;
        }
    }
     */

    public void setBackButtonTargets(Stage mainStage, Scene targetScene) {
        back.setOnAction(e -> mainStage.setScene(targetScene));
    }
}
