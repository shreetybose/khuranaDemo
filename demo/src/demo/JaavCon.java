package demo;

public class JaavCon {
	
	int num;
	String name;
	
	
	
	JaavCon(int num,String name){
	//	System.out.println("This is demo");
		this.num=num;
		this.name=name;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JaavCon jv=new JaavCon(10,"shreety");
//		jv.num=10;
//		jv.name="shreety";
//		System.out.println(jv.num);
//		System.out.println(jv.f);
		
		System.out.println(jv.num+" "+jv.name);
		
		JaavCon jv2=new JaavCon(20,"Wiolet");
//		jv2.num=20;
//		jv2.name="Wiolet";
		
		System.out.println(jv2.num+" "+jv2.name);
		
		
		
		//3 ways to initialize object
//		
//		1- by using refernce var like assgnng values to avr int name="shreety"
//		2- by method
//		3- by constructor
		
		

	}

}
