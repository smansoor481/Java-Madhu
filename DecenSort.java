import java.util.Arrays;
import java.util.Collections;

public class DecenSort {
    public static void main(String[] args) {
        Integer[] arr = {5,2,8,0,4,10,3,2};
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));



        int ar[] = {5,2,3,1,4};
        int temp=0;
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i] < ar[j])
                {
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }

    }
}
