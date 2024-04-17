package chunyinyu.EsercizioS6D3.esercizio2Composite;

public class Pagina implements Elemento{
    private int numeroPagina;

    public Pagina(int numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    @Override
    public int getNumeroPagine() {
        return 1;
    }

    @Override
    public void print() {
        System.out.println("Stampo la pagina " + numeroPagina);
    }
}
