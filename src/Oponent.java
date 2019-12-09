import bron.Weapon;

public class Oponent {
    Weapon weapon;
    int zycie;
    int zbrona;

    public int zadajCios(){
       return weapon.critMultiply;
    }
}

