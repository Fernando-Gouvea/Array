package application;

import java.util.Locale;
import java.util.Scanner;

import entities.room;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();
		int room = 0;
		room[] vect = new room[n];

		for (int i=1; i<=n; i++) {

			System.out.println("How room number your want?");
			room = sc.nextInt();
			
			if(vect[room]==null) {
				System.out.println("Name:");
				sc.nextLine();
				String name = sc.nextLine();


				System.out.println("eMail:");
				String email = sc.nextLine();


				vect[room] = new room(room,name,email);
			}
			else {System.out.println("Busy room!!!");}
		}
		

		for(int i=0; i < vect.length; i++) {

			System.out.print("\n" + vect[i]);

		}

		sc.close();
	}

}
