package week3.day1;

public class BMW extends Car {
	//rewriting the base class function in the sub class with a different definition
public void logo() {
	System.out.println("BMW LOGO");
}
@Override
public void applyBrake() {
	System.out.println("Apply ABS Brake");
}
}
