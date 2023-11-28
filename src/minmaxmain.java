import java.util.*;

public class minmaxmain {
    public static void largest(String a, String b, String c) {
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
        System.out.println("enter 3 strings");
        Scanner sc=new Scanner(System.in);
        
        String a=sc.nextLine();
        String b=sc.nextLine();
        String c=sc.nextLine();

        largest(a,b,c);


        sc.close();
    }
}
