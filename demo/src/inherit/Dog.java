package inherit;

public class Dog extends Animal {
	
	public void soundog() {
		System.out.println("This is child class method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d=new Dog();
		d.sound();
		System.out.println(d.num);

	}

}
