import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.awt.*;
import java.io.PipedOutputStream;

public class Main extends Application {

    /** Set up a maven run profile in intellij or use maven from the command-line.
        Use the javafx:run argument to start the javafx application.
        Update all code and comments in this tempalte to suit your own project.
     */

    private Stage startingStage = null;
    private Stage viewRecordsStage = null;

    private Button inputGameInfo = new Button("Input game");   // input new game information
    private Button viewGame = new Button("View past games");   // view past game information


    private Label fakeData1 = new Label("___");
    private Label fakeData2 = new Label("___");
    private Label fakeData3 = new Label("___");
    private Label fakeData4 = new Label("___");
    private Button fakeName1 = new Button("GAME 1");
    private Button fakeName2 = new Button("GAME 2");


// VIEW GAME RECORD DETAILS
    public Scene gameDetails() {
        //Stage viewRecordDetailsStage = new Stage();
        //viewRecordDetailsStage.setTitle("Specific game records");
        BorderPane stageLayout = new BorderPane();
        Scene gameDetailsScene = new Scene(stageLayout);
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
        return gameDetailsScene;
    }
//VIEW RECORDS OF GAMES
    public Scene gameHistory() {

        //viewRecordsStage.setTitle("List of all played games");
        BorderPane stageLayout = new BorderPane();
        Scene gameHistoryScene = new Scene(stageLayout);
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
        return gameHistoryScene;

    }

// MENU
    @Override
    public void start(Stage startingStage) {

        InputScene inputScene = new InputScene();
        Scene gameHistoryScene = gameHistory();
        Scene gameDetailsScene = gameDetails();

        inputGameInfo.setOnAction(e -> {
            startingStage.setScene(inputScene);
        });

        viewGame.setOnAction(e -> {
            startingStage.setScene(gameHistoryScene);
        });

        fakeName1.setOnAction(e -> {
            startingStage.setScene(gameDetailsScene);
        });

        startingStage.setTitle("Rock Paper Scissors Tracker");
        BorderPane stageLayout = new BorderPane();
        VBox options = new VBox(50);

        options.getChildren().addAll(inputGameInfo, viewGame);

        options.setAlignment(Pos.CENTER);

        stageLayout.setCenter(options);



        Scene scene = new Scene(stageLayout, 200, 300);
        startingStage.setScene(scene);
        startingStage.show();



        inputScene.setBackButtonTargets(startingStage, scene);

    }



    public static void main(String[] args) {
        launch();
    }

}
