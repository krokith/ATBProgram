package java_November_exercises;

    // Dog Class
    public class Dog {
        //Attributes
        String name;
        String breed; // Renamed to follow naming conventions
        String color;
        int age;
        int size;

        // Behaviors
        void bark() {
            System.out.println("It barks");
        }

        void runs() {
            System.out.println("Dog runs fast");
        }

        void eats() {
            System.out.println("Dog eats chicken");
         }

        // Main method (Runner Class)
        public static void main(String[] args) {
            // Creating a Dog object
            Dog d1 = new Dog();

            // Accessing methods and attributes
            d1.bark();
            d1.runs();
            d1.eats();
            d1.name = "Rokith";
            d1.age =6;
            d1.size = 10;
            System.out.println("Dog's name: " + d1.name);
            System.out.println("Dog's age: " + d1.age);
            System.out.println("Dog's name: " + d1.size);

            Dog d2 = new Dog();
            d2.size=11;
            d2.age=5;
            d2.bark();
            d2.runs();
            //System.out.println("Dog's name: " + d1.name);
            System.out.println("Dog's age: " + d2.age);
            System.out.println("Dog's name: " + d2.size);

        }



    }


