package dk.itu.bsdb.hotline.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Model-klasse over Hotline systemet.
 * 
 * @author Morten Esbensen
 *
 */
public class Model {
	
	// Singleton instance
	private Model instance;
	
	// Lister over objekter
	private List<Medarbejder> medarbejdere;
	private List<Hotlinemedarbejder> hotlineMedarbejder;
	private List<Sag> sager;
	private List<Årsag> årsager;
	
	/**
	 * Singleton access
	 * @return Hotline model
	 */
	public Model getModel() {
		if(instance == null) {
			initModel();
		}	
		return instance;
	}
	
	private Model() {
		medarbejdere = new ArrayList<Medarbejder>();
		hotlineMedarbejder = new ArrayList<Hotlinemedarbejder>();
		sager = new ArrayList<Sag>();
		årsager = new ArrayList<Årsag>();
		
		// Medarbejdere
		Medarbejder m1 = new Medarbejder();
		m1.setNavn("Nete Hansen");
		m1.setEmail("nete@itu.dk");
		
		Medarbejder m2 = new Medarbejder();
		m2.setNavn("knt");
		m2.setEmail("knt@itu.dk");
		
		Medarbejder m3 = new Medarbejder();
		m3.setNavn("esben");
		m3.setEmail("esben@itu.dk");
		
		Medarbejder m4 = new Medarbejder();
		
		
		medarbejdere.add(m1);
		medarbejdere.add(m2);
		medarbejdere.add(m3);
		
		// Hotlinemedarb.
		Hotlinemedarbejder hm1 = new Hotlinemedarbejder();
		hm1.setMedarbejder(m2);
		
		Hotlinemedarbejder hm2 = new Hotlinemedarbejder();
		hm2.setMedarbejder(m3);
		
		hotlineMedarbejder.add(hm1);
		hotlineMedarbejder.add(hm2);
		
		// Årsager
		Årsag å1 = new Årsag();
		å1.setNavn("Printer");
		
		Årsag å2 = new Årsag();
		å2.setNavn("Login");
		
		Årsag å3 = new Årsag();
		å3.setNavn("Almindelig");
		å3.setTilhører(å1);
		
		Årsag å4 = new Årsag();
		å4.setNavn("Farve");
		å4.setTilhører(å1);
		
		Årsag å5 = new Årsag();
		å5.setNavn("Inkjet");
		å5.setTilhører(å1);
		
		å1.addIndeholder(å3);
		å1.addIndeholder(å4);
		å1.addIndeholder(å5);
		
		årsager.add(å1);
		årsager.add(å2);
		årsager.add(å3);
		årsager.add(å4);
		årsager.add(å5);
		
		// Sager
				
	}
	
	/**
	 * Initialiserer en model med data
	 */
	private void initModel() {
		instance = new Model();
		
		// Test model
	}
}
