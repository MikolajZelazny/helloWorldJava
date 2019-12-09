package bron;

public class Weapon {
    public String nazwa;
    public int dmg;
    public int critHitChance;
    public int critMultiply;
    public void critCalculation (int dmg, int multi){
        critMultiply= dmg * multi;
    }
}
