import java.util.*;

public class Main{
    public static void main(String[] args) {

        Skola skola = new Skola("Huleb�ck");
        
        L�rare L�rareA = new L�rare("H�kan",  "H�kansson", skola);
        L�rare L�rareB = new L�rare("Kalle", "Bengtsson", skola);
        L�rare L�rareC = new L�rare("Erik",         "Ek", skola);
        
        System.out.println("DETTA �R L�RARE A");
        System.out.println(L�rareA);
        
        System.out.println("DETTA �R SKOLA");
        System.out.println(skola);

        Klass Aklassen = new Klass("KlassID-20", L�rareA, skola);
        Klass Bklassen = new Klass("KlassID-21", L�rareB, skola);
        Klass Cklassen = new Klass("KlassID-22", L�rareC, skola);
        
        System.out.println("DETTA �R A KLASSEN");
        System.out.println(Aklassen);
        
        System.out.println("DETTA �R SKOLAN");
        System.out.println(skola);

        Elev ElevA = new Elev("Erik Johannson" , Aklassen);
        Elev ElevB = new Elev("Johan Johannson", Aklassen);
        Elev ElevC = new Elev("Jon Johannson",   Aklassen);
        
        System.out.println("DETTA �R ELEV A");
        System.out.println(ElevA);
        
        System.out.println("DETTA �R A KLASSEN");
        System.out.println(Aklassen);

    }   
}