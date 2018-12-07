package gameGlad;

import gameGlad.Entitys.Bot;
import gameGlad.Entitys.Human;
import gameGlad.Entitys.Body;
import gameGlad.Entitys.GameMain;


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


    public int humanDmg() {

        Human humDmg = new Human();


        return 0;






         /*
    enemydmg = hero.att - enemy.def;
    herodmg = enemy.att - hero.def;
    enemy.hp -= enemydmg;
    hero.hp -= herodmg;

    if(Math.random() < hero.critchnc){
    enemydmg = enemydmg * 2;
          */


    }


    //todo 1) Fighting mechanics 2) Damage, Block, Crit. 3) Level..


}

