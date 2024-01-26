public class Syntax {
    public static void main(String [] args){
        // type variablename = value;
        String name = "Steve";
        System.out.println(name);
        int myNumber = 15;
        System.out.println(myNumber);
        // if you don want any overwrite on a variableyou set fina;
        final int myNumber2 = 20;
        System.out.println(myNumber2);
        //character
        char myChar = 'A';
        System.out.println(myChar);
        //boolean
        boolean myBoolean = true;
        System.out.println(myBoolean);
        //byte
        byte myByte = 127;
        System.out.println(myByte);


        // Display of variables 
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // more variables 
        long Num2 =  15000000000L;
        System.out.println(Num2);

        float Num3 = 5.75f;
        System.out.println(Num3);

        double Num4 = 19.99d;
        System.out.println(Num4);

        //declaring varibles in one line ASCII
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        //type casting
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0
        
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // Manual casting: double to int
        System.out.println(myDouble2);   // Outputs 9.78
        System.out.println(myInt2);      // Outputs 9


    }
}
