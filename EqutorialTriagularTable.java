public class EqutorialTriagularTable {
    //triangular table with all sides are equal and the traingle should not be right angled
    public static void main(String [] args){
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                if(j <= 10 - i){
                    System.out.print(" ");
                }else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
