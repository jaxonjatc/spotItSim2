package com.example.spotitsim;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.util.ArrayList;
import java.util.Random;

public class HelloController {
    Random random = new Random();

    @FXML
    public Button nextButton;

    @FXML
    public AnchorPane anchor;


    int symbolsPerCard = 0;
    int totalSymbols;
    ArrayList<Circle> cards = new ArrayList<>();

    @FXML
    protected void Spawn() {

        symbolsPerCard++;

        totalSymbols = symbolsPerCard*symbolsPerCard - symbolsPerCard + 1;

        for (Circle card :
                cards) {
            anchor.getChildren().remove(card);
        }


        for (int i = 0; i < totalSymbols; i++) {
            cards.add(new Circle(20));
            cards.get(cards.size()-1).setLayoutY(random.nextInt(100, 500));
            cards.get(cards.size()-1).setLayoutX(random.nextInt(100, 700));
            cards.get(cards.size()-1).setFill(Color.GREEN);
            anchor.getChildren().add(cards.get(cards.size()-1));
        }

    }
}