package gameGlad;


import gameGlad.Entitys.Bot;
import gameGlad.Entitys.Human;

public class Counting {

    public String botName(int rnd2) {

        String botName = null;

        switch (rnd2) {
            case 0:
                botName = "DoM";
                break;
            case 1:
                botName = "BoB";
                break;
            case 2:
                botName = "ToD";
                break;
            case 3:
                botName = "RoB";
                break;

        }
        return botName;

    }



    public int botAttackOption(int botHp, int playerHp){
        if(botHp - playerHp >= 20 || botHp - playerHp >= -20){
            return 1;
        }

        return 2;
    }

    public int willItHit() {

        if (Math.random() * 100 > 25) {
            return 1;
        }
        return 2;
    }


    public int choseSwing(int personSwingtype) {

        if (personSwingtype == 1) {
            return 1;
        }
        return 2;

    }


    public int getBaseDmg(int gladiator1Str, int gladiator2Def) {
        return gladiator1Str * 10 - gladiator2Def * 5;
    }

    public int getCritChance(int gladiatorAgi) {
        return gladiatorAgi * 6;
    }

    public int getFinalDmg(int gladCrit, int gladBaseDmg) {

        if (Math.random() * 100 < gladCrit) {
            return gladBaseDmg = gladBaseDmg * 2;
        }
        return gladBaseDmg;
    }

    public int hit(int gladHealth, int gladFinalDmg) {
        return gladHealth - gladFinalDmg;
    }

    public int hitBotsHealthHard(Human player1, Bot bot1){
        Counting getCritChance = new Counting();
        Counting getFinalDmg = new Counting();
        int bot1Health = bot1.getHealth();
        int player1CritChance = getCritChance.getCritChance(player1.getAgility());

        player1CritChance = player1CritChance + 10;
        getFinalDmg.getFinalDmg(player1CritChance, player1.getDamage());
        bot1Health = bot1.getHealth() - getFinalDmg.getFinalDmg(player1CritChance, player1.getDamage());
        bot1.setHealth(bot1Health);

        return bot1Health;
    }
    public int hitPlayersHealthHard(Human player1, Bot bot1){
        Counting getCritChance = new Counting();
        Counting getFinalDmg = new Counting();
        int player1Health = player1.getHealth();
        int bot1CritChance = getCritChance.getCritChance(bot1.getAgility());

        bot1CritChance = bot1CritChance + 10;
        getFinalDmg.getFinalDmg(bot1CritChance, bot1.getDamage());
        player1Health = player1.getHealth() - getFinalDmg.getFinalDmg(bot1CritChance, bot1.getDamage());
        player1.setHealth(player1Health);

        return  player1Health;
    }
    public int hitBotsHealthNormal(Human player1, Bot bot1){
        int bot1Health = bot1.getHealth();

        bot1Health = bot1.getHealth() - player1.getDamage();
        bot1.setHealth(bot1Health);

        return bot1Health;
    }
    public int hitPlayersHealthNormal(Human player1, Bot bot1){
        int player1Health = player1.getHealth();

        player1Health = player1.getHealth() - bot1.getDamage();
        player1.setHealth(player1Health);

        return player1Health;
    }



}






//    public void fight(Human human, Human bot) {
//        int humBaseDmg = getBaseDmg(human.str, bot.def);
//        int botBaseDmg = getBaseDmg(bot.str, human.def);
//        int humFightHealth = human.health;
//        int botFightHealth = bot.health;
//        int humanAttackDmg;
//        int botAttackDmg;
//








