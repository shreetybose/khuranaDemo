package PolyMorphismConcept;

public class Overriding extends FunctionOverloading{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding fo=new Overriding();
		fo.getCustomerDetails();
	}
	
	
	public void getCustomerDetails() {
		System.out.println("This is child class customer details");
	}
	
	
	

}
