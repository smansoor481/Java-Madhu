/**
 * Largest3Nums
 */
public class Largest3Nums {

    public static void main(String[] args) {
        int max;
        int a =10;
        int b=40;
        int c=30;

        max = a;
        if(b>max)
        {
            max = b;
            System.out.println(max);
        }
        if(c>max)
        {
            max =c;
            System.out.println(max);
        }
    }
}