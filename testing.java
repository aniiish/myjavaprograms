import java.util.Scanner;
class testing {
	public static void main(String[] args)   {
		// System.out.print("This is a test program");
		// Scanner input = new Scanner(System.in);
  //       System.out.print("Enter a sentence :- ");
  //       String sen = input.next();
  //       System.out.print(sen);

  //         // proof that '==' and equals() are't the same.

		// String s1 = new String("This is a string");
  //       String s2 = new String("This is a string");
 
  //       boolean refEqual = (s1 == s2);
  //       boolean secEqual = (s1.equals(s2));
 
  //       System.out.println("s1 == s2: " + refEqual);
  //       System.out.println("s1.equals(s2): " + secEqual);
	     Scanner input = new Scanner(System.in);
       System.out.print("Enter a String ");
       String s1 = input.nextLine();
       System.out.print("Enter an integer :  ");
       int num1 = input.nextInt();
       System.out.println(num1+ " "+ s1);



  }
}