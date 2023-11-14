package inherit;

public class Cat extends Dog {
	
	public void soundCat() {
		System.out.println("This is child class method for cat");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat d=new Cat();
		d.soundog();
		System.out.println(d.num);

	}

}
