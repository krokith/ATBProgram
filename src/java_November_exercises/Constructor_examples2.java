package java_November_exercises;

import java.util.Scanner;

public class Constructor_examples {

    public Constructor_examples(String carName, String carModel, int carYear) {
        this.
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//temp1
        System.out.println("Enter the car name : ");
        String car_name = sc.nextLine();
        System.out.println("Enter the car model :");
        String car_model = sc.nextLine();
        System.out.println("Enter the car year :");
        int car_year = sc.nextInt();
//temp2
        Constructor_examples t1 = new Constructor_examples(car_name,car_model,car_year);
        System.out.println(t1.car_name);
        System.out.println(t1.car_model);
        System.out.println(t1.car_year);

        //temp3


    }
}
