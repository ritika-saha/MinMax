import java.util.*;

public class minmaxmain {
    public static void main(String[] args){
        System.out.println("welcome to test maximun");
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        sc.nextLine();

        Integer[] intArr=new Integer[n];
        System.out.println("enter "+n+" integers");
        for(int i=0;i<n;i++){
            Integer a=sc.nextInt();
            intArr[i]=a;
            sc.nextLine();
        }

        findMax<Integer> intCmp=new findMax<>(intArr);
        intCmp.testMax();

        System.out.println("enter "+n+" float numbers");
        Float[] floatArr=new Float[n];
       
          for(int i=0;i<n;i++){
            Float a1=sc.nextFloat();
            floatArr[i]=a1;
            sc.nextLine();
        }

         findMax<Float> floatCmp=new findMax<>(floatArr);
         floatCmp.testMax();

      System.out.println("enter "+n+" strings");
        String[] strArr=new String[n];
       
          for(int i=0;i<n;i++){
            String a2=sc.nextLine();
            strArr[i]=a2;
        }

         findMax<String> strCmp=new findMax<>(strArr);
         strCmp.testMax();


        sc.close();
    }
}
