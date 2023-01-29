import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hirsipuu {

    private int arvaukset;
    private String sana;
    private List<Character> arvausLista;

    public Hirsipuu(int arvaukset, Sanalista sanalista) {
        this.arvaukset = arvaukset;
        int sanojenMaara = sanalista.annaSanat().size();
        int satunnaisLuku = new Random().nextInt(sanojenMaara);
        this.sana = sanalista.annaSanat().get(satunnaisLuku);
        this.arvausLista = new ArrayList<>();
    }

    public boolean arvaa(Character merkki) {
        arvausLista.add(merkki);
        if (sana.contains("" + merkki)) {
            return true;
        }
        arvaukset--;
        return false;

    }

    public List<Character> arvaukset() {
        return arvausLista;
    }

    public int arvauksiaOnJaljella() {
        return arvaukset;
    }

    public String sana() {
        return sana;
    }

    public boolean onLoppu() {
        boolean tarkistus = true;
        for (Character kirjain : sana.toCharArray()) {
            if (!arvausLista.contains(kirjain)) {
                tarkistus = false;
            } 
        }
        if (tarkistus) {
            return true;
        }
        return false;
    }

    public int getArvaukset() {
        return this.arvaukset;
    }

    public void setArvaukset(int arvaukset) {
        this.arvaukset = arvaukset;
    }

    public String getSana() {
        return this.sana;
    }

    public void setSana(String sana) {
        this.sana = sana;
    }

    public List<Character> getArvausLista() {
        return this.arvausLista;
    }

    public void setArvausLista(List<Character> arvausLista) {
        this.arvausLista = arvausLista;
    }
    
}
