
import java.util.Scanner;

/**
 *
 */
public class check_your_group
{
  public static void main(String args[])
  {
      Scanner input = new Scanner(System.in);
      int rno=0;
      System.out.println("Enter your Roll No. :-");
      rno = input.nextInt();
      if (rno == 1 || rno == 5 || rno == 9 || rno == 13 || rno == 17 || rno == 21 || rno == 25 || rno == 29 || rno == 33 || rno == 37 || rno == 41 || rno == 45 || rno == 49 || rno == 53 || rno == 57 || rno == 61 || rno == 65 || rno == 69 || rno == 73)
      System.out.println("You belong to the first(1st) Group of projects.");
      else if (rno == 2 || rno == 6 || rno == 10 || rno == 14 || rno == 18 || rno == 22 || rno == 26 || rno == 30 || rno == 34 || rno == 38 || rno == 42 || rno == 46 || rno == 50 || rno == 54 || rno == 58 || rno == 62 || rno == 66 || rno == 70 || rno == 74)
      System.out.println("You belong to the second(2nd) Group of projects.");
      else if (rno == 3 || rno == 7 || rno == 11 || rno == 15 || rno == 19 || rno == 23 || rno == 27 || rno == 31 || rno == 35 || rno == 39 || rno == 43 || rno == 47 || rno == 51 || rno == 55 || rno == 59 || rno == 63 || rno == 67 || rno == 71 || rno == 75)
      System.out.println("You belong to the third(3rd) Group of projects.");
      else if (rno == 4 || rno == 8 || rno == 12 || rno == 16 || rno == 20 || rno == 24 || rno == 28 || rno == 32 || rno == 36 || rno == 40 || rno == 44 || rno == 48 || rno == 52 || rno == 56 || rno == 60 || rno == 64 || rno == 68 || rno == 72)
      System.out.println("You belong to the fourth(4th) Group of projects.");
      else
      System.out.println("Please enter valid roll number!!!");
      input.close();
  }
}