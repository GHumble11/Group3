import com.sun.javafx.scene.control.LabeledText;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.ListView;

public class GameHistoryScene extends Scene{

    private ListView gamesList = new ListView(Main.games);
    private Button back = new Button("Back");
    String output = "";
    Alert resultPopup;

    public GameHistoryScene(Stage startingStage) {

        super(new BorderPane());
        BorderPane stageLayout = (BorderPane)this.getRoot();
        Label headerLabel = new Label("GAME RECORDS");
        VBox listOfGames = new VBox(10);
        HBox header = new HBox();
        HBox game = new HBox(5);
        HBox backBox = new HBox();



        header.getChildren().add(headerLabel);
        game.getChildren().addAll(gamesList);
        listOfGames.getChildren().addAll(gamesList, backBox);
        backBox.getChildren().add(back);

        header.setAlignment(Pos.CENTER);
        game.setAlignment(Pos.CENTER);
        listOfGames.setAlignment(Pos.CENTER);
        backBox.setAlignment(Pos.BOTTOM_CENTER);

        stageLayout.setTop(header);
        stageLayout.setCenter(listOfGames);

        gamesList.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                for (Game game : Main.gameObjects)
                {
                    if (gamesList.getSelectionModel().getSelectedIndex() == game.getID())
                    {
                        output = ("Game ID:" + game.getID() + " Player 1 threw " + game.getP1ThrowString() + " and player 2 threw " + game.getP2ThrowString());
                        resultPopup = new Alert(Alert.AlertType.INFORMATION, output);
                        System.out.println(mouseEvent.getTarget());
                        resultPopup.show();
                    }
                }
            }
        });
    }
    public void setBackButtonTargets(Stage mainStage, Scene targetScene) {
        back.setOnAction(e -> mainStage.setScene(targetScene));
    }
}
