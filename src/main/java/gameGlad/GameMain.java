package gameGlad;

import gameGlad.Entitys.Bot;
import gameGlad.Entitys.Human;

import java.util.Random;

public class GameMain {

    public static void main(String[] args) {


        Human player1 = new Human();
        Bot Bot1 = new Bot();


        // random number from 0 to 9
        Random rnd = new Random();
        int a = rnd.nextInt(10);


    }
}
