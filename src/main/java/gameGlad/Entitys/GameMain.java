package gameGlad.Entitys;

import gameGlad.CountingClass;

import java.util.Random;

public class GameMain {

    public static void main(String[] args) {

// System.out.println(player1.getHealth());

        Human player1 = new Human();
        Bot bot1 = new Bot();
        Random rnd = new Random();
        int a = rnd.nextInt(2);

        Random rnd2 = new Random();
        int b = rnd2.nextInt(3);

        //todo fix problem Line 34


        player1.setAgility(1);
        player1.setDefence(1);
        player1.setName("Kabal");
        player1.setLevel(1);
        player1.setHealth(100 + 1 * 10);// 1 point in Defence = 10 Health
        player1.setLevel(1);// every point level you get 5 points to spend on stats

        bot1.setAgility(a);
        bot1.setDefence(a);
        //bot1.setName(); // Fix me
        bot1.setLevel(1);
        bot1.setHealth(50 + a * 10);
        bot1.setLevel(1);


        // random number from 0 to 9
        // Random rnd = new Random();
        // int a = rnd.nextInt(10);


    }
}
