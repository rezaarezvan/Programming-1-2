public class Lärare{

    private String fNamn;
    private String eNamn;

    static int antalLärare = 0;

    public Lärare(String f, String e, Skola s) {
        fNamn = f;
        eNamn = e;
        
        s.setLärarLista(this);
        antalLärare++;
    }

    public String toString() {
        return fNamn + " " + eNamn;
    }
}