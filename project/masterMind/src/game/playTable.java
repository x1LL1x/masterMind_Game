package game;

import coder.Response;

import java.util.ArrayList;
import java.util.Scanner;

public class playTable{
    public enum Farbe {rot, blau, gruen, gelb, lila, braun}
    public enum resp_Code{weiss, schwarz}

    private static int guessNum=0;
    private static ArrayList<Farbe> guessSet;
    private static ArrayList<Farbe> response;

    public static void makeGuess(){
        ArrayList<Farbe> color = new ArrayList<>(4);
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte wählen Sie 4 Farben aus diesen 6 verschiedenen aus: [rot] [blau] [gruen] [gelb] [lila] [braun] ");

        for(int i=0; i<4; ++i) {                                                                                         //Spieler gibt 4 Farben ein
            Farbe f = Farbe.valueOf(scan.next());
            color.add(f);
        }

        Spieler player_Guess = new Spieler(color.get(0), color.get(1), color.get(2), color.get(3));
        guessSet = (ArrayList<Farbe>) player_Guess.getGuess().clone();
        System.out.println(++guessNum + ". Versuch:");;
        System.out.print("playerSET: ");

        for (Farbe f : guessSet) {
            System.out.print("[" + f + "]" + " ");
        } System.out.println();
    }

    public static void processGame(){
        Response respRef = new Response();
        ArrayList<Farbe> codeSet = (ArrayList<Farbe>) respRef.getRandomSet().clone();
        ArrayList<resp_Code> answer = new ArrayList<>(4);

        System.out.print("Code: ");
        for(Farbe f : codeSet) {
            System.out.print(f + " ");
        } System.out.println("\n");

        for(int i=0; i<7; ++i){
            makeGuess();
            answer = (ArrayList<resp_Code>) respRef.getResponse().clone();
            System.out.print("Antwort: ");
            for(resp_Code rc : answer) {
                System.out.print("[" + rc + "]" + " ");
            } System.out.println("\n");
        }
    }

    public static ArrayList<Farbe> getPlGuess(){
        return guessSet;
    }
}



class Spieler {
    private ArrayList<playTable.Farbe> colSet = new ArrayList<>(4);

    public Spieler(playTable.Farbe f1, playTable.Farbe f2, playTable.Farbe f3, playTable.Farbe f4){
        setGuess(f1, f2, f3, f4);
    }

    public void setGuess(playTable.Farbe col1, playTable.Farbe col2, playTable.Farbe col3, playTable.Farbe col4){
        this.colSet.add(col1);
        this.colSet.add(col2);
        this.colSet.add(col3);
        this.colSet.add(col4);
    }

    public ArrayList<playTable.Farbe> getGuess() {
        return colSet;
    }
}