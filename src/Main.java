import bron.Halabarda;
import bron.Miecz;
import bron.Weapon;

public class Main {
    static Weapon halabarda = new Halabarda();
    Weapon miecz = new Miecz();
    static Weapon miecz2 = new Miecz();

    public static void main(String[] args) {
        Oponent oponent1 = new Oponent();
        Oponent oponent2 = new Oponent();

        oponent1.weapon = halabarda;
        oponent2.weapon = miecz2;

        halabarda.critCalculation(5, 2);
        miecz2.critCalculation(10, 3);
        oponent1.zycie = 100;
        oponent2.zycie = 50;

        while (oponent1.zycie > 0 || oponent2.zycie > 0) {
            System.out.println("Oponent 1 ma zycie:" + oponent1.zycie);

            oponent1.zycie = oponent1.zycie - oponent2.zadajCios();
            System.out.println("Oponent 1 po ataku 2 ma zycie:" + oponent1.zycie);

            System.out.println("Oponent 2 ma zycie:" + oponent2.zycie);
            oponent2.zycie = oponent2.zycie - oponent1.zadajCios();
            System.out.println("Oponent 2 po ataku opoent 1 ma zycie:" + oponent2.zycie);
        }

        if(oponent1.zycie>oponent2.zycie)
         System.out.print("Wyra oponent nr 1");
        else
            System.out.print("Wyra oponent nr 2");

    }
}
