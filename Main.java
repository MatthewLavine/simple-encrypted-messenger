import java.util.Scanner;
import java.lang.String;

class Main {
	public static void main(String[] args) {
		String msg = "";
		int hash = 0;
		Scanner input = new Scanner (System.in);
		
		if (args[0].equals("e")) {
			System.out.print("Enter a message to encrypt: ");		
			msg = input.next();
			System.out.print(msg);		
		}	
	}
}
