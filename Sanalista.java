import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sanalista {

    private List<String> sanat;

    public Sanalista() {
        this.sanat = new ArrayList<String>();
        try {
            File tiedosto = new File("src/sanat.txt");
            Scanner lukija = new Scanner(tiedosto);
            while (lukija.hasNextLine()) {
                sanat.add(lukija.nextLine());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<String> annaSanat() {
        return this.sanat;
    }

    public List<String> getSanat() {
        return this.sanat;
    }

    public void setSanat(List<String> sanat) {
        this.sanat = sanat;
    }

}
