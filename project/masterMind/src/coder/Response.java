package coder;

import game.playTable;
import java.util.ArrayList;
import java.util.Random;

public class Response {
    private ArrayList<playTable.Farbe> codeSet = new ArrayList<>(4);                                                                        // random CodeSET generiert vom Computer
    private ArrayList<playTable.resp_Code> answer = new ArrayList<>(4);

    private boolean isColor, isPosition, isSetCode;


    public Response() {
        this.setRandomSet();
    }

    private void setRandomSet() {
        Random rndCol = new Random();
        for (int i = 0; i < 4; ++i) {
            this.codeSet.add(playTable.Farbe.values()[rndCol.nextInt(playTable.Farbe.values().length)]);
        }
    }

    public ArrayList<playTable.Farbe> getRandomSet() {
        return codeSet;
    }


    public ArrayList<playTable.resp_Code> getResponse() {
        ArrayList<playTable.Farbe> pl_gSet = (ArrayList<playTable.Farbe>) playTable.getPlGuess().clone();
        this.answer.clear();
        for (int j = 0; j < codeSet.size(); ++j) {
            for (int i = 0; i < pl_gSet.size(); ++i) {
                if ((i == j) && (codeSet.get(j) == pl_gSet.get(i))) {
                    this.answer.add(playTable.resp_Code.schwarz);
                } else if ((i!=j) && (codeSet.get(j) == pl_gSet.get(i))) {
                    this.answer.add(playTable.resp_Code.weiss);
                }
            }
        }
        return this.answer;
    }
}
