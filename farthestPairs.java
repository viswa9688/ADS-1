import java.util.Scanner;
/* @author name is Surya */
// Complexity is o(n).

class farthestPairs
{
    // input array size.
    //Input array elements.
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of the array");
        int length=sc.nextInt();

        
        double arr[]=new double[length];
        System.out.println("Enter array elements");
        for(int i=0;i<length;i++)
        {
            double array_elements=sc.nextDouble();
            arr[i]=array_elements;


        }
        // initializng the high variable to the first array element
        // intializing the low variable also to the second array element.
        double high=arr[0];
        double low=arr[0];
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>high)
            {
                high=arr[i];
            }
            if(arr[i]<low)
            {
                low=arr[i];
            }
            
            

        }
        System.out.println("Lowest pair is "+low+" "+"the highest pair is"+" "+high);
        


        

    }
    

}
