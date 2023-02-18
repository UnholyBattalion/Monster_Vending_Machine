import java.util.Scanner;
import  java.util.Random;
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            //Vermögen,Ware und Reparatur
            int vermoegen; // steht für das aktuelle
            int gewinn; //
            int ware = 1; // 1 steht für eine Ware
            int reparatur = 500; // steht für Automaten Reperatur-Kosten
            int tag = 0;
            //Charakter-Werte
            int goblinStats = 2; //
            int blutsaugerStats = 2;
            int orcStats = 2;
           // Ware warenAttribut = new Ware(int );
            //Ware warenMethode = new Ware();

            // Charakter-Auswahl
        /*
        Charakter Goblin = new Charakter("Goblin","Platzhalter1",10);
        Charakter Blutsauger = new Charakter("Blutsauger","Platzhalter1",10);
        Charakter Orc = new Charakter("Orc","Platzhalter1",10);
         */
            //User Profil
            String userCharakter ="";
            int userStats = 0;

            System.out.println("Gebe die entsprechende Zahl für deinen Charakter ein!");
            System.out.println("1.Goblin");
            System.out.println("2.Blutsauger");
            System.out.println("3.Orc");


            //TODO einbinden mit GUI

            int charInput = sc.nextInt();
            switch (charInput) {
                case 1:
                    userCharakter = "Blutsauger";
                    userStats = blutsaugerStats;
                    break;
                case 2:
                    userCharakter = "Orc";
                    userStats = orcStats;
                    break;
                case 3:
                    userCharakter = "Goblin";
                    userStats = goblinStats;
                    break;
            }

            while(true){

                System.out.print("Bereit für den Start in einen neuen Tag?: ");
                String frage = sc.next();
                tag++;
                System.out.println("Heute ist Tag "+tag);
                //warenEinkaufRechner.warenRechner();

                int[] chances = {5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95,100}; // 20er chance
                Random r = new Random();
                boolean dropped = false;
                for (int i = 0; i < chances.length; i++) {
                    if (chances[i] > r.nextInt() * 100) {
                        System.out.println("Item with " + chances[i] + " chance is dropped");
                        dropped = true;
                        break;
                    }
                }
                if (dropped == false) {
                    System.out.println("Dropping default item");
                }

            }

        }
    }


