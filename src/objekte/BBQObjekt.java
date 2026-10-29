package objekte;

import util.FileIO;

/**
 * Die Klasse repräsentiert ein beliebiges Objekt und<br>
 * entspricht einer DB-Entität (Tabelle in einer relationalen Datenbank).
 */
public abstract class BBQObjekt extends Object {
	/**
	 * Entspricht dem PK
	 */
	protected int id;
	
	/**
	 * 
	 */
	protected abstract String getFileName();
	
	public void save() {
		String msg = FileIO.writeIntoFile(getFileName(), getData());
		IO.print(msg);
	}
		

	protected String getData() {
		return null;
	}


	public BBQObjekt(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
