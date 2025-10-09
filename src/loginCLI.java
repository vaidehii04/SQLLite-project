//dependancies
import java.util.Scanner;
import java.lang.InterruptedException;

class loginCLI{
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
	
		boolean auth = false;

		//Asking whether the user wants to login with an existing account or create a new account
		while (auth == false){
			System.out.println("Would you like to Login or Sign-Up for *xXx* System? [L/s]");
			char loginSign = scnr.nextLine().charAt(0);
			loginSign = Character.toLowerCase(loginSign);
			//checks for option value with login as the default
			if (loginSign == 'l'){
				clearScreen();
				auth = Authenticate();
				System.out.println("You have Successfully Logged in");
			} else if (loginSign == 's'){
				clearScreen();
				SignUp();
				System.out.println("Congradulation. \n You have Successfully registered with *xXx* Systems. Please Proceed to the login screen.");
				clearScreen();
			} else {
				System.out.println("Please try again");
			}
		}
		scnr.close();
	}

	//authenication method
	public static boolean Authenticate(){
		return true;
	}

	//sign-up method
	public static void SignUp(){
		System.out.println("lol");
	}

	//Method to clear the screen for the cli
	public static void clearScreen(){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e){
			Thread.currentThread().interrupt();
		}
		System.out.print("\033[H");
		System.out.flush();
	}
}
