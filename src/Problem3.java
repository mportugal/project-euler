/**
 * Created by mportugal on 5/15/14.
 */
public class Problem3 {


    /*
        The prime factors of 13195 are 5, 7, 13 and 29.
        What is the largest prime factor of the number 600851475143 ?
     */

    public static final long NUMBER_TO_CHECK = 600851475143L;
    public static final int SMALLEST_PRIME = 2;

    public static void main(String args[]){
        System.out.println("Largest prime factor: " + lpf(NUMBER_TO_CHECK, SMALLEST_PRIME));
    }

    /**
     * Returns the largest prime factor of a number.
     * @return
     */
    public static int lpf(long num, int base){

        //Prime factors are numbers that can be divisible by itself and 1.
        if (num == base)
            return base;

        if (num > 1 && num % base == 0)
            num /= base;

        return lpf(num, ++base);
    }


}
