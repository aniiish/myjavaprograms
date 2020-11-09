class student{
    private String name;
    private int std, roll;
    private char sec;
    
    void setName(String na){
    name = na;
    
}

   public String getName(){
    return name;
   }

}

public class practisest{
    public static void main(String[] args) {
     
    student anish = new student();
     anish.setName("Anish");
     System.out.print(anish.getName());
        
    }
}
