import java.util.Scanner;



public class Videospielfragen {
    
    

    public static int videospielfragen(int ergebnis, int ranking) {

        Scanner sc1 = new Scanner(System.in);

        int antwort;
        

        if(ergebnis == 1) {
            System.out.println("Ihnen werden 10 Fragen nach und nach zum Thema Videogames gestellt, indem Sie pro richtige Antwort 1 Punkt bekommen.");

            System.out.println("Ihre erste Frage lautet : Wie heißt der Entwickler von dem Spiel Valorant?");
            System.out.println("Ist es Antwort 1 : Riot Games, Antwort 2 : Blizzard oder ist es Antwort 3 : Electronics Arts");
            antwort = sc1.nextInt();
        
        if(antwort == 1) {
            Quiz.richtigeAntwort(ranking);
        }
        else {
            Quiz.falscheAntwort(ranking);  
        }
            
            System.out.println("Ihre zweite Frage lautet : Wie heißt der World of Warcraft Endboss in dem Addon Legion?");
            System.out.println("Ist es Antwort 1 : Arthas, der Lichkönig, Antwort 2 : Argus, der Zerrütter oder ist es Antwort 3 : Gul'dan");
            antwort = sc1.nextInt();

        if(antwort == 2) {
            Quiz.richtigeAntwort(ranking);
        }
        else {
            Quiz.falscheAntwort(ranking);
        }

            System.out.println("Ihre dritte Frage lautet : Wie viele Klassen kann man in World of Warcraft spielen?");
            System.out.println("Ist es Antwort 1 : 12, Antwort 2 : 13, oder ist es Antwort 3 : 14");
            antwort = sc1.nextInt();
          
        if(antwort == 2) {
          Quiz.richtigeAntwort(ranking); 
        }
        else {
          Quiz.falscheAntwort(ranking);
        }

            System.out.println("Ihre vierte Frage lautet : Wie viele spielbare Charaktere gibt es in Valorant?");
            System.out.println("Ist es Antwort 1 : 20, Antwort 2 : 19, oder ist es Antwort 3 : 18");
            antwort = sc1.nextInt();

        if(antwort == 1) {
            Quiz.richtigeAntwort(ranking);
        }
        else {
            Quiz.falscheAntwort(ranking);
        }

            System.out.println("Ihre fünfte Frage lautet : Wie viele Addons gab es bereits schon in World of Warcraft?");
            System.out.println("Ist es Antwort 1 : 8, Antwort 2 : 10, oder ist es Antwort 3 : 9");
            antwort = sc1.nextInt();

        if(antwort == 3) {
            Quiz.richtigeAntwort(ranking);
        }
        else {
            Quiz.falscheAntwort(ranking);
        }
      }      
        
      
        return ergebnis;

     }

}
