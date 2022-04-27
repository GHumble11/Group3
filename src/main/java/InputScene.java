import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
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
        rock.setToggleGroup(move2);
        paper.setToggleGroup(move2);
        scissors.setToggleGroup(move2);

        move1Layout.setPadding(new Insets(15,15,15,15));
        move2Layout.setPadding(new Insets(15,15,15,15));
        move1Layout.getChildren().addAll(p1Label, rock, paper, scissors);
        move2Layout.getChildren().addAll(p2Label, rock2, paper2, scissors2);
        submitLayout.getChildren().addAll(back, submit);

        move1Layout.setAlignment(Pos.CENTER);
        move2Layout.setAlignment(Pos.CENTER);
        submitLayout.setAlignment(Pos.CENTER);


        stageLayout.setLeft(move1Layout);
        stageLayout.setRight(move2Layout);
        stageLayout.setBottom(submitLayout);
    }

    public void setBackButtonTargets(Stage mainStage, Scene targetScene) {
        back.setOnAction(e -> mainStage.setScene(targetScene));
    }

    public AtomicReference<String> setMoves() {
        AtomicReference<String> gameResult = new AtomicReference<>("");
        submit.setOnAction(e -> {
            if (move1.getSelectedToggle() == rock && move2.getSelectedToggle() == scissors) {
                gameResult.set("W");
            }
        });
        return gameResult;
    }
}
