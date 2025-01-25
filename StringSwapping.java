
public class StringSwapping {

	public static void main(String[] args) {
	
		String name1 = "Ramu";
		String name2 = "Abdul";
		System.out.println("Before Swapping....");
		System.out.println("name1------"+name1);
		System.out.println("name2------"+name2);
		
		
		name2 = name2+name1;// AbdulRamu
		name1 = name2.substring(0, name2.length()-name1.length());// Abdul
		name2 = name2.substring(name1.length());
		
		
	   System.out.println("Afters Swapping....");
		System.out.println("name1------"+name1);
		System.out.println("name2------"+name2);
		
		
		
		
	}

}