package gameGlad;


import gameGlad.Entitys.Bot;
import gameGlad.Entitys.Human;

public class Counting {

    private static final int CHANCE_TO_MISS = 25;
    private static final int CRIT_MULTIPLYER = 6;
    private static final int CRIT_DMG_MULTIPLYER = 2;
    private static final int CRIT_CHANCE_INCREASE = 10;
    private static final int DAMAGE_MULTIPLYER = 10;
    private static final int DEFENCE_MULTIPLYER = 5;
    private static final int BOT_WINNING = 20;
    private static final int BOT_LOSING = -20;



    public enum funnyBotName{DOM, BOB, TOD, ROB, CRAB, BIGBOSSJAVA};

    public String botName(int rnd2) {
        return funnyBotName.values()[rnd2].toString();
    }

    public boolean botAttackOption(int botHp, int playerHp){
        return (botHp - playerHp >= BOT_WINNING || botHp - playerHp >= BOT_LOSING);
    }

    public boolean willItHit() {
        return (Math.random() * 100 > CHANCE_TO_MISS) ;
    }

    public int getBaseDmg(int gladiator1Str, int gladiator2Def) {
        return gladiator1Str * DAMAGE_MULTIPLYER - gladiator2Def * DEFENCE_MULTIPLYER;
    }

    public int getCritChance(int gladiatorAgi) {
        return gladiatorAgi * CRIT_MULTIPLYER;
    }

    public int getFinalDmg(int gladCrit, int gladBaseDmg) {

        if (Math.random() * 100 < gladCrit) {// 100 stands for percentage value
            return gladBaseDmg = gladBaseDmg * CRIT_DMG_MULTIPLYER;
        }
        return gladBaseDmg;
    }


    public int hitBotsHealthHard(Human player1, Bot bot1){
        Counting getCritChance = new Counting();
        Counting getFinalDmg = new Counting();
        int bot1Health = bot1.getHealth();
        int player1CritChance = getCritChance.getCritChance(player1.getAgility());

        player1CritChance = player1CritChance + CRIT_CHANCE_INCREASE;
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

        bot1CritChance = bot1CritChance + CRIT_CHANCE_INCREASE;
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
