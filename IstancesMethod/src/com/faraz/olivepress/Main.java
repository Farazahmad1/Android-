package com.faraz.olivepress;

import com.faraz.olivepress.olivess.Olivess;
import com.faraz.olivepress.press.Press;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Olivess[] olivess= {new Olivess(),new Olivess(),new Olivess()};
 Press press=new Press();
 press.getOil(olivess);
	}

}
