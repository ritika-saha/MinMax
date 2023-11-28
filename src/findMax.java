import java.util.jar.*;
import java.util.Arrays;
import java.util.Collections;

public class findMax<T extends Comparable<T>>  {
    private T[] vals;
    public findMax(T... v){
        this.vals=v;
    }
    public static <T extends Comparable<T>> void largest(T[] vals) {
        Arrays.sort(vals);
        System.out.println("Max element in the array is : "+vals[vals.length-1]);
    }

    public void testMax(){
        largest(vals);
    }
}
