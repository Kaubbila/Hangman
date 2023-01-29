import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Sanalista sanalista = new Sanalista();
        Hirsipuu hirsipuu = new Hirsipuu(10, sanalista);
        
        while (true) {

            Scanner lukija = new Scanner(System.in);
            System.out.println("");
            System.out.println("Syötä kirjain:");
            Character kirjain = lukija.nextLine().toLowerCase().charAt(0);

            boolean arvaus = hirsipuu.arvaa(kirjain);
            if (arvaus) {
                System.out.println("Oikein");
            } else {
                System.out.println("Väärin");
                System.out.println("Yrityksiä jäljellä: " + hirsipuu.getArvaukset());

                if(hirsipuu.getArvaukset() == 0) {
                    System.out.println("Hävisit pelin");
                    System.exit(0);
                }
            }
            if (arvaus && hirsipuu.onLoppu()) {
                System.out.println("Voitit pelin");
                System.out.println("Sana oli: " + hirsipuu.getSana());
                break;
            }

        }

    }
}
