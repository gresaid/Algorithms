import java.util.Arrays;
import static java.lang.System.*;

public class Hello_world{

    public static void main(String[]args){
        int[] myList = {0,1,2,3,4,5,6,7,8,9};
        long time = nanoTime();
        int number = 9;
        out.println("Data massive = " + Arrays.toString(myList));
        out.println("Source element = "+ number);
        out.println("Binary Search (pos) = " + binary_search.binarySearch(myList, 9) + " count step = " + bin_log.binlog(myList.length));
        time = nanoTime() - time;
        out.println( "Time = " + time / 1000000L / 1000.0 + "s ");
        out.println(string_to_digit.letterToDigit("J a v a"));
    }
}