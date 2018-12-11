package gameGlad;

import gameGlad.Entitys.Bot;
import gameGlad.Entitys.Human;
import gameGlad.Counting;

public class Fighting {

    public void fight(Human player1, Bot bot1) {

        Counting getFinalDmg = new Counting();
        Counting getCritChance = new Counting();
        Counting gladSwing = new Counting();
        Counting swing = new Counting();


        String Hard = swing.choseSwing(1);


        int player1Health = player1.getHealth();
        int bot1Health = bot1.getHealth();
        int player1CritChance = getCritChance.getCritChance(player1.getAgility());
        int bot1CritChance = getCritChance.getCritChance(bot1.getAgility());

        while (player1.getHealth() >= 0 && bot1.getHealth() >= 0) {
            //todo 2 options, Hard hit or Normal
//fixme 28
           // if (swing.choseSwing(1) = Hard && gladSwing.willIHit() = true) {
                player1CritChance = player1CritChance + 10;
                getFinalDmg.getFinalDmg(player1CritChance, player1.getDamage());
                bot1Health = bot1.getHealth() - getFinalDmg.getFinalDmg(player1CritChance, player1.getDamage());


            }


        }


    }

