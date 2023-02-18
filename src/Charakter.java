//Völker Beispiel:
//Goblin = hat Kontakte und somit Ware und Reperatur günstiger
//Blutsauger = Ware Blut kostenlos
//Orc = Ware Körperteile kostenlos

import java.util.Scanner;
public class Charakter {

    Scanner sc = new Scanner(System.in); // zu Testzwecken

    private String volk;
    private String icon; //für Swing später eventuell
    private int boni;

    public Charakter (String volk,String icon,int Boni){
        this.volk = volk;
        this.icon =icon;
        this.boni = boni;
    }

    public String getVolk() {
        return volk;
    }

    public String getIcon() {
        return icon;
    }

    public int getBoni() {
        return boni;
    }
}
