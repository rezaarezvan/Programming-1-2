import java.util.*;

public class Klass {
    private String id;
    private L�rare klassF�rest�ndare;
    private ArrayList<Elev> elevLista = new ArrayList();

    static int antalKlasser = 0;

    public Klass(String i, L�rare l, Skola s) {
        id = i;
        klassF�rest�ndare = l;
        
        s.setKlassLista(this);
        antalKlasser++;
    }

    public String toString() {
        return elevLista + " " + klassF�rest�ndare + " " + id;
    }
    
    public String getID(){
        return id;
    }
    
    public void setID(String i){
        id = i;
    }
    
    public void setElevLista(Elev e) {
        elevLista.add(e);
    }
}