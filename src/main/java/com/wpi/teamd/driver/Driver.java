/**
 * 
 */
package com.wpi.teamd.driver;

import com.wpi.teamd.airplane.Airplanes;
import com.wpi.teamd.airport.Airports;
import com.wpi.teamd.dao.ServerInterface;
import com.wpi.teamd.view.FlightSearchFrame;

import javax.swing.*;

/**
 * @author blake
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Airports airports = ServerInterface.getAirports();
		Airplanes airplanes = ServerInterface.getAirplanes();

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
//			Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
		}

		new FlightSearchFrame(200, 200);

		for (int i = 0; i < airports.size(); i++) {
			System.out.println(airports.get(i).toString());
		}

		for (int i = 0; i < airplanes.size(); i++) {
			System.out.println(airplanes.get(i).toString());
		}

//		if (args.length != 1) {
//			System.err.println("usage: CS509.sample teamName");
//			System.exit(-1);
//			return;
//		}

//		for (Airport airport : airports) {
//			System.out.println(airport.toString());
//		}
	}
}