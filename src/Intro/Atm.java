package Intro;

public class Atm {
private BillClass[] Level= {new BillClass(1000, 10), new BillClass(100, 10),new BillClass(50, 10),new BillClass(20, 10),new BillClass(10, 10),new BillClass(5, 10),new BillClass(1, 10)};
private int totalValue;
public Atm() {
	totalValue=1860;
}
public void restock() {
	Level[0]=new BillClass(1000,10);
	Level[1]=new BillClass(100, 10);
	Level[2]=new BillClass(50, 10);
	Level[3]=new BillClass(20, 10);
	Level[4]=new BillClass(10, 10);
	Level[5]=new BillClass(5, 10);
	Level[6]=new BillClass(1, 10);
	totalValue=1860;
}
public void withDraw(int amount) {
	if(amount>totalValue) {
		System.out.println("Sorry, not enough money in this ATM.");
	}
	else {
		recWithDraw(amount, 0);
	}
}
private void recWithDraw(int amount, int currLevel) {
	int quantity=(amount-(amount%Level[currLevel].getValue()))/Level[currLevel].getValue();
	if(quantity>Level[currLevel].getQuantity()) {
		quantity=Level[currLevel].getQuantity();
	}
	Level[currLevel].setQuantity(Level[currLevel].getQuantity()-quantity);
	totalValue-=Level[currLevel].getValue()*quantity;
	if(currLevel<5) {
		recWithDraw(amount-Level[currLevel].getValue()*quantity, currLevel+1);
	}
}
public void denomination(int chosenValue) {
	switch(chosenValue) {
	case 1000:{
		System.out.println(Level[0].getQuantity());
		break;
	}
	case 100:{
		System.out.println(Level[1].getQuantity());
		break;
	}
	case 50:{
		System.out.println(Level[2].getQuantity());
		break;
	}
	case 20:{
		System.out.println(Level[3].getQuantity());
		break;
	}
	case 10:{
		System.out.println(Level[4].getQuantity());
		break;
	}
	case 5:{
		System.out.println(Level[5].getQuantity());
		break;
	}
	case 1:{
		System.out.println(Level[6].getQuantity());
		break;
	}
	}
}
}
