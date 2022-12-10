import java.util.*;

public class Klass {
    private String id;
    private Lärare klassFöreståndare;
    private ArrayList<Elev> elevLista = new ArrayList();

    static int antalKlasser = 0;

    public Klass(String i, Lärare l, Skola s) {
        id = i;
        klassFöreståndare = l;
        
        s.setKlassLista(this);
        antalKlasser++;
    }

    public String toString() {
        return elevLista + " " + klassFöreståndare + " " + id;
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