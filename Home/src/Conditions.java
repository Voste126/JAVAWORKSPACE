public class Conditions {
    public static void main(String [] args){
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        //short outputs 
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        //switch
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2: 
                System.out.println("Tuesday");
                break;
            case 3: 
                System.out.println("Wednesday");
                break;
            case 4: 
                System.out.println("Thursday");
                break;
            case 5: 
                System.out.println("Friday");
                break;
            case 6: 
                System.out.println("Saturday");
                break;
            case 7: 
                System.out.println("Sunday");
                break;
        }

        //for loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        //while loop
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) {
            System.out.println(car);
        }

        //Java  Break
        for (int j = 0; j < 10; j++) {
            if (j == 4) {
                break;
            }
            System.out.println(j);
        }

        //Java Continue
        for (int k = 0; k < 10; k++) {
            if (k == 4) {
                continue;
            }
            System.out.println(k);
        }

        //Arrays
        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars2[0]);
        cars2[0] = "Opel";
        System.out.println(cars2[0]);

        int [] [] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[0][1]);
    }
}
