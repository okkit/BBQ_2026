package objekte;

/**
 * Die Klasse repräsentiert ein beliebiges Objekt und<br>
 * entspricht einer DB-Entität (Tabelle in einer relationalen Datenbank).
 */
public class BBQObjekt extends Object {
	/**
	 * Entspricht dem PK
	 */
	protected int id;

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
