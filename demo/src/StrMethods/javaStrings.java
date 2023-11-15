package StrMethods;

public class javaStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="Kareena is good";
		//String str2="Kavya";
		String str2="Kareena";
		String str3="";
		String str4=" kashish nice girl ";
		String str5="       kashish nice girl      ";
		String str6="Test new chnages";
		
		System.out.println(str.length());//7 legth starts from 1 to nth num
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.charAt(3));//gives you the index no of that char
		System.out.println(str.contains(str2));//to check contains of both strings
		System.out.println(str3.isEmpty());
		System.out.println(str3.isBlank());
		System.out.println(str2.equals(str3));
		System.out.println(str2.equalsIgnoreCase(str3));
		System.out.println(str4.trim());
	
		System.out.println(str.replace("Kareena", "Kareena Kapoor Khan"));
		System.out.println(str.substring(1));
		System.out.println(str.substring(2, 9));
		
		
		
		
		String strName="Shreety";
		
		String rev="";
		
		for(int i=strName.length()-1;i>=0;i--) {
			rev=rev+strName.charAt(i);
		}
		System.out.println(rev);
		
		

	}

}
