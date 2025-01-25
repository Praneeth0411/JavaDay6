public class SubStribgDemo {
	public static void main(String[] args) {
                  char ch ='a';
                    String name1="Ramu";
String name2="Karthik";
System.out.println("Before swapping....");
System.out.println("Name 1 Will Be.....   "+name1);
System.out.println("Name 2 Will Be.....   "+name2);
  name1=name1+name2;
  name2=name1.substring(0,name1.length()-name2.length());
  name1=name1.substring(name2.length());
System.out.println("After swapping....");
System.out.println("Name 1 Will Be.....   "+name1);
System.out.println("Name 2 Will Be.....   "+name2);
	}
}