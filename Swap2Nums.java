public class Swap2Nums {
    public static void main(String[] args) {
         
        System.out.println("Before Swaping");
        int a =10;
        int b = 20;
        System.out.println(a);
        System.out.println(b);
        
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swapping");
        System.out.println(a);
        System.out.println(b);
    }
}
