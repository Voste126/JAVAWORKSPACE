public class Methods {
    //Java Methods
    //A method is a block of code which only runs when it is called.
    //You can pass data, known as parameters, into a method.
    //Methods are used to perform certain actions, and they are also known as functions.
    //Why use methods? To reuse code: define the code once, and use it many times.
    //You can also use the same code many times with different arguments, to produce different results.
    //Create a Method
    //A method must be declared within a class. It is defined with the name of the method, followed by parentheses (). Java provides some pre-defined methods, such as System.out.println(), but you can also create your own methods to perform certain actions:
    static void myMethod() {
        System.out.println("I just got executed!");
    }
    //Call a Method
    //To call a method in Java, write the method's name followed by two parentheses () and a semicolon;
    //Example
    //Inside main, call the myMethod() method:
    public static void main(String[] args){
        myMethod();
    }
}
