public class Operator2 {
    //Write a program using the -= operator and the do while loop to generate the sum of 1 to 100
    public static void main(String [] args){
        int sum = 0;
        int i = 1;
        do{
            sum -= i;
            i++;
        }while(i <= 100);
        System.out.println("The sum of 1 to 100 is: " + sum);
    }
}
