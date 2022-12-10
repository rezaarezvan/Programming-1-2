import java.util.*;

public class Main{
    public static void main(String[] args) {

        Skola skola = new Skola("Hulebäck");
        
        Lärare LärareA = new Lärare("Håkan",  "Håkansson", skola);
        Lärare LärareB = new Lärare("Kalle", "Bengtsson", skola);
        Lärare LärareC = new Lärare("Erik",         "Ek", skola);
        
        System.out.println("DETTA ÄR LÄRARE A");
        System.out.println(LärareA);
        
        System.out.println("DETTA ÄR SKOLA");
        System.out.println(skola);

        Klass Aklassen = new Klass("KlassID-20", LärareA, skola);
        Klass Bklassen = new Klass("KlassID-21", LärareB, skola);
        Klass Cklassen = new Klass("KlassID-22", LärareC, skola);
        
        System.out.println("DETTA ÄR A KLASSEN");
        System.out.println(Aklassen);
        
        System.out.println("DETTA ÄR SKOLAN");
        System.out.println(skola);

        Elev ElevA = new Elev("Erik Johannson" , Aklassen);
        Elev ElevB = new Elev("Johan Johannson", Aklassen);
        Elev ElevC = new Elev("Jon Johannson",   Aklassen);
        
        System.out.println("DETTA ÄR ELEV A");
        System.out.println(ElevA);
        
        System.out.println("DETTA ÄR A KLASSEN");
        System.out.println(Aklassen);

    }   
}