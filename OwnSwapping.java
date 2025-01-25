import java.util.Scanner;

public class OwnSwapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome!");
		System.out.println("To Continue Press 1");
		char ch = sc.next().charAt(0);
		while(ch == '1') {
			System.out.println("enter name 1");
			String name1 = sc.next();
			System.out.println("enter name 2");
			String name2 = sc.next();
			
			name1=name1+name2;
			  name2=name1.substring(0,name1.length()-name2.length());
			  name1=name1.substring(name2.length());
			System.out.println("After swapping....");
			System.out.println("Name 1 Will Be.....   "+name1);
			System.out.println("Name 2 Will Be.....   "+name2);
			
			System.out.println("If you want to continue press 1");
			ch = sc.next().charAt(0);
			
		}// while
		System.out.println("InValid Transcation!!!");
			
		}

	

}
