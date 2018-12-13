package gameGlad;

import gameGlad.Entitys.Bot;
import gameGlad.Entitys.Human;


public class Fighting {

    public void fight(Human player1, Bot bot1) {

        Counting getFinalDmg = new Counting();
        Counting getCritChance = new Counting();
        Counting gladSwing = new Counting();
        Counting swing = new Counting();
        Counting hBhh = new Counting();
        Counting hPhh = new Counting();



        int player1Health = player1.getHealth();
        int bot1Health = bot1.getHealth();
        int player1CritChance = getCritChance.getCritChance(player1.getAgility());
        int bot1CritChance = getCritChance.getCritChance(bot1.getAgility());

        while (player1.getHealth() >= 0 && bot1.getHealth() >= 0) {


            if (swing.choseSwing(1) == 1 && gladSwing.willItHit() == 1) {

                hBhh.hitBotsHealthHard(player1, bot1);
//                player1CritChance = player1CritChance + 10;
//                getFinalDmg.getFinalDmg(player1CritChance, player1.getDamage());
//                bot1Health = bot1.getHealth() - getFinalDmg.getFinalDmg(player1CritChance, player1.getDamage());
//                bot1.setHealth(bot1Health);

            } else if (swing.choseSwing(1) == 1 && gladSwing.willItHit() == 2) {
                System.out.println("You miss your enemy, if you want hit your target next time keep your eyes OPEN");
            }
            if (swing.choseSwing(2) == 2) {
//                bot1Health = bot1.getHealth() - player1.getDamage();
//                bot1.setHealth(bot1Health);

            }
            if (swing.botAttackOption(bot1.getHealth(), player1.getHealth()) == 1 && gladSwing.willItHit() == 1) {
                hPhh.hitPlayersHealthHard(player1, bot1);
//                bot1CritChance = bot1CritChance + 10;
//                getFinalDmg.getFinalDmg(bot1CritChance, bot1.getDamage());
//                player1Health = player1.getHealth() - getFinalDmg.getFinalDmg(player1CritChance, bot1.getDamage());
//                player1.setHealth(player1Health);

            } else if (swing.botAttackOption(bot1.getHealth(), player1.getHealth()) == 1 && gladSwing.willItHit() == 2) {
                System.out.println("You miss your enemy, if you want hit your target next time keep your eyes OPEN");
            }
            if (swing.botAttackOption(bot1.getHealth(), player1.getHealth()) == 2) {
//                player1Health = player1.getHealth() - bot1.getDamage();
//                player1.setHealth(player1Health);


            }
//todo  1) reward a Lvl and some points to spend after victory. 2) paslifuoti struktura.


        }


    }
}

