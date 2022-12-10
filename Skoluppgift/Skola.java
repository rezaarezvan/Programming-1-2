import java.util.*;

public class Skola{
    private String namn;
    private ArrayList<Klass> klassLista = new ArrayList();
    private ArrayList<L�rare> l�rarLista = new ArrayList();
    
    public Skola(String n){
        namn = n;
    }
    
    public String toString() {
        return namn + " " + klassLista + " " + l�rarLista;
    }
    
    public void setKlassLista(Klass l) {
        klassLista.add(l);
    }
    
    public void setL�rarLista(L�rare l) {
        l�rarLista.add(l);
    }
}