public class Main {
    //blueprint of a car constructor
    String make;
    String model;
    int year;
    int a;
    int b;

    //blueprint of a person constructor
    String name;
    int age;

    public Main(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    //constuctor for the Person class
    public Main(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Main(int a, int b) {
        System.out.println(a + b);
        
    }
    public static void main(String[] args){
        //creating an object of the Car class
        Main myCar = new Main("Chevy", "Camaro", 2020);
        Main myCar2 = new Main("Ford", "Mustang", 2020);

        // instance of a person
        Main person1 = new Main("John", 25);
        Main person2 = new Main("Jane", 30);

        //calling the sum method
        Main sum = new Main(5, 5);

        System.out.println(sum.a + sum.b);
        


        
        //calling the Car constructor
        System.out.println(myCar.make + " " + myCar.model + " " + myCar.year);
        System.out.println(myCar2.make + " " + myCar2.model + " " + myCar2.year);

        //calling the Person constructor\
        System.out.println(person1.name + " " + person1.age);
        System.out.println(person2.name + " " + person2.age);
    }

}
