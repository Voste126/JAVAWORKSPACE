public class Question3 {
    //Write a program using /= operator and the do while loop and if selection structure to output the
//6. number of times is 200 divisible by 2
    public static void main(String [] args){
        int i = 200;
        int count = 0;
        do{
            if(i % 2 == 0){
                count++;
            }
            i /= 2;
        }while(i > 0);
        System.out.println("The number of times 200 is divisible by 2 is: " + count);
    }
}
