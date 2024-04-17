package chunyinyu.EsercizioS6D3;

import chunyinyu.EsercizioS6D3.esercizio1Adapter.Info;
import chunyinyu.EsercizioS6D3.esercizio1Adapter.InfoAdapter;
import chunyinyu.EsercizioS6D3.esercizio1Adapter.UserData;
import chunyinyu.EsercizioS6D3.esercizio3ChainOfResponsibility.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
public class EsercizioS6D3Application {

	public static void main(String[] args) {
		SpringApplication.run(EsercizioS6D3Application.class, args);

		// ESERCIZIO 1

		Info info = new Info("Chris", "Keya", new Date(93, Calendar.DECEMBER, 24));

		InfoAdapter adapter = new InfoAdapter(info);

		System.out.println(adapter.getNomeCompleto());
		System.out.println(adapter.getEta());
		System.out.println("**********************************************");

		// ESERCIZIO 3

		Ufficiale capitano = new Capitano();
		Ufficiale maggiore = new Maggiore();
		Ufficiale tenente = new Tenente();
		Ufficiale colonnello = new Colonnello();
		Ufficiale generale = new Generale();

		capitano.setProssimoUfficiale(maggiore);
		maggiore.setProssimoUfficiale(tenente);
		tenente.setProssimoUfficiale(colonnello);
		colonnello.setProssimoUfficiale(generale);

		int importo = 1500;
		System.out.println("Richiesta di stipendio: " + importo);
		capitano.gestisciRichiesta(importo);
	}
}
