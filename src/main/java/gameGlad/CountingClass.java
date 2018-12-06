package gameGlad;

import gameGlad.Entitys.Human;
import gameGlad.Entitys.Body;
import gameGlad.Entitys.GameMain;


public class CountingClass {

    public String BotName(int rnd2) {

        String BotName = null;


        switch (rnd2) {
            case 1:
                BotName = "BoB";
                break;
            case 2:
                BotName = "ToD";
                break;
            case 3:
                BotName = "RoB";
                break;

        }
        return BotName;


    }


    //todo 1) Fighting mechanics 2) Damage, Block, Crit. 3) Level..


}

