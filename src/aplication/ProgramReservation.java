package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class ProgramReservation { //solução 1 - muito ruim

	public static void main(String[] args) throws ParseException {
		
		Scanner scanner = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		
		System.out.print("Room number: ");
		int roomNumber = scanner.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkin = sdf.parse(scanner.next());
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkout = sdf.parse(scanner.next());
		
		// 1 verificação: a data de checkout deve ser posterior a data de checkin.
		
		if(!checkout.after(checkin)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		}
		else {
			Reservation reservation = new Reservation(roomNumber, checkin, checkout);
			System.out.println("Reservation: "+reservation);
		
		System.out.println("");
		System.out.println("Enter data to update the reservation: ");
		System.out.print("Check-in date (dd/MM/yyyy): ");
		checkin = sdf.parse(scanner.next());
		System.out.print("Check-out date (dd/MM/yyyy): ");
		checkout = sdf.parse(scanner.next());
		
		String error = reservation.updateDate(checkin, checkout);
		if(error != null) {
			System.out.print("Error in reservatio: "+error);
		}
		else {
			System.out.println("Reservation: "+reservation);
		}
		
	}
		
		
		scanner.close();
	}

}
