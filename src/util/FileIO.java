package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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

			fileWriter.write(NL + data);
			return SUCCESS_MSG;

		} catch (IOException e) {
			return e.getLocalizedMessage();
		}

	}

	/**
	 * Zählt die Anzahl der Zeilen in einem File
	 * 
	 * @param fileName
	 * @return Anzahl der Zeilen, 0 auch, wenn Fehler beim lesen aus dem File
	 */
	public static int getLineCount(String fileName) {

		int count = 0;
		try (Scanner scanner = new Scanner(new File(fileName))) {
			while (scanner.hasNextLine()) {
				scanner.next();
				count++;
			}
		} catch (FileNotFoundException e) {
		}
		return count;
	}
}
