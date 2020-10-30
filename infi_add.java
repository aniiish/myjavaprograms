//This is a program to add unlimited numbers.
class infi_add {
		public static void main(String[] args) {
		 
		 System.out.println("This is a Program to add unlimited numbers")
		 Scanner input = new Scanner(System.in);
		 System.out.print(/* Enter the following commands: 
		                     Q  to  quit */);
		 
		}
	//creating a method 
		public static int un_add(int a, int b, int ...arr){
			//This method will take at least 2 inputs from the user.
			//It will then create an array of all the other inputs.
			int arrsum;
			int sum = a + b;
			for(int element:arr){ //for-each loop for getting the elements of the array
                arrsum += element;
            }
            int result = sum+arrsum;
            return result;
		}

		
	}
