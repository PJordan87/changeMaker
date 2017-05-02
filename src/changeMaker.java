import java.util.Scanner;

public class changeMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter an integer between 1 an 99");
		//* Displays output to the user//
		Scanner sc = new Scanner(System.in);
		//* Creates a new object//
		int cents = sc.nextInt();
		
		int quarter = 25;
		int dime = 10;
		int nickle = 5;
		int penny = 1;
		int totalQuarter = 0;
		int totalDime = 0;
		int totalNickle = 0;
		int totalPenny = 0;
		//* Define the objects and assigning a value//
		
		while (cents >= 25){
			totalQuarter= (totalQuarter + 1);
			cents = cents - 25;
			//* Keep looping as cents is greater than or equal to 25, cents equals cents minus 25 or we'd loop forever
		}
		System.out.println("totalQuarter" + totalQuarter);
		//*Displays the output to the user the total of Quarters
		while (cents >= 10){
			totalDime = (totalDime + 1);
			cents = cents - 10;
			//* Keep looping as cents is greater than or equal to 10, cents equals cents minus 10 or we'd loop forever
		}
		System.out.println("totalDime"+ totalDime);
		//*Displays the output to the user the total of Dimes//
		while (cents >= 5){
			totalNickle = (totalNickle + 1);
			cents = cents - 5;
			//*Keep looping as cents is greater than or equal to 5, cents equals cents minus 5 or we'd loop forever
		}
		System.out.println("totalNickle"+ totalNickle);
		//* Displays the output to the user the total of Nickles//
		while (cents >= 1){
			totalPenny = (totalPenny + 1);
			cents = cents - 1;
			//*Keep looping as cents is greater than or equal to 1, cents equals cents minus 1 or we'd loop forever
		}
		System.out.println("totalPenny"+ totalPenny);
		//* Displays the output to the user the total of Pennies//
	}

}
