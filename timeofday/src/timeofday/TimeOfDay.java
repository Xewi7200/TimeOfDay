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
	
	/**
	 * @invar | 0 <= minutesSinceMidnight && minutesSinceMidnight < 24 * 60
	 */
	private int minutesSinceMidnight;
	
	public int getHours() {return minutesSinceMidnight / 60; }
	
	public int getMinutes() {return minutesSinceMidnight % 60; }
	
	public int getMinutesSinceMidnight() {return minutesSinceMidnight; }
	/**
	 * Initialiseert het nieuwe object met de geg uren en min
	 * @pre	| 0 <= initialHours && initialHours <= 23
	 * @pre	| 0 <= initialMinutes && initialMinutes <= 59
	 * 
	 */
	
	public TimeOfDay(int initialHours, int initialMinutes) {
		minutesSinceMidnight = initialHours * 60 + initialMinutes;
	}
	
	/**
	 * nest
	 */
	
	public void setHours(int newHours) {minutesSinceMidnight = newHours * 60 + getMinutes(); }
	
	public void setMinutes(int newMinutes) {
		minutesSinceMidnight -= getMinutes();
		minutesSinceMidnight += newMinutes;
	}
	
	public void setMinutesSinceMidnight(int newMinutesSinceMidnight) {
		minutesSinceMidnight = newMinutesSinceMidnight;
	}

}
