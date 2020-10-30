import java.util.Scanner;
class factorial{
	static int fact_real(int x){

           if(x==0 || x ==1){
          	return 1;
          }
          else {
          	return x * fact_real(x-1);
          	}

          }
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the no :-  ");
		int n = input.nextInt();
		System.out.print("Factorial of "+n+" is :- "+fact_real(n));
			
		}
	}