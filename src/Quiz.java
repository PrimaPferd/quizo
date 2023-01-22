import java.util.Scanner;

public class Quiz {
    public static void main(String[] args)  {


        System.out.println("Wilkommen zum Quiz für Allgemeinwissen.");

        Videospielfragen rank = new Videospielfragen();
        
        
        int thema = 0;
        int ergebnis = themaabfrage(thema);
        int ranking = videospielfrage(ranking);
        
        Videospielfragen.videospielfragen(ergebnis, ranking);
        Geschichtsfragen.geschichtsfragen(ergebnis, ranking);
        Politikfragen.politikfragen(ergebnis, ranking);

        
    }


    public static int themaabfrage(int thema) {

            Scanner sc0 = new Scanner(System.in);
            
      do  { System.out.println("Sie haben  die Auswahl verschiedener Themen für Ihr Wissen :");
            System.out.println("Die (1) für Videospiel-Fragen, die (2) für Geschichts-Fragen, die (3) für Poltik-Fragen.");
            thema = sc0.nextInt();
    
            switch (thema) {
                case 1: System.out.println("Sie haben sich für die Videospielfragen entschieden.");
                        System.out.println(); break;
                case 2: System.out.println("Sie haben sich für die Geschichts-Fragen entschieden.");
                        System.out.println(); break;
                case 3: System.out.println("Sie haben sich für die Politik-Fragen entschieden.");
                        System.out.println(); break;
                default : System.out.println("Sie haben eine falsche Eingabe betätigt.");
                          System.out.println("Wiederholen Sie Ihre Eingabe mit der Zahl 1, 2 oder der 3!");
                } }while(thema <= 0 || thema >= 4);

            return thema;
     }
    

     public static int richtigeAntwort(int ranking) {
        System.out.println("Glückwunsch Sie haben die richtige Antwort gegeben!");
        System.out.println("Ihnen wird 1 Punkt gut geschrieben.");
        ranking = +1;

        return ranking;
        
     }

    public static int falscheAntwort(int ranking) {
        System.out.println("Sie haben eine falsche Antwort gegeben.");
        System.out.println("Ihre Punktezahl bleibt bei : " + ranking);

        return ranking;
    }
}



