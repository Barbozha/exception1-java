package Programas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Model.entity.Reserva;

public class Aplicacao {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Room number: ");
		int num = ler.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date dataentrada = sdf.parse(ler.next());
		System.out.print("Check-out date (dd/MM/yyyy) :");
		Date datasaida = sdf.parse(ler.next());

		if (!datasaida.after(dataentrada)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		} else {
			Reserva reserva = new Reserva(num, dataentrada, datasaida);
			System.out.println("Reservation: " + reserva);

			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			dataentrada = sdf.parse(ler.next());
			System.out.print("Check-out date (dd/MM/yyyy) :");
			datasaida = sdf.parse(ler.next());

			Date agora = new Date();
			if (dataentrada.before(agora) || datasaida.before(agora)) {
				System.out.println("Error in reservation: Reservation dates for update must be future dates");
			} else if (!datasaida.after(dataentrada)) {
				System.out.println("Error in reservation: Check-out date must be after check-in date");
			} else {
				// atualizar as datas
				reserva.updateDats(dataentrada, datasaida);
				System.out.println("Reservation: " + reserva);
			}
		}

		ler.close();

	}

}
