import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.PipedOutputStream;

public class Main extends Application {

    /** Set up a maven run profile in intellij or use maven from the command-line.
        Use the javafx:run argument to start the javafx application.
        Update all code and comments in this tempalte to suit your own project.
     */

    private Stage startingStage = null;
    private Stage inputGameStage = null;
    private Stage viewRecordsStage = null;

    private Button inputGameInfo = new Button("Input game");   // input new game information
    private Button viewGame = new Button("View past games");   // view past game information

    private Button p1rockButton = new Button("Rock");
    private Button p1paperButton = new Button("Paper");
    private Button p1scissorsButton = new Button("Scissors");
    private Button p2rockButton = new Button("Rock");
    private Button p2paperButton = new Button("Paper");
    private Button p2scissorsButton = new Button("Scissors");

    private Label fakeData1 = new Label("___");
    private Label fakeData2 = new Label("___");
    private Label fakeData3 = new Label("___");
    private Label fakeData4 = new Label("___");
    private Button fakeName1 = new Button("GAME 1");
    private Button fakeName2 = new Button("GAME 2");


// VIEW GAME RECORD DETAILS
    public void viewRecordDetails(Stage viewRecordDetailsStage) {

        viewRecordDetailsStage.setTitle("Specific game records");
        BorderPane stageLayout = new BorderPane();
        Label headerLabel = new Label("GAME DETAILS");
        Label roundNumber = new Label("Round 1");
        Label roundNumber2 = new Label("Round 2");
        VBox listOfGames = new VBox(10);
        HBox header = new HBox();
        HBox game = new HBox(5);
        HBox game2 = new HBox(5);

        header.getChildren().add(headerLabel);
        game.getChildren().addAll(roundNumber, fakeData1,fakeData2);
        game2.getChildren().addAll(roundNumber2, fakeData3,fakeData4);
        listOfGames.getChildren().addAll(game, game2);

        header.setAlignment(Pos.CENTER);
        game.setAlignment(Pos.CENTER);
        game2.setAlignment(Pos.CENTER);
        listOfGames.setAlignment(Pos.CENTER);

        stageLayout.setTop(header);
        stageLayout.setCenter(listOfGames);
    }
//VIEW RECORDS OF GAMES
    public void viewRecords(Stage viewRecordsStage) {

        viewRecordsStage.setTitle("List of all played games");
        BorderPane stageLayout = new BorderPane();
        Label headerLabel = new Label("GAME RECORDS");
        VBox listOfGames = new VBox(10);
        HBox header = new HBox();
        HBox game = new HBox(5);
        HBox game2 = new HBox(5);

        header.getChildren().add(headerLabel);
        game.getChildren().addAll(fakeName1,fakeData1,fakeData2);
        game2.getChildren().addAll(fakeName2, fakeData3,fakeData4);
        listOfGames.getChildren().addAll(game, game2);

        header.setAlignment(Pos.CENTER);
        game.setAlignment(Pos.CENTER);
        game2.setAlignment(Pos.CENTER);
        listOfGames.setAlignment(Pos.CENTER);

        stageLayout.setTop(header);
        stageLayout.setCenter(listOfGames);


    }
//INPUT GAME INFO
    public void inputGame(Stage inputGameStage) {

        inputGameStage.setTitle("Input new game information");
        BorderPane stageLayout = new BorderPane();
        Label p1Label = new Label("PLAYER 1");
        Label p2Label = new Label("PLAYER 2");
        VBox playerOneButtonPanel = new VBox(10);
        VBox playerTwoButtonPanel = new VBox(10);

        playerOneButtonPanel.getChildren().addAll(p1Label, p1rockButton, p1paperButton, p1scissorsButton);
        playerTwoButtonPanel.getChildren().addAll(p2Label, p2rockButton, p2paperButton, p2scissorsButton);

        playerOneButtonPanel.setAlignment(Pos.CENTER);
        playerTwoButtonPanel.setAlignment(Pos.CENTER);

        stageLayout.setLeft(playerOneButtonPanel);
        stageLayout.setRight(playerTwoButtonPanel);

    }
// MENU
    @Override
    public void start(Stage startingStage) {

        startingStage.setTitle("Rock Paper Scissors Tracker");
        BorderPane stageLayout = new BorderPane();
        VBox options = new VBox(50);

        options.getChildren().addAll(inputGameInfo, viewGame);

        options.setAlignment(Pos.CENTER);

        stageLayout.setCenter(options);


        Scene scene = new Scene(stageLayout, 200, 300);
        startingStage.setScene(scene);
        startingStage.show();


    }



    public static void main(String[] args) {
        launch();
    }

}
