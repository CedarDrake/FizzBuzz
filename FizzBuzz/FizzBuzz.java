
/**
 * Write a description of class FizzBuzz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FizzBuzz
{
    public static void  fizzbuzz() {
        for (int i = 1; i <= 100; i++) {
            double fizz = ;
            double buzz = ;
            double fizzbuzz = ;
            if (i / 3 == fizz) {
                System.out.println("Fizz");
            }
            if (i / 5 == buzz) {
                System.out.println("Buzz");
            }
            if (i / 15 == fizzbuzz) {
                System.out.println("FizzBuzz");
            }
            if (i / 3 != fizz && i / 5 != buzz && i / 15 != fizzbuzz) {
                System.out.println(i);
            }
        }
    }
}
