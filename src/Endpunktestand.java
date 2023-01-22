public class Endpunktestand {
    
   


    public static void ende(int ranking) {

     

    System.out.println("Sie haben alle 10 Fragen beantwortet.");
    System.out.println("Sie haben folgende Punktzahl erreicht : " + ranking);

    if(ranking == 0 || ranking <= 5) {
        System.out.println("Sie haben keine Fragen richtig beantworten können!");
        System.out.println("Sie müssen einiges nachholen!");
        } 
    else if(ranking == 6 || ranking <= 9) {
        System.out.println("Sie haben nicht ganz alle Fragen richtig beantworten können!");
        System.out.println("Sie brauchen etwas mehr Allgemeinwissen.");
        }
    else if(ranking == 10) {
        System.out.println("Sie haben alle 10 Fragen richtig beantwortet!");
        System.out.println("Sie sind ein absolutes Genie."); 
        }
       
       
    }



}
