package dk.itu.bsdb.hotline.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Hotlinemedarbejder representation
 * 
 * @author Morten Esbensen
 *
 */
public class Hotlinemedarbejder {
	
	private boolean adviserMedEmail;
	private int niveau;
	private Medarbejder medarbejder;
	private boolean fraværNu;
	
	private List<Sag> sagEjer = new ArrayList<Sag>();
	private List<Sag> sagModtager = new ArrayList<Sag>();
	
	public Hotlinemedarbejder() {
		
	}

	public Hotlinemedarbejder(boolean adviserMedEmail, int niveau,
			Medarbejder medarbejder, boolean fraværNu, List<Sag> sagEjer, List<Sag> sagModtager) {
		super();
		this.adviserMedEmail = adviserMedEmail;
		this.niveau = niveau;
		this.medarbejder = medarbejder;
		this.fraværNu = fraværNu;
		if(sagEjer != null) {
			this.sagEjer = sagEjer;
		}
		if(sagModtager != null) {
			this.sagModtager = sagModtager;
		}
	}

	public boolean isAdviserMedEmail() {
		return adviserMedEmail;
	}

	public void setAdviserMedEmail(boolean adviserMedEmail) {
		this.adviserMedEmail = adviserMedEmail;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public Medarbejder getMedarbejder() {
		return medarbejder;
	}

	public void setMedarbejder(Medarbejder medarbejder) {
		this.medarbejder = medarbejder;
	}

	public List<Sag> getSagEjer() {
		return sagEjer;
	}

	public void setSagEjer(List<Sag> sagEjer) {
		this.sagEjer = sagEjer;
	}

	public List<Sag> getSagModtager() {
		return sagModtager;
	}

	public void setSagModtager(List<Sag> sagModtager) {
		this.sagModtager = sagModtager;
	}
	
	public boolean isFraværNu() {
		return fraværNu;
	}

	public void setFraværNu(boolean fraværNu) {
		this.fraværNu = fraværNu;
	}

	public void addSagModtager(Sag modtager) {
		sagModtager.add(modtager);
	}
	
	public void removeSagModtager(Sag modtager) {
		sagModtager.remove(modtager);
	}
	
	public void addSagEjer(Sag ejer) {
		sagEjer.add(ejer);
	}
	
	public void removeSagEjer(Sag ejer) {
		sagEjer.remove(ejer);
	}
}
