import java.util.*;

public class Skola{
    private String namn;
    private ArrayList<Klass> klassLista = new ArrayList();
    private ArrayList<Lärare> lärarLista = new ArrayList();
    
    public Skola(String n){
        namn = n;
    }
    
    public String toString() {
        return namn + " " + klassLista + " " + lärarLista;
    }
    
    public void setKlassLista(Klass l) {
        klassLista.add(l);
    }
    
    public void setLärarLista(Lärare l) {
        lärarLista.add(l);
    }
}