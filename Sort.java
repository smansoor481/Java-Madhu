import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        // Using In-built methods
        int[] ar = {3,5,2,6};
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        


        // Using Normal Method
        int arr[] = {3,2,1,5,4};
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1; j<arr.length;j++)
            {
                
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
}
