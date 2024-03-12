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
 * @invar	| 0 <= getHours() && getHours( <= 23
 * @invar 	| 0 <= getMinutes() && getMinutes() <= 59
 */




public class TimeOfDay {
	
	public int getHours() {throw new RunTimeException("Not yet implemented"); }
	
	public int getMinutes() {throw new RunTimeException("Not yet implemented"); }
	
	public int getSeconds() {throw new RunTimeException("Not yet implemented"); }
	/**
	 * Inittialiseert het nieuwe object met de geg uren en min
	 * @pre	| 0 <= initialHours && initialHours <= 23
	 * @pre	| 0 <= initialMinutes && initialMinutes <= 59
	 * 
	 */
	
	public TimeOfDay(int initialhHours, int initialMinutes) {throw new RunTimeException("Not yet implemented"); }
	
	/**
	 * nest
	 */
	
	public void setHours(int newHours) {throw new RunTimeException("Not yet implemented"); }
	
	public void setMinutes(int newMinutes) {throw new RunTimeException("Not yet implemented"); }
	
	public void setminutesSinceMidnight(int newMinutesSinceMidnight) {throw new RunTimeException("Not yet implemented"); }

}
