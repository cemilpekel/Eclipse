package day39_Class_InstanceVariablesAndMethods;

public class Person {
	

		
		String name;
		int mileCount=2;
		char gender;
		String job;
		
		public static void main(String[] args) {
		
		Person p1 = new Person();
		
		p1.burnCalory();
		
		
	}
	
	public int burnCalory () {
		this.name="ahmet";
		
	
		System.out.println( name +" is running 1 mile");
						 
		return 10;
	}
	

}
