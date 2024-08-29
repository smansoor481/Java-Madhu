public class StringPalindrome {
    public static void main(String[] args) {

        String str = "sir";
        System.out.println("Before reverse the string: "+ str);
        String res = "";
        int sum=0;
        int s = str.length();
    
        for(int i=s-1;i>=0;i--)
        {
            res = res + str.charAt(i);
        }
        /*
        if(str.equals(res))
        System.out.println("Palindrome");
        else
        System.out.println("Not Palindrome");
         */

         System.out.println("After reverse the string: "+res);

        
    }
}
