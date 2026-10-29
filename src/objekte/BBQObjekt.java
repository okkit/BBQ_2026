package objekte;

import util.FileIO;

/**
 * Die Klasse repräsentiert ein beliebiges Objekt und<br>
 * entspricht einer DB-Entität (Tabelle in einer relationalen Datenbank).
 */
public abstract class BBQObjekt extends Object {

	protected static final String SEPARATOR = ";";
	protected static final String FOLDER = "./data/";
	protected static final String FILE_EXTENTION = ".csv";

	/**
	 * Entspricht dem PK
	 */
	protected int id;

	/**
	 * Jeder der Tochterklassen MUSS diese Methode implementieren
	 * 
	 */
	protected abstract String getFileName();

	protected abstract String getData();

	public BBQObjekt(int id) {
		this.id = id;
	}

	/**
	 * Speichert Daten der Instanzen in eine Datei
	 */
	public void save() {
		String fn = FOLDER + getFileName() + FILE_EXTENTION;
		String msg = FileIO.writeIntoFile(fn, getData());
		IO.print(msg);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
