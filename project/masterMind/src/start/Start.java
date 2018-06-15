package start;

import game.playTable;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {

        for(int i=0; i<7; ++i) {
            playTable.makeGuess();
        }
    }
}

//        Scanner src1 = new Scanner(System.in);
//        System.out.println("Bitte geben Sie eine Farbe ein (rot, blau, gruen, gelb, lila, braun): ");
//        Farbe col1 = Farbe.valueOf(src1.nextLine());
//        System.out.println("die Farbe ist: " + col1);
//        System.out.println("playerSET: " + playTable.getPlGuess().get(0) + " " + playTable.getPlGuess().get(1) +
//                           " " + playTable.getPlGuess().get(2) + " " + playTable.getPlGuess().get(3));
//        System.out.println(playTable.guessNum + ". Versuch\n");
//
//
