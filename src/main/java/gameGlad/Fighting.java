package gameGlad;

import gameGlad.Entitys.Bot;
import gameGlad.Entitys.Human;


public class Fighting {

    public void fight(Human player1, Bot bot1) {


        Counting getFinalDmg = new Counting();
        Counting getCritChance = new Counting();
        Counting gladSwing = new Counting();
        Counting swing = new Counting();


        int player1Health = player1.getHealth();
        int bot1Health = bot1.getHealth();
        int player1CritChance = getCritChance.getCritChance(player1.getAgility());
        int bot1CritChance = getCritChance.getCritChance(bot1.getAgility());

        while (player1.getHealth() >= 0 && bot1.getHealth() >= 0) {


            if (swing.choseSwing(1) == 1 && gladSwing.willItHit() == 1) {
                player1CritChance = player1CritChance + 10;
                getFinalDmg.getFinalDmg(player1CritChance, player1.getDamage());
                bot1Health = bot1.getHealth() - getFinalDmg.getFinalDmg(player1CritChance, player1.getDamage());
                bot1.setHealth(bot1Health);

            } else if (swing.choseSwing(1) == 1 && gladSwing.willItHit() == 1) {
                System.out.println("You miss your enemy, if you want hit your target next time keep your eyes OPEN");
            }
            if (swing.choseSwing(2) == 2) {
                bot1Health = bot1.getHealth() - player1.getDamage();
                bot1.setHealth(bot1Health);


            }
//todo Bot decision mech ( hard or normal ), 2) reward a Lvl and some points to spend after victory.


        }


    }
}

