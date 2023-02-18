import java.util.Scanner;
import java.lang.Math;
import  java.util.Random;

public class Ware {
    //Waren-Attribute (aktuellerBestand)
    private int aktuellerBestand;

    public Ware (int aktuellerBestand){
        this.aktuellerBestand=aktuellerBestand;
    }

    public int getAktuellerBestand() {
        return this.aktuellerBestand ;
    }

    //Warenrechner-Methode
    public int warenRechner() {
        Random rand = new Random();

        int gekaufteWare = rand.nextInt(100) + 1;
        aktuellerBestand = 100 - gekaufteWare;
        System.out.println("Es wurden: " + gekaufteWare + " Artikel gekauft.");
        System.out.println("Es sind noch " + aktuellerBestand + " verfügbar.");
        return aktuellerBestand;
    }
    //Todo Warenkauf-Methode
}
