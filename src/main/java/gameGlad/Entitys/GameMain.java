package gameGlad.Entitys;

import gameGlad.Counting;
import gameGlad.Fighting;

import java.util.Random;

public class GameMain {


    public static void main(String[] args) {

        Human player1 = new Human();
        Bot bot1 = new Bot();

        Random rnd = new Random();
        int randomStats = 1 + rnd.nextInt(2);

        Random rnd2 = new Random();
        int randomNameNr = rnd2.nextInt(5);


        Counting botname = new Counting();
        botname.botName(randomNameNr);// visos eilutes prasme String


        player1.setStrength(3);
        player1.setAgility(2);
        player1.setDefence(1);
        player1.setName("Gladiator");
        player1.setHealth(100 + 1 * 10);// 1 point in Defence = 10 Health
        player1.setLevel(1);// every point in level you get 5 points to spend on stats

        bot1.setStrength(randomStats);
        bot1.setAgility(randomStats);
        bot1.setDefence(randomStats);
        bot1.setName(botname.botName(randomNameNr));
        bot1.setHealth(80 + randomStats * 10);
        bot1.setLevel(1);

        Counting getBaseDmg = new Counting();
        getBaseDmg.getBaseDmg(player1.getStrength(), bot1.getDefence());
        getBaseDmg.getBaseDmg(bot1.getStrength(), player1.getDefence());

        player1.setDamage(getBaseDmg.getBaseDmg(player1.getStrength(), bot1.getDefence()));
        bot1.setDamage(getBaseDmg.getBaseDmg(bot1.getStrength(), player1.getDefence()));


        Fighting f = new Fighting();
        f.fight(player1, bot1);


    }

}






