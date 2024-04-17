package chunyinyu.EsercizioS6D3.esercizio3ChainOfResponsibility;

public class Generale implements Ufficiale{
    private Ufficiale prossimoUfficiale;
    @Override
    public void setProssimoUfficiale(Ufficiale prossimoUfficiale) {
        this.prossimoUfficiale = prossimoUfficiale;
    }

    @Override
    public void gestisciRichiesta(int importo) {
        if (importo <= 5000) {
            System.out.println("Generale gestisce la richiesta di stipendio.");
        } else {
            System.out.println("IMPORTO ERRATO.");
        }
    }
}
