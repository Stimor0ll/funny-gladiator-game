package gameGlad;

import gameGlad.Entitys.Bot;
import gameGlad.Entitys.Human;


public class Fighting {

    public void fight(Human player1, Bot bot1) {


        Counting count = new Counting();
        boolean hit = true;



//        int player1Health = player1.getHealth();
//        int bot1Health = bot1.getHealth();
//        int player1CritChance = count.getCritChance(player1.getAgility());
//        int bot1CritChance = count.getCritChance(bot1.getAgility());

        while (player1.getHealth() >= 0 && bot1.getHealth() >= 0) {


            if (hit && count.willItHit() == 1) {

                count.hitBotsHealthHard(player1, bot1);
//                player1CritChance = player1CritChance + 10;
//                getFinalDmg.getFinalDmg(player1CritChance, player1.getDamage());
//                bot1Health = bot1.getHealth() - getFinalDmg.getFinalDmg(player1CritChance, player1.getDamage());
//                bot1.setHealth(bot1Health);

            } else if (hit && count.willItHit() == 2) {
                System.out.println("You miss your enemy, if you want hit your target next time keep your eyes OPEN");
            }
            if (!hit) {
                count.hitBotsHealthNormal(player1, bot1);
//                bot1Health = bot1.getHealth() - player1.getDamage();
//                bot1.setHealth(bot1Health);

            }
            if (count.botAttackOption(bot1.getHealth(), player1.getHealth()) == 1 && count.willItHit() == 1) {

                count.hitPlayersHealthHard(player1, bot1);
//                bot1CritChance = bot1CritChance + 10;
//                getFinalDmg.getFinalDmg(bot1CritChance, bot1.getDamage());
//                player1Health = player1.getHealth() - getFinalDmg.getFinalDmg(player1CritChance, bot1.getDamage());
//                player1.setHealth(player1Health);

            } else if (count.botAttackOption(bot1.getHealth(), player1.getHealth()) == 1 && count.willItHit() == 2) {
                System.out.println("You miss your enemy, if you want hit your target next time keep your eyes OPEN");
            }
            if (count.botAttackOption(bot1.getHealth(), player1.getHealth()) == 2) {

                count.hitBotsHealthNormal(player1, bot1);

//                player1Health = player1.getHealth() - bot1.getDamage();
//                player1.setHealth(player1Health);
            }
//todo  1) reward a Lvl and some points to spend after victory.


        }


    }
}

