package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private List<MilitaryUnit> army = new ArrayList<>();


    public void addUnit(MilitaryUnit militaryUnit){

        army.add(militaryUnit);
    }

    public int getArmySize(){

        return army.size();

    }

    public void damageAll(int damage){
    for(MilitaryUnit mu: army){
        mu.sufferDamage(damage);
        if(mu.getHitPoints()<25){
            army.remove(mu);
        }
    }

    }
}
