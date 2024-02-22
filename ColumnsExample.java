/*A program to print the integer 1 to 100 in columns of 10 */
public class ColumnsExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    } 
}
