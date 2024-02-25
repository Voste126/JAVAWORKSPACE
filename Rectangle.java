// Define a class named Rectangle
public class Rectangle {
    // Declare private instance variables for length and width
    private int length;
    private int width;

    // Define a constructor to initialize the length and width of the rectangle
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Define a method to calculate the perimeter of the rectangle
    public int perimeter() {
        return 2 * (length + width);
    }

    // Define getter methods to retrieve the length and width of the rectangle
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    // Define setter methods to set the length and width of the rectangle
    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // Define a main method to demonstrate the functionality of the Rectangle class
    public static void main(String[] args) {
        // Create a new Rectangle object with length 5 and width 5
        Rectangle rect = new Rectangle(5, 5);
        
        // Print the perimeter of the rectangle
        System.out.println(rect.perimeter());
        
        // Print the length and width of the rectangle
        System.out.println(rect.getLength());
        System.out.println(rect.getWidth());
        
        // Set the length and width of the rectangle to 10
        rect.setLength(10);
        rect.setWidth(10);
        
        // Print the updated length and width of the rectangle
        System.out.println(rect.getLength());
        System.out.println(rect.getWidth());
    }
}