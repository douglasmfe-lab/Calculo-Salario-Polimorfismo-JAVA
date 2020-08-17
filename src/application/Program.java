package application;

import java.util.ArrayList;
import java.util.*;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		ArrayList <Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
		
		System.out.printf("Employee #%d data:\n",i);	
		System.out.print("Outsourced (y/n)? ");
		char opcao = sc.next().charAt(0);
		
		switch (opcao) {
		
		case 'n':
		
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per Hour: ");
			Double valuePerHour = sc.nextDouble();
			Employee x = new Employee(name, hours, valuePerHour);
			list.add(x);
			break;
		
		
		case 'y':
				
			System.out.print("Name: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("Hours: ");
			hours = sc.nextInt();
			System.out.print("Value per Hour: ");
			valuePerHour = sc.nextDouble();
			System.out.print("Additional charge: ");
			double additionalCharge = sc.nextDouble();
		
			Employee y = new OutsourceEmployee(name, hours, valuePerHour, additionalCharge);
			list.add(y);
			break;
		
			default: 
			System.out.println("Comando inválido");
			opcao = sc.next().charAt(0);
					
		}
		
							
	}                                                     //for
		
		System.out.println("PAYMENTS: \n" + list);
		sc.close();
	}

}
