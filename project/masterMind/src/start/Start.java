package start;

import coder.Response;
import game.playTable;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {
        playTable.processGame();
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
//        Response resp1 = new Response();
//        ArrayList<playTable.Farbe> respCol = null;
//        respCol = (ArrayList<playTable.Farbe>) resp1.codeSet.clone();
//        System.out.println("Coder: ");
//        for(playTable.Farbe f : respCol) { System.out.print(f + " "); }
//
//
//
//



