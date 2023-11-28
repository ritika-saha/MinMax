public class findMax<T extends Comparable<T>>  {
    private T ob1,ob2,ob3;
    public findMax(T a,T b,T c){
        this.ob1=a;
        this.ob2=b;
        this.ob3=c;
    }
    public static <T extends Comparable<T>> void largest(T a, T b, T c) {
        if (a.compareTo(b) >= 0 && a.compareTo(c) >= 0) {
            System.out.println(a + " is the largest");
        } else if (b.compareTo(a) >= 0 && b.compareTo(c) >= 0) {
            System.out.println(b + " is the largest");
        } else {
            System.out.println(c + " is the largest");
        }
    }

    public void testMax(){
        largest(ob1,ob2,ob3);
    }
}
