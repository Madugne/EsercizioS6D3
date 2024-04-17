package chunyinyu.EsercizioS6D3.esercizio3ChainOfResponsibility;

public class Maggiore implements Ufficiale{

    private Ufficiale prossimoUfficiale;
    @Override
    public void setProssimoUfficiale(Ufficiale prossimoUfficiale) {
        this.prossimoUfficiale = prossimoUfficiale;
    }

    @Override
    public void gestisciRichiesta(int importo) {
        if (importo <= 2000) {
            System.out.println("Maggiore gestisce la richiesta di stipendio.");
        } else if (prossimoUfficiale != null) {
            prossimoUfficiale.gestisciRichiesta(importo);
        }
    }
}
