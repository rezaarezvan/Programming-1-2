public class L�rare{

    private String fNamn;
    private String eNamn;

    static int antalL�rare = 0;

    public L�rare(String f, String e, Skola s) {
        fNamn = f;
        eNamn = e;
        
        s.setL�rarLista(this);
        antalL�rare++;
    }

    public String toString() {
        return fNamn + " " + eNamn;
    }
}