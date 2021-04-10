package Assignments_Lab_1;

public class Lab_1 {

	public static void main(String[] args) {
		
		stringTimes("Hi", 2);
		stringTimes("Hi", 3);
		stringTimes("Hi", 1);
		
		}
	public static void stringTimes(String string, int number) {
		String str = "";
		
		for(int i=0;i<number;i++) {
			
			str = str + string;   
	}
		System.out.println(str);
	}
	
}
