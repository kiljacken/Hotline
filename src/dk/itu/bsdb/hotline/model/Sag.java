package dk.itu.bsdb.hotline.model;

import java.util.Date;
/**
 * Sag representation
 * 
 * @author Morten Esbensen
 *
 */
public class Sag {

	public enum Status {NIV1, NIV2, BEHANDLES}
	
	private int sagsNr;
	private String subjekt, text;
	private Date startTid, afslutTid, rykkeTid;
	private Status status;
	private int prioritet;
	
	private Hotlinemedarbejder ejer;
	private Hotlinemedarbejder modtager;
	private Medarbejder sender;
	private Årsag årsag;
	
	public Sag() {}

	public Sag(int sagsNr, String subjekt, String text, Date startTid,
			Date afslutTid, Date rykkeTid, Status status, int prioritet) {
		super();
		this.sagsNr = sagsNr;
		this.subjekt = subjekt;
		this.text = text;
		this.startTid = startTid;
		this.afslutTid = afslutTid;
		this.rykkeTid = rykkeTid;
		this.status = status;
		this.prioritet = prioritet;
	}
	
	

	public int getSagsNr() {
		return sagsNr;
	}

	public void setSagsNr(int sagsNr) {
		this.sagsNr = sagsNr;
	}

	public String getSubjekt() {
		return subjekt;
	}

	public void setSubjekt(String subjekt) {
		this.subjekt = subjekt;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getStartTid() {
		return startTid;
	}

	public void setStartTid(Date startTid) {
		this.startTid = startTid;
	}

	public Date getAfslutTid() {
		return afslutTid;
	}

	public void setAfslutTid(Date afslutTid) {
		this.afslutTid = afslutTid;
	}

	public Date getRykkeTid() {
		return rykkeTid;
	}

	public void setRykkeTid(Date rykkeTid) {
		this.rykkeTid = rykkeTid;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public int getPrioritet() {
		return prioritet;
	}

	public void setPrioritet(int prioritet) {
		this.prioritet = prioritet;
	}

	public Hotlinemedarbejder getEjer() {
		return ejer;
	}

	public void setEjer(Hotlinemedarbejder ejer) {
		this.ejer = ejer;
	}

	public Hotlinemedarbejder getModtager() {
		return modtager;
	}

	public void setModtager(Hotlinemedarbejder modtager) {
		this.modtager = modtager;
	}

	public Medarbejder getSender() {
		return sender;
	}

	public void setSender(Medarbejder sender) {
		this.sender = sender;
	}

	public Årsag getÅrsag() {
		return årsag;
	}

	public void setÅrsag(Årsag årsag) {
		this.årsag = årsag;
	}	
}

