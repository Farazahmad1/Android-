package com.faraz.olivepress.press;

import com.faraz.olivepress.olivess.Olivess;

public class Press {

	public void getOil(Olivess[] olives) {
		for (Olivess olivess : olives) {
		olivess.crush();
		}
	}
	
}
