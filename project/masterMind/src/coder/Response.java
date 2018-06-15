package coder;

import game.playTable;
import java.util.ArrayList;

public class Response {
    private boolean isColor, isPosition, isSetCode;
    private ArrayList<playTable.Farbe> guess;


    public Response() {
        ArrayList<playTable.Farbe> guessSet = (ArrayList<playTable.Farbe>) playTable.getPlGuess().clone();


    }

    public void responseCode(){
        System.out.println(guess.get(0));
    }

}
