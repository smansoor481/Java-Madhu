public class SumOfDigits {
    public static void main(String[] args) {
        String num = "12345";
        int sum =0;
         for(int i=1;i<=num.length();i++)
         {
            sum = sum+i;
         }
        System.out.println(sum);

    }
}
