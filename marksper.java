import java.util.Scanner;
public class marksper {
    public static void main(String[] args) {
        System.out.println("Welcome to the Marks percentage Calculator ");
        int totalmarks,full, got, div ;
        float per;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Total marks in each subject :- ");
        totalmarks = input.nextInt();
        int m1, m2, m3, m4, m5;
        System.out.println("Enter the marks in First subject :- ");
        m1 = input.nextInt();
        System.out.println("Enter the marks in Second subject :- ");
        m2 = input.nextInt();
        System.out.println("Enter the marks in Third  subject :- ");
        m3 = input.nextInt();
        System.out.println("Enter the marks in Fourth subject :- ");
        m4 = input.nextInt();
        System.out.println("Enter the marks in Fifth  subject :- ");
        m5 = input.nextInt();
        input.close();
        full = totalmarks*4;
        got = m1+m2+m3+m4+m5;
        div = got/full;
        per = (div)*(100);
        System.out.println("Total marks = "+full);
        System.out.println("Avergae     = "+per);

    }
    
}
