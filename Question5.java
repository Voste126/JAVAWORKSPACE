public class Question5 {
    //Write a program using %= operator and the do while loop and if selection structure to output all
    //the odd numbers and their sum between 0 and 100
    public static void main(String [] args){
        int i = 0;
        int sum = 0;
        do{
            if(i % 2 != 0){
                System.out.println(i);
                sum += i;
            }
            i++;
        }while(i <= 100);
        System.out.println("The sum of all odd numbers between 0 and 100 is: " + sum);
    }
}
