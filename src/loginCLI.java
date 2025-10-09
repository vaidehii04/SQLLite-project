//dependancies
import java.util.Scanner;

public loginCLI main{
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
	
		boolean auth;

		//Asking whether the user wants to login with an existing account or create a new account
		While (auth == False){
			System.out.print("Would you like to Login or Sign-Up for *xXx* System? [L/s] ");
			Char loginSign = scnr.next().charAt(0);
			loginSign = loginSign.toLowerCaes();
			//checks for option value with login as the default
			if (loginSign == "" | loginSign == "l" | loginSign == " "){
				auth = Authenticate();
			} else if (LoginSign == "s"){
				SignUp();
				System.out.println("Congradulation. \n You have Successfully registered with *xXx* Systems. Please Proceed to the login screen.");
			} else {
				System.out.println("Please try again");
			}
		}
		scnr.close();
	}

	//authenication method
	public boolean Authenticate(){
	}

	//sign-up method
	public void SignUp(){
	}

	//Method to clear the screen for the cli
	public static void clearScreen(){
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}


