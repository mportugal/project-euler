import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by mportugal on 5/15/14.
 */
public class Problem1 {

    /*
        If we list all the natural numbers below 10 that are multiples of 3 or 5,
        we get 3, 5, 6 and 9. The sum of these multiples is 23.

        Find the sum of all the multiples of 3 or 5 below 1000.
     */

    public static void main(String args[]){

        //TODO: Find all the multiples of 3 or 5 below 1000

        // Functional solution - faster by 23 ms
        System.out.println(addMultiples(1, 0));

        /*
        //Imperative solution

        int num = 0;

        for(int i = 1; i < 1000; i++){
            if(i % 3 == 0 || i % 5 == 0){
                System.out.println(i + " is a multiple of 3 or 5.");
                num += i;
            }
        }
        System.out.printf("The sum of all the multiples of 3 or 5 below 1000 is %d", num);

        */


    }

    public static int addMultiples(int num, int base) {

        if (num >= 1000) {
            return base;
        } else if (num % 3 == 0 || num % 5 == 0) {
            base += num;
        }

        return addMultiples(++num, base);
    }


}

