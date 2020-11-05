package patterns;

/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
*/

public class num_pat1 {
    public static void main(String[] args) {

        for(int cctr=1; cctr<=7 ;cctr++ ){
            for(int rctr=1; rctr<=cctr ; rctr++){
                System.out.print(rctr);
            }
            System.out.println();
        }
    }
    
}
