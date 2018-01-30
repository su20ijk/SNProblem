package Intro;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atm cashMachine = new Atm();
		Scanner input=new Scanner(System.in);
		System.out.println("Your first command:");
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
				cashMachine.withDraw(Integer.parseInt(userInput.split("\\$")[1]));
				break;
			}
			case"I":{
				cashMachine.denomination(Integer.parseInt(userInput.split("\\$")[1]));
				break;
			}
			case"Q":{
				break outer;
			}
			default:{
				System.out.println("invalid input, please try again! Thank you.");
			}
			}
			System.out.println("Your next Command:");
			userInput=input.nextLine();
			decision=userInput.split("\\$")[0];
		}
		System.out.println("Successfully ended the program!");
	}
}
