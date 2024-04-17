package chunyinyu.EsercizioS6D3.esercizio1Adapter;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class InfoAdapter implements DataSource{

    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }
    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        LocalDate dataDiNascita = info.getDataDiNascita().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int eta = calcoloEta(dataDiNascita);
        return eta;
    }

    private int calcoloEta(LocalDate dataDiNascita) {
        LocalDate today = LocalDate.now();
        Period period = Period.between(dataDiNascita, today);
        return period.getYears();
    }
}
