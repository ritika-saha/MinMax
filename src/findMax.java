import java.util.jar.*;
import java.util.Arrays;
import java.util.Collections;

public class findMax<T extends Comparable<T>>  {
    private T[] vals;
    public findMax(T... v){
        this.vals=v;
    }
    public static <T extends Comparable<T>> T largest(T[] vals) {
        Arrays.sort(vals);
        return vals[vals.length-1];
    }

    public static <T> void printMax(T result) {
        System.out.println("Max element in the array is : "+ result);
    }

    public void testMax(){
       T result= largest(vals);
       printMax(result);
    }
}
