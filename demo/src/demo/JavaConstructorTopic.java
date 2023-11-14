package demo;

public class JavaConstructorTopic {
	
	
	int salary;
	String name;
	boolean flag;
	
	
	JavaConstructorTopic(int salary,String name){
		System.out.println("This is parametrized constructor");
		this.salary=salary;
		this.name=name;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//special method in java class name is same constructor
		// 1- no arg - defaault
		//2- no arg - user defined
		//3- parameterized 
		
		//public,defualt,private,protected
		
		//user defined no arg constructor
		
		//parameterixed constructor
		
		
		
		JavaConstructorTopic jc=new JavaConstructorTopic(50000,"kavya");
		JavaConstructorTopic jc2=new JavaConstructorTopic(60000,"vaashi");
		System.out.println(jc.salary+" "+ jc.name);
		System.out.println(jc2.salary+" "+ jc2.name);
		
		//compiler will set default
//		System.out.println(jc.salary);
//		System.out.println(jc.name);
//		System.out.println(jc.flag);
		
		
		//we can initialize object using reference var, method, constructor
		
		
		
		

	}

}
