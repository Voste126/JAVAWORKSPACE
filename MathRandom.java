public class MathRandom {
    //Implement nos 10 1nd 11 in revision exercise 1 using randomly generated values
    //Consider 10 rectangular prisms as described in no 10 in revision exercise 1. Write a program
    //that will generate, the total surface area, volume and the capacity of the prism for each prism
    //using randomly generated values and out put them in a tabular form as shown below.
    public static void main(String [] args){
        System.out.println("Length\tWidth\tHeight\tTotal Surface Area\tVolume\tCapacity");
        for(int i = 0; i < 10; i++){
            int length = (int)(Math.random() * 10 + 1);
            int width = (int)(Math.random() * 10 + 1);
            int height = (int)(Math.random() * 10 + 1);
            int totalSurfaceArea = 2 * (length * width + length * height + width * height);
            int volume = length * width * height;
            int capacity = (int)(0.75 * volume);
            System.out.println(length + "\t" + width + "\t" + height + "\t" + totalSurfaceArea + "\t" + volume + "\t" + capacity);
        }
    }
}
