package timeofday;

/*
 * Hoe ontwikkel ik een data-abstractie?
 * 1. De API definieren: hoe kunnen & moeten klanten de abstraxtie gebruiken
 * 	a. Korte informelen documentatue bi de klasse zelf: wat slaat een instantie op (mutabele abstraction) of stekt een instantie voor (inmutable abstarction0?
 * 	b. De rauwe abstractetoestandsruimte definieren: de inspectoren (=getters) declareren
 * 2. De abstracte implementeren in termen van Java-contructies: velden en method/contructor bodies toevoegen
 */


/**
 * Elke instantie van deze klase slaat een tijdstip op, geg door een aantal uren sinds middernacht en een aantal min binnen het uur
 * 
 * @invar	| getMinutesSinceMidnight() == getHours() * 60 + getMinutes()
 * @invar	| 0 <= getHours() && getHours() <= 23
 * @invar 	| 0 <= getMinutes() && getMinutes() <= 59
 */




public class TimeOfDay {
	
	private int hours;
	private int minutes;
	
	public int getHours() {return hours;}
	
	public int getMinutes() {return minutes; }
	
	public int getMinutesSinceMidnight() {return hours * 60 + minutes; }
	/**
	 * Inittialiseert het nieuwe object met de geg uren en min
	 * @pre	| 0 <= initialHours && initialHours <= 23
	 * @pre	| 0 <= initialMinutes && initialMinutes <= 59
	 * 
	 */
	
	public TimeOfDay(int initialHours, int initialMinutes) {
		this.hours = initialHours;
		this.minutes = initialMinutes;
	}
	
	/**
	 * nest
	 */
	
	public void setHours(int newHours) {hours = newHours; }
	
	public void setMinutes(int newMinutes) {minutes = newMinutes; }	//had ook ipv newMinutes minutes kunnen kiezen maar dan had je {this.minutes = minutes;} moeten doen
	
	public void setMinutesSinceMidnight(int newMinutesSinceMidnight) {
		hours = newMinutesSinceMidnight / 60;
		minutes = newMinutesSinceMidnight % 60;
	}

}
