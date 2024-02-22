public class Sum {
    //write a java progam that takes the sum of 3 integers and prints the sum to the console
    int a;
    int b;
    int c;
    int total;

    public Sum(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.total = a + b + c;
    }

    public static void main(String[] args) {
        Sum sum = new Sum(5, 5, 5);
        System.out.println(sum.total);

    }
}
