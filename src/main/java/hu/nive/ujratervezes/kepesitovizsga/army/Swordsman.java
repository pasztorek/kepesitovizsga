package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit {
    int attac =0;

    public Swordsman(boolean shield) {


        this.damage = 10;
        this.hitPoints = 100;
        this.shield = shield;
    }


    @Override
    public void sufferDamage(int damage) {

        if (attac != 0){
            super.sufferDamage(damage);
            attac++;
        }
            attac++;

    }
}
