package OpgaveArk240321;

import java.util.ArrayList;
import java.util.Comparator;

public class SuperligaKlub implements Comparable<SuperligaKlub>, Comparator<SuperligaKlub>{

    //Opgave 1:
    private String klubnavn;
    private String adresse;
    private String postnummer;
    private int vundneKampe;
    private int uafgjorteKampe;
    private int spilledeKampe;
    private int scoringer;
    private int udvisninger;
    private int guleKort;
    private ArrayList<String> spillere;

    public SuperligaKlub(String klubnavn, String adresse, String postnummer, int vundneKampe, int uafgjorteKampe,
                         int spilledeKampe, int scoringer, int udvisninger, int guleKort, ArrayList<String> spillere) {
        this.klubnavn = klubnavn;
        this.adresse = adresse;
        this.postnummer = postnummer;
        this.vundneKampe = vundneKampe;
        this.uafgjorteKampe = uafgjorteKampe;
        this.spilledeKampe = spilledeKampe;
        this.scoringer = scoringer;
        this.udvisninger = udvisninger;
        this.guleKort = guleKort;
        this.spillere = spillere;
    }

    /*@Override
    public int compareTo(SuperligaKlub_Opgave1 s1) {
        if (this.vundneKampe == s1.vundneKampe) return 0;
        else if (this.vundneKampe > s1.vundneKampe) return 1;
        else return -1;
    }*/

    //Opgave 3:
    @Override
    public int compareTo(SuperligaKlub s1) {
        return this.klubnavn.compareTo(s1.klubnavn);
    }

    @Override
    public int compare(SuperligaKlub o1, SuperligaKlub o2) {
        return 0;
    }

    @Override
    public String toString() {
        return "SuperligaKlub{" +
                "klubnavn='" + klubnavn + '\'' +
                ", adresse='" + adresse + '\'' +
                ", postnummer='" + postnummer + '\'' +
                ", vundneKampe=" + vundneKampe +
                ", uafgjorteKampe=" + uafgjorteKampe +
                ", spilledeKampe=" + spilledeKampe +
                ", scoringer=" + scoringer +
                ", udvisninger=" + udvisninger +
                ", guleKort=" + guleKort +
                ", spillere=" + spillere +
                '}';
    }

    //Getters
    public String getKlubnavn() {
        return klubnavn;
    }

    public int getVundneKampe() {
        return vundneKampe;
    }


}
