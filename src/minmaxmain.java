import java.util.*;

public class minmaxmain {
    public static void main(String[] args){
        System.out.println("welcome to test maximun");

        System.out.println("enter 3 integers");
        Scanner sc=new Scanner(System.in);
        
        Integer a=sc.nextInt();
        Integer b=sc.nextInt();
        Integer c=sc.nextInt();

        findMax<Integer> intCmp=new findMax<>(a, b, c);
        intCmp.testMax();

        System.out.println("enter 3 float numbers");
       
        Float a1=sc.nextFloat();
        Float b1=sc.nextFloat();
        Float c1=sc.nextFloat();

         findMax<Float> floatCmp=new findMax<>(a1, b1, c1);
         floatCmp.testMax();

        System.out.println("enter 3 strings");
        sc.nextLine();
        String a2=sc.nextLine();
        String b2=sc.nextLine();
        String c2=sc.nextLine();

         findMax<String> strCmp=new findMax<>(a2, b2, c2);
         strCmp.testMax();


        sc.close();
    }
}
