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

    public String hit(int gladHealth, int gladFinalDmg) {
        return "Health Left " + (gladHealth - gladFinalDmg);
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
     /*  while (humFightHealth >= 0 || botFightHealth >= 0) {
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


//todo 1) Fighting mechanics
//todo 2) Block ( 2 attack types )
//todo 3) Level.. // get lvl after victory + anounce " you can add 5 points to your skills"
//todo 4) Bot decision to take attack 1 or attack 2. ( if player hp - bot hp <= 20 { take attack 2(hard) }




