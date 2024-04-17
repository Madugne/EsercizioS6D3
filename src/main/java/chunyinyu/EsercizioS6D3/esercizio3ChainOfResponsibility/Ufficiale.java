package chunyinyu.EsercizioS6D3.esercizio3ChainOfResponsibility;

public interface Ufficiale {
    void setProssimoUfficiale(Ufficiale prossimoUfficiale);

    void gestisciRichiesta(int importo);
}
