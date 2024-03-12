package timeofday;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {

	@Test
	/** Krijgt integers uur, min en sec mee en convert het naar een duidelijke string
	 * @pre uur is tussen de 0 en 23, min en sec zijn tussen de 0 en 60
	 * 	| 0 <= uur && uur <= 23 && 0 <= min && min <= 59 && 0 <= sec && sec <= 59
	 * @post Het resultaat is een string
	 */
	String time(int uur, int min, int sec) {
		return uur + "u" + min + "min" + sec + "sec";
	}

}
