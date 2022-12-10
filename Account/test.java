import java.io.*;

public class test {

    static Person[] personFält = new Person[10];

    public static void main(String[] args) {
        
        hämtaAllt();
        personMeny();
        sparaAllt();

    }

    public static void personMeny() {
        int personIndex = 1;
        int yMeny = 1;
        int n = personFält.length;
        while(yMeny == 1 || yMeny == 2) {
            yMeny = Kbd.readInt("\nKlicka 1 för att bli kund\nKlicka 2 för att logga in\nKlicka 3 för att avsluta");

            switch(yMeny) {
                case 1:
                for (int i = 0; i < n; i++) {

                    if (personFält[i] == null) {

                        Kbd.clearScreen();
                        personFält[i] = new Person();
                        break;

                    }
                }
                break;

                case 2:
                String s = Kbd.readString("\nAnge ett lösenord");

                for (int i = 0; i < n; i++) {

                    if (personFält[i] != null && s.equalsIgnoreCase(personFält[i].getLösenord()))
                    {
                        personIndex = i;
                    }
                }
                if (personIndex != -1) {

                    System.out.println("Välkommen: "+personFält[personIndex].getNamn());
                    kontoMeny(personIndex);
                }
                else {

                    System.out.println("Finns inga konton med detta nummer");
                }
                break;

                default:
                System.out.println("Välkommen åter!");
                break;
            }
        }
    }

    public static void kontoMeny(int personIndex) {
        int mMeny = 1;
        int kontoIndex = -1;
        int n = personFält[personIndex].kontoFält.length;

        while(mMeny == 1 || mMeny == 2) {
            mMeny = Kbd.readInt("\nKlicka 1 för att skapa konto\nKlicka 2 för att logga in\nKlicka 3 för att avsluta");

            switch(mMeny) {
                case 1:
                for (int i = 0; i< n; i++) {
                    if (personFält[personIndex].kontoFält[i] == null) {

                        Kbd.clearScreen();
                        personFält[personIndex].kontoFält[i] = new Konto();

                        break;

                    }
                }
                break;

                case 2:
                String s = Kbd.readString("Ange ett kontonummer");

                for (int i = 0; i< n; i++) {

                    if (personFält[personIndex].kontoFält[i] != null && s.equals(personFält[personIndex].kontoFält[i].getKontonummer())) {

                        kontoIndex = i;

                    }
                }
                if (kontoIndex != -1) {

                    System.out.println("Välkommen: "+personFält[personIndex].kontoFält[kontoIndex].getKontonummer());
                    valMeny(personIndex,kontoIndex);
                }
                else {

                    System.out.println("Finns inga konton med detta nummer");
                }    
                break;
            }

        }
    }   

    public static void valMeny(int personIndex,int kontoIndex) {
        int iMeny = 1;
        while(iMeny != 4) {
            System.out.println();
            iMeny = Kbd.readInt("Klicka 1 för att se ditt saldo\nKlicka 2 för att göra uttag\nKlicka 3 för insättning\nKlicka 4 för gå tillbaks till kontomenyn");
            System.out.println();

            switch(iMeny) {
                case 1:
                personFält[personIndex].kontoFält[kontoIndex].saldoBesked();
                break;

                case 2:
                personFält[personIndex].kontoFält[kontoIndex].uttag();
                break;

                case 3:
                personFält[personIndex].kontoFält[kontoIndex].insättning();
                break;

            }
            System.out.println();
        }
    }
    
    public static void hämtaAllt() {
        try {
            FileInputStream fis=new FileInputStream("sparfil_1");
            ObjectInputStream ois=new ObjectInputStream(fis);
            personFält = (Person[]) ois.readObject();
            ois.close();
        } catch (Throwable t)  {System.out.println("Går ej att hämta info"); }
    }

    public static void sparaAllt() {
        try {
            FileOutputStream fos=new FileOutputStream("sparfil_1");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(personFält);
            oos.close();
        } catch (Throwable t)  {System.out.println("Fel vid sparande"); }
    }
    
    
    
    
}


