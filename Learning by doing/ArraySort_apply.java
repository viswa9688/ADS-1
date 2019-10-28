import java.util.Arrays;

class ArraySort_apply
{
    Integer[] array1=new Integer[]{1,1,1,1,2,2,2,3,2};
    int count=1;
    int current;
    
    Integer[] sorted_array=new Integer[20]; 
    
    public void MirrorNumber1()
    {
      
       Arrays.sort(array1);
       for(int i=0;i<array1.length-1;i++)
       {
           
        if (array1[i]==array1[i+1])
        {
            count=count+1;
            current=array1[i];
        }
        if (array1[i]!=array1[i+1])
        {
            System.out.println(current+" has"+count/2+" pairs");
            count=1;

        }
        
       
       
    }
}
    public static void main(String[] args)
    {
        ArraySort_apply obj1=new ArraySort_apply();
        obj1.MirrorNumber1();
        //obj.display();
    }

}