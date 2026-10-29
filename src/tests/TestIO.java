package tests;

import objekte.Azubi;
import objekte.Gruppe;

public class TestIO {

	public static void main(String[] args) {
		
		int idAzubi = 1;
		Azubi az = new Azubi(idAzubi++, "Igor", "Drewensky");
		Gruppe gr = new Gruppe(0, "Gruppe U30");
		gr.addTeilnehmer(az);
		gr.addTeilnehmer(new Azubi(idAzubi++, "Wolfgang", "Fuchs"));
		gr.addTeilnehmer(new Azubi(idAzubi++, "Renate", "Ebel"));

		gr.save();
	}

}
