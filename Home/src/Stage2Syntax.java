public class Stage2Syntax {
    public static void main(String [] args){
        //java operators
        int x = 100 + 50;
        System.out.println(x);
        int sum1 = 100 + 50;        // 150 (100 + 50)
        int sum2 = sum1 + 250;      // 400 (150 + 250)
        int sum3 = sum2 + sum2;     // 800 (400 + 400)
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

        //java assignment operators
        int y = 10;
        y += 5;
        System.out.println(y);

        //java Strings

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());
        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt2.toLowerCase());   // Outputs "hello world"

        //special stirngs
        String txt3 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt3);
        String txt4 = "It\'s alright.";
        System.out.println(txt4);
        String txt5 = "The character \\ is called backslash.";
        System.out.println(txt5);
    }
}
