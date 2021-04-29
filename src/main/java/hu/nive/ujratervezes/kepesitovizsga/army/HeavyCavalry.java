package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit {

    public int attack = 0;

    public HeavyCavalry() {
        this.damage = 20;
        this.hitPoints = 150;
        this.shield = true;
    }


    @Override
    public int doDamage() {
        if (attack == 0) {
            attack++;
            return damage * 3;
        } else {

            attack++;
            return damage;

        }
    }
}