/*
1234567
  234567
    34567
      4567
        567
          67
            7
          67
        567
      4567
    34567
  234567
1234567
*/
package patterns;

class num_pat3 {

    public static void main(String[] args) {
        int sctr=0,space=0,rctr,cctr;
        for(rctr=1; rctr<=7 ; rctr++){
          
          for(sctr=0; sctr<space ;sctr++){
            System.out.print(" ");
           }
            space+=2;
            for(cctr=rctr; cctr<=7 ; cctr++){
              System.out.print(cctr);
            }
            System.out.println();
        }

       space = 10;
       for(rctr=7; rctr>=1; rctr--){
         for(sctr=0; sctr<space ; sctr++){
           System.out.print(" ");
         }
         space-=2;
         for(cctr=rctr-1;cctr <= 7; cctr++) {
           if(cctr!=0)
           System.out.print(cctr);
         }
         System.out.println();
       }
    }
  }