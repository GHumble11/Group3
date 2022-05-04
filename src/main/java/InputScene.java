import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicReference;

public class InputScene extends Scene {


    private Button back = new Button("Back");
    private Button submit = new Button("Submit");


    RadioButton rock = new RadioButton("Rock");
    RadioButton paper = new RadioButton("Paper");
    RadioButton scissors = new RadioButton("Scissors");
    RadioButton rock2 = new RadioButton("Rock");
    RadioButton paper2 = new RadioButton("Paper");
    RadioButton scissors2 = new RadioButton("Scissors");

    ToggleGroup move1 = new ToggleGroup();
    ToggleGroup move2 = new ToggleGroup();

    Integer playerOneThrow = -1;
    Integer playerTwoThrow = -1;

    //String[][] resultsArray = new String[3][3];

    Game result;
    String gameResult = "";

    public InputScene() {
        super(new BorderPane());
        BorderPane stageLayout = (BorderPane)this.getRoot();
        Label p1Label = new Label("PLAYER 1");
        Label p2Label = new Label("PLAYER 2");
        VBox move1Layout = new VBox(5);
        VBox move2Layout = new VBox(5);
        HBox submitLayout = new HBox();

        rock.setToggleGroup(move1);
        paper.setToggleGroup(move1);
        scissors.setToggleGroup(move1);
        rock2.setToggleGroup(move2);
        paper2.setToggleGroup(move2);
        scissors2.setToggleGroup(move2);

        move1Layout.setPadding(new Insets(15,15,15,15));
        move2Layout.setPadding(new Insets(15,15,15,15));
        move1Layout.getChildren().addAll(p1Label, rock, paper, scissors);
        move2Layout.getChildren().addAll(p2Label, rock2, paper2, scissors2);
        submitLayout.getChildren().addAll(back, submit);

        move1Layout.setAlignment(Pos.CENTER_LEFT);
        move2Layout.setAlignment(Pos.CENTER_LEFT);
        submitLayout.setAlignment(Pos.CENTER);

        stageLayout.setLeft(move1Layout);
        stageLayout.setRight(move2Layout);
        stageLayout.setBottom(submitLayout);

        //GAME RESULTS ARRAY
        /*
        resultsArray [0][0] = "D"; //Draw
        resultsArray [0][1] = "2W"; //PLAYER 2 WINS
        resultsArray [0][2] = "1W"; //PLAYER 1 WINS
        resultsArray [1][0] = "1W";
        resultsArray [1][1] = "D";
        resultsArray [1][2] = "2W";
        resultsArray [2][0] = "2W";
        resultsArray [2][1] = "1W";
        resultsArray [2][2] = "D";


         */
        submit.setOnAction(e -> {
            getMoves();
            Alert resultPopup = new Alert(Alert.AlertType.INFORMATION, result.getGame());
            resultPopup.show();
        });
    }


    public void setBackButtonTargets(Stage mainStage, Scene targetScene) {
        back.setOnAction(e -> mainStage.setScene(targetScene));
    }



    public Game getMoves() {
        if (move1.getSelectedToggle() == rock) {
            playerOneThrow = 0;
        }
        else if (move1.getSelectedToggle() == paper) {
            playerOneThrow = 1;
        }
        else playerOneThrow = 2;

        if (move2.getSelectedToggle() == rock2) {
            playerTwoThrow = 0;
        }
        else if (move2.getSelectedToggle() == paper2) {
            playerTwoThrow = 1;
        }
        else playerTwoThrow = 2;

        result = new Game(playerOneThrow, playerTwoThrow);

        /*
        if (result.equals("1W")) {
            gameResult = "Player One Wins";
        }
        else if (result.equals("2W")) {
            gameResult = "Player Two Wins";
        }
        else gameResult = "No Winner";


         */
        System.out.println(result.getGame());
        return result;
    }
}