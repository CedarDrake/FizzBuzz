
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
            double ii = i;
            double fizz = ii/3;
            double buzz = ii/5;
            double fizzbuzz = ii/15;
            if (Math.ceil(fizz) == Math.floor(fizz)) {
                System.out.print("Fizz");
            }
            if (Math.ceil(buzz) == Math.floor(buzz)) {
                System.out.print("Buzz");
            }
            if (Math.ceil(fizz) != Math.floor(fizz) && Math.ceil(buzz) != Math.floor(buzz)) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
