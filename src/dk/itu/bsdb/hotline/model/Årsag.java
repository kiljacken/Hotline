package dk.itu.bsdb.hotline.model;

import java.util.ArrayList;
import java.util.List;

public class Årsag {

	private Årsag tilhører;
	private List<Årsag> indeholder = new ArrayList<Årsag>();
	private String navn;
	private String beskrivelse;

	public Årsag() {

	}

	public Årsag(String navn, String beskrivelse, Årsag tilhører,
			List<Årsag> indeholder) {
		this.navn = navn;
		this.beskrivelse = beskrivelse;
		this.tilhører = tilhører;
		if (indeholder != null) {
			this.indeholder = indeholder;
		}
	}

	public Årsag getTilhører() {
		return tilhører;
	}

	public void setTilhører(Årsag tilhører) {
		this.tilhører = tilhører;
	}

	public List<Årsag> getIndeholder() {
		return indeholder;
	}

	public void setIndeholder(List<Årsag> indeholder) {
		this.indeholder = indeholder;
	}

	public void addIndeholder(Årsag årsag) {
		indeholder.add(årsag);
	}

	public void removeIndeholder(Årsag årsag) {
		indeholder.remove(årsag);
	}
	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public String getBeskrivelse() {
		return beskrivelse;
	}

	public void setBeskrivelse(String beskrivelse) {
		this.beskrivelse = beskrivelse;
	}
}
