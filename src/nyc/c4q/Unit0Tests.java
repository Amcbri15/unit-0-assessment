package nyc.c4q;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Unit0Tests {

    /*
     * Name of the method implies what the method should do.
     * Some of these methods require that the method return signature change.
     * For example, `returnPrimitiveBooleanTrue()` should return `boolean`, not `Object`.
     */
    public static void main (String args[]) {
      // Use main to test your methods
        printHelloWorld();
        System.out.println(returnStringUntilQ("ubiquitous"));
        bonusPrintOutSumOfFirstTenFibonacciNumbers();
        bonusPrintOutSumOfFirstFortyFibonacciNumbers();
    }

    public static void printHelloWorld() {
      System.out.println("Hello World");
    }

    public static boolean returnPrimitiveBooleanTrue() {
      return true;
    }

    public static int returnPrimitiveInt1729() {
      return 1729;
    }

    public static double returnPrimitiveDoubleThreePointOneFour() {
      return 3.14;
    }

    public static char returnPrimitiveCharZ() {
        return 'Z';
    }

    public static void printSumOf1Upto10UsingForLoop() {
        int count = 0;
        for (int i = 1; i < 10; i++){
            count+=i;
        }
        System.out.println(count);
    }

    public static void printSumOf1Upto10000UsingForLoop() {
        int count = 0;
        for (int i = 1; i < 10000; i++){
            count+=i;
        }
        System.out.println(count);
    }

    public static boolean isOdd(int n) {
      return !(n%2==0);
    }

    public static boolean isMultipleOfThree(int n) {
      return n%3==0;
    }

    public static boolean isOddAndIsMultipleOfThree(int n) {
      return (!(n%2==0) && n%3==0);
    }

    public static String repeatStringXTimes(String input, int times) {

        String base = "";

        for (int i = 1; i <= times; i++){
            base+=input;
        }
        // Given string "input" and a positive integer "times",
        // return a string that is equal to the input string repeated X times.
        // If "times" is 0 negative, return a blank string.
        // For example, repeatStringXTimes("potato", 5) should return "potatopotatopotatopotatopotato".
        return base;
    }

    public static String returnStringUntilQ(String input) {
        // Given string "input", return a string that stops at the first occurrence of the character 'q'.
        // For example, given the string "ubiquitous", return "ubi".
        // If the string does not contain a q, then return the empty string "".

        String base = "";
        for (int i = 0; i <= input.length()-1; i++){
            if (input.charAt(i) == 'q')
                break;
            base+=input.charAt(i);
        }
        if (input.equals(base))
            base = "";

        return base;
    }

    public static Person declareAndReturnPersonNamedAda() {
        Person Ada = new Person();

        Ada.setName("Ada");
      return Ada;
    }

    public static Person declareAndReturnPersonNamedAlanTuringFromLondon() {
        Person Alan = new Person();

        Alan.setName("Alan Turing");
        Alan.setCity("London");
      return Alan;
    }

    public static boolean isFromLondon(Person person) {
        return person.getCity().equals("London");
    }

    public static ArrayList<Place> declareAndReturnArrayListOfThreePlaces() {
        ArrayList<Place> Places = new ArrayList<Place>();
        Place NewYork = new Place("New York");
        Place Trenton = new Place("Trenton");
        Place Connecticut = new Place("Connecticut");

        Places.add(NewYork);
        Places.add(Trenton);
        Places.add(Connecticut);

        return Places;
    }

    public static HashMap<String, Person> declareAndReturnHashmapOfAlanTuringAndGraceHopper() {
      // The HashMap should have key-value pairs of:
      // - key: `Alan Turing`, value: instance of Person with name `Alan Turing`
      // - key: `Grace Hopper`, value: instance of Person with name `Grace Hopper`
        HashMap<String, Person> people = new HashMap<String, Person>();

        Person GraceHopper = new Person();
        GraceHopper.setName("Grace Hopper");
        GraceHopper.setCity("Arlington");

        people.put(declareAndReturnPersonNamedAlanTuringFromLondon().getName(), declareAndReturnPersonNamedAlanTuringFromLondon());
        people.put(GraceHopper.getName(), GraceHopper);

      return people;
    }

    public static void changeTuringsCityToPrinceton(HashMap<String, Person> people) {
        people.get("Alan Turing").setCity("Princeton");
    }

    // Bonus Problems
    public static void bonusPrintOutSumOfFirstTenFibonacciNumbers() {
        int fibonacci;
        int fib1 = 1;
        int fib2 = 1;
        int sum = 3;

        for (int i = 4; i <= 10; i++) {
            fibonacci = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibonacci;

            sum+= fibonacci;
        }

        System.out.println(sum);

    }

    public static void bonusPrintOutSumOfFirstFortyFibonacciNumbers() {
        int fibonacci;
        int fib1 = 1;
        int fib2 = 1;
        int sum = 3;

        for (int i = 4; i <= 40; i++) {
            fibonacci = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibonacci;

            sum+= fibonacci;
        }

        System.out.println(sum);

    }
}
