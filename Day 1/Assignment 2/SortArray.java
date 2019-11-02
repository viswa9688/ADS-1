//The time complexity is Order(nlogn).

import java.util.Arrays;

class SortArray
{
    Integer[] array1=new Integer[]{2,3,5,7,9,10};
    int count=1;
    int current;
    Integer[] array2=new Integer[]{2,3,5,6,9,12};
    
    Integer[] sorted_array=new Integer[20]; 
    
    public void MirrorNumber1()
    {
      
       Arrays.sort(array1);
       for(int i=0;i<array1.length-1;i++)
       {
        if(array1[i]==array2[i])
        {
            System.out.println(array1[i]);
            
        }      
       
    }
}
    public static void main(String[] args)
    {
        SortArray obj1=new SortArray();
        obj1.MirrorNumber1();
        //obj.display();
    }

}