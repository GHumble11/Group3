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
import java.util.ArrayList;

public class Main extends Application {

    /** Set up a maven run profile in intellij or use maven from the command-line.
        Use the javafx:run argument to start the javafx application.
        Update all code and comments in this template to suit your own project.
     */

    private Button inputGameInfo = new Button("Input game");   // input new game information
    private Button viewGame = new Button("View past games");   // view past game information
    public static ArrayList<Game> games = new ArrayList<>();

// MAIN MENU
    @Override
    public void start(Stage startingStage) { //Method that starts application

        InputScene inputScene = new InputScene(); //Creates game input scene
        GameHistoryScene gameHistoryScene = new GameHistoryScene(startingStage); //Creates game history scene
        GameDetailsScene gameDetailsScene = new GameDetailsScene(); //Creates game details scene

        inputGameInfo.setOnAction(e -> {           //Functionality of button from MAIN MENU to inputScene
            startingStage.setScene(inputScene);
        });

        viewGame.setOnAction(e -> {                //Functionality of button from MAIN MENU to gameHistoryScene
            startingStage.setScene(gameHistoryScene);
        });

        startingStage.setTitle("Rock Paper Scissors Tracker"); //Sets stage title text
        BorderPane stageLayout = new BorderPane();             //Creates new BorderPane
        VBox options = new VBox(50);                        //Vbox containing both navigation buttons

        options.getChildren().addAll(inputGameInfo, viewGame);

        options.setAlignment(Pos.CENTER);

        stageLayout.setCenter(options);

        Scene scene = new Scene(stageLayout, 200, 300); //Creation of MAIN MENU Scene
        startingStage.setScene(scene);
        startingStage.show();

        inputScene.setBackButtonTargets(startingStage, scene);
        gameHistoryScene.setBackButtonTargets(startingStage, scene);
        gameDetailsScene.setBackButtonTargets(startingStage, scene); //NOT WORKING
    }


    /** Launches the application
     *
     * @param args
     */
    public static void main(String[] args) {
        launch();
    }
}
