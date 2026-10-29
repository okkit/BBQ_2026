package util;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Die Klasse stellt einfache Mitteln (Methoden)<br>
 * zu Verfügung, um Daten in einen File zu schreiben/lesen
 */
public class FileIO {

	private static final String NL = "\n";
	private static final String SUCCESS_MSG = "gespeichert";

	/**
	 * Schreibt auf die einfachste Weise in einen File.
	 * 
	 * @param fileName Pfad der Datei
	 * @param data     Daten, die gespeichert werden
	 * @return
	 */
	public static String writeIntoFile(String fileName, String data) {

		try (FileWriter fileWriter = new FileWriter(fileName, true)) {

			fileWriter.write(data + NL);
			return SUCCESS_MSG;

		} catch (IOException e) {
			return e.getLocalizedMessage();
		}

	}
}
