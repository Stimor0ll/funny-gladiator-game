package gameGlad;

import gameGlad.Entitys.Bot;
import gameGlad.Entitys.Human;


public class Fighting {

    public void fight(Human player1, Bot bot1) {


        Counting count = new Counting();
        boolean hit = true;


        while (player1.getHealth() >= 0 && bot1.getHealth() >= 0) {


            if (hit && count.willItHit()) {

                count.hitBotsHealthHard(player1, bot1);


            } else if (hit && !count.willItHit()) {
                System.out.println("You miss your enemy, if you want hit your target next time keep your eyes OPEN");
            }

            if (!hit) {
                count.hitBotsHealthNormal(player1, bot1);

            }
            if (count.botAttackOption(bot1.getHealth(), player1.getHealth()) && count.willItHit()) {
                count.hitPlayersHealthHard(player1, bot1);

            } else if (count.botAttackOption(bot1.getHealth(), player1.getHealth()) && !count.willItHit()) {
                System.out.println("You miss your enemy, if you want hit your target next time keep your eyes OPEN");
            }

            if (!count.botAttackOption(bot1.getHealth(), player1.getHealth())) {

                count.hitBotsHealthNormal(player1, bot1);
            }
        }
    }
}

