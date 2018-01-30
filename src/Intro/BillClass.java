package Intro;

public class BillClass {
private int value;
private int quantity;
public BillClass(int newValue, int newQuantity) {
	if(newValue>0&&newQuantity>=0) {
		value=newValue;
		quantity=newQuantity;		
	}
	else {
		value=0; 
		quantity=0;
	}
}
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
}
