/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parking_lot;
import CtCILibrary.AssortedMethods;
/**
 *
 * @author think2
 */
public class Parking_lot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                ParkingLot lot = new ParkingLot();
		
		Vehicle v = null;
		while (v == null || lot.parkVehicle(v)) {
			lot.print();
			int r = AssortedMethods.randomIntInRange(0, 10);
			if (r < 2) {
				v = new Bus();
			} else if (r < 4) {
				v = new Motorcycle();
			} else {
				v = new Car();
			}
			System.out.print("\nParking a ");
			v.print();
			System.out.println("");
		}
		System.out.println("Parking Failed. Final state: ");
		lot.print();
    }
    
}
