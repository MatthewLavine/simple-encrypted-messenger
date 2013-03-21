import java.util.Scanner;
import java.lang.String;

class Main {
	public static void main(String[] args) {
		int num = 0;
		int hash = 0;
		Scanner input = new Scanner (System.in);
		
		if (args[0].equals("e")) {
			System.out.print("Enter number to encrypt: ");		
			num = Integer.parseInt(input.next());
			hash = num*52;
			System.out.println("You're hash is: " + hash);
		}	
		
		if (args[0].equals("d")) {
			System.out.print("Enter hash to decrypt: ");
			hash = Integer.parseInt(input.next());
			num = hash/52;
			System.out.println("The number is: " + num);
		}	
	}
}
