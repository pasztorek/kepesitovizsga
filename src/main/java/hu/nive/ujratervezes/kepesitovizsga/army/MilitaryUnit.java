package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class  MilitaryUnit {

    protected int damage;
    protected int hitPoints;
    protected boolean shield;


    public int doDamage(){
        return damage;
    }


    public void sufferDamage(int damage){
        if(shield==true){
            hitPoints = hitPoints-damage/2;
        }
        else{
            hitPoints = hitPoints-damage;
        }

    }

    public int getDamage() {
        return damage;
    }

    public int getHitPoints() {
        return hitPoints;
    }

}
