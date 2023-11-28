import java.util.*;

public class minmaxmain {
    public static <T extends Comparable<T>> void largest(T a, T b, T c) {
        if (a.compareTo(b) >= 0 && a.compareTo(c) >= 0) {
            System.out.println(a + " is the largest");
        } else if (b.compareTo(a) >= 0 && b.compareTo(c) >= 0) {
            System.out.println(b + " is the largest");
        } else {
            System.out.println(c + " is the largest");
        }
    }
    
    public static void main(String[] args){
        System.out.println("welcome to test maximun");
        System.out.println("enter 3 integers");
        Scanner sc=new Scanner(System.in);
        
        Integer a=sc.nextInt();
        Integer b=sc.nextInt();
        Integer c=sc.nextInt();

        largest(a,b,c);

        System.out.println("enter 3 float numbers");
       
        Float a1=sc.nextFloat();
        Float b1=sc.nextFloat();
        Float c1=sc.nextFloat();

        largest(a1,b1,c1);

        System.out.println("enter 3 strings");
        sc.nextLine();
        String a2=sc.nextLine();
        String b2=sc.nextLine();
        String c2=sc.nextLine();

        largest(a2,b2,c2);


        sc.close();
    }
}
