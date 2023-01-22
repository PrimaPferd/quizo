import java.util.Scanner;


public class Geschichtsfragen {

    
    

    public static int geschichtsfragen(int ergebnis, int ranking) {

        Scanner sc2 = new Scanner(System.in);

        int antwort;


        if(ergebnis == 2) {
            System.out.println("Ihnen werden 10 Fragen nach und nach zum Thema Geschichte gestellt, indem Sie pro richtige Antwort 1 Punkt bekommen.");

            System.out.println("Ihre erste Frage lautet : Wann war der erste Weltkrieg?");
            System.out.println("Antwort 1 : 1914, Antwort 2 : 1915, Antwort 3 : 1913");
            antwort = sc2.nextInt();

        if(antwort == 2) {
            Quiz.richtigeAntwort(ranking);
        }
        else {
            Quiz.falscheAntwort(ranking);
        }

            System.out.println("Ihre zweite Frage lautet : Wann war der erste Weltkrieg zuende?");
            System.out.println("Antwort 1 : 1915, Antwort 2 : 1916, Antwort 3 : 1918");
            antwort = sc2.nextInt();








        }

        return ergebnis;

    }
}