package startAgain;

public class Array {
	public static void main(String[] args) {
		
		String [] names = {"John", "Jack", "Maria"};
		
		for (int i=0; i< names.length; i++) {
			System.out.println("names "+names[i]);
		}
		
		
		String name = "cemil";
		System.out.println(name.charAt(2));
		
		
		
		//option one
		String [] cities = new String[3];
		cities [0] = "kutahya";
		cities [1] = "konya";
		cities [2] ="kayseri";
		
		
		
		//option 2
		String [] cities1 = new String [] {"kutahya", "konya", "kayseri"};
		
		//option 3
		String[] cities3 = {"kutahya", "konya", "kayseri"};

}
}