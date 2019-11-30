package main;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		
		System.out.println("Type in your name: ");
		
		Scanner s = new Scanner(System.in);
		
		String input = s.nextLine();
		
		System.out.println("Hello: " + input + "!");
		
		//Ending Arguments
		s.close();
		
	}
	
}