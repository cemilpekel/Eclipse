package day34_Var.Args;

public class VarArgs {
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		int[] nums = {2,3,7};
		
		//it will take int array as an argument
		c.printAllArrayNumbers(nums);
		
		
		//this method will take variable argument numbers, 
		//we can pass as many as we want
		c.printAllNumbers(12, 34,563,4,101,10);
		
		
		//if I call it different numbers
		c.printAllNumbers(2,3,1453,1919,1881,1938, 1,2,3,4,5);
		
		
		
		
	}
	

}
