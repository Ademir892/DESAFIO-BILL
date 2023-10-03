import java.util.Locale;
import java.util.Scanner;

import entities.Bill;
import entities.Student;

public class Main {

	public static void main(String[] args) {
		Bill bill = new Bill();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Sexo: ");
		bill.gender = sc.nextLine().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		bill.beer = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		bill.softDrink = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		bill.barbecue = sc.nextInt();
		
		
		System.out.println("RELATORIO:");
		System.out.printf("Consumo: %.2f%n", bill.feeding());
		System.out.printf("Couvert: %.2f%n", bill.cover());
		System.out.printf("Ingresso: %.2f%n", bill.ticket());
		System.out.println();
		System.out.printf("Valor a pagar = %.2f%n", bill.total(bill.cover(), bill.feeding(), bill.ticket()));
		
		sc.close();
		}
	}	

