package Intro;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atm cashMachine = new Atm();
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your first command:");
		String userInput=input.nextLine();
		String decision=userInput.split("\\$")[0];
		outer:
		while(!decision.equals("Q")) {
			switch(decision) {
			case"R":{
				cashMachine.restock();
				break;
			}
			case"W":{
				try {
				System.out.println(cashMachine.withDraw(Integer.parseInt(userInput.split("\\$")[1])));
				}catch(Exception e) {
					System.out.println("Invalid input, please try to enter another command: ");
				}
				break;
			}
			case"I":{
				try {
				cashMachine.denomination(Integer.parseInt(userInput.split("\\$")[1]));
				}catch(Exception e) {
					System.out.println("Invalid input, please try to enter another command: ");
				}
				break;
			}
			case"Q":{
				break outer;
			}
			default:{
				System.out.println("Invalid input, please try to enter another command: ");
			}
			}
			System.out.println("Please enter your next Command:");
			userInput=input.nextLine();
			decision=userInput.split("\\$")[0];
		}
		System.out.println("Successfully ended the program! Have a nice day!");
	}
}
