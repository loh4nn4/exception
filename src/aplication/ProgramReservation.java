package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class ProgramReservation { 

	public static void main(String[] args) { // solução 3 - tramento de exceções 
		
		Scanner scanner = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		
		try {
			System.out.print("Room number: ");
			int roomNumber = scanner.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkin = sdf.parse(scanner.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkout = sdf.parse(scanner.next());
			
			Reservation reservation = new Reservation(roomNumber, checkin, checkout);
			System.out.println("Reservation: "+reservation);
			
			System.out.println("");
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkin = sdf.parse(scanner.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkout = sdf.parse(scanner.next());
			
			reservation.updateDate(checkin, checkout);
			System.out.println("Reservation: "+reservation);
		}
		catch(ParseException e) {
			System.out.println("Invalid date format.");
		}
		catch(DomainException e) {
			System.out.println("Error in reservation: "+e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error.");
		}
		
		scanner.close();
	}

}
