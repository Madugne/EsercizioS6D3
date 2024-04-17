package chunyinyu.EsercizioS6D3.esercizio2Composite;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Elemento {
    private List<Elemento> elementi = new ArrayList<>();
    private List<String> autori = new ArrayList<>();
    private double prezzo;

    public void aggiungiElemento(Elemento elemento) {
        elementi.add(elemento);
    }

    public void aggiungiAutore(String autore) {
        autori.add(autore);
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public int getNumeroPagine() {
        int totale = 0;
        for (Elemento elemento : elementi) {
            totale += elemento.getNumeroPagine();
        }
        return totale;

    }

    @Override
    public void print() {
        System.out.println("Stampo il libro:");
        System.out.println("Prezzo: " + prezzo);
        System.out.println("Autori:");
        for (String autore : autori) {
            System.out.println("- " + autore);
        }
        for (Elemento elemento : elementi) {
            elemento.print();
        }

    }

}
