package gameGlad;


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
}


//    public int swing(String type){
//
//        int swing = 0;
//
//        switch (type) {
//            case normal:
//                swing =
//                break;
//            case Hard:
//                swing =
//        }
//        return 0;
//    }


//    public void fight(Human human, Human bot) {
//        int humBaseDmg = getBaseDmg(human.str, bot.def);
//        int botBaseDmg = getBaseDmg(bot.str, human.def);
//        int humFightHealth = human.health;
//        int botFightHealth = bot.health;
//        int humanAttackDmg;
//        int botAttackDmg;
//
     /*  while (humFightHealth >= 0 && botFightHealth >= 0) {
           //fight
           //humanAttackDmg = getAttackDmg(humBaseDmg, human.agility);
       }
       */

         /*

    enemy.hp -= enemydmg;
    hero.hp -= herodmg;

    if(Math.random() < hero.critchnc){
    enemydmg = enemydmg * 2;
          */






