package dk.itu.bsdb.hotline.model;

import java.util.ArrayList;
import java.util.List;

public class Medarbejder {

	private String navn, email, telefon;
	private Hotlinemedarbejder hotlineMedarbejder;
	
	private List<Sag> sagSender = new ArrayList<Sag>();
	
	public Medarbejder() {
		
	}

	public Medarbejder(String navn, String email, String telefon,
			Hotlinemedarbejder hotlineMedarbejder, List<Sag> sagSender) {
		super();
		this.navn = navn;
		this.email = email;
		this.telefon = telefon;
		this.hotlineMedarbejder = hotlineMedarbejder;
		if(sagSender != null) {
			this.sagSender = sagSender;
		}
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public Hotlinemedarbejder getHotlineMedarbejder() {
		return hotlineMedarbejder;
	}

	public void setHotlineMedarbejder(Hotlinemedarbejder hotlineMedarbejder) {
		this.hotlineMedarbejder = hotlineMedarbejder;
	}

	public List<Sag> getSagSender() {
		return sagSender;
	}

	public void setSagSender(List<Sag> sagSender) {
		this.sagSender = sagSender;
	}
	
	public void addSagSender(Sag sag) {
		sagSender.add(sag);
	}
	
	public void removeSagSender(Sag sag) {
		sagSender.remove(sag);
	}
 }
