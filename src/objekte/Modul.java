package objekte;

public class Modul extends BBQObjekt{

	private String bezeichnung;
	private Spezialisierung spezialisierung;

	public Modul(int id, String bezeichnung) {
		super(id);
		this.bezeichnung = bezeichnung;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public Spezialisierung getSpezialisierung() {
		return spezialisierung;
	}

	public void setSpezialisierung(Spezialisierung spezialisierung) {
		this.spezialisierung = spezialisierung;
	}

	@Override
	public String toString() {
		return Fach.EOF + bezeichnung + " id " + id + Fach.EOF;
	}

	@Override
	protected String getFileName() {
		// TODO Auto-generated method stub
		return null;
	}

}
