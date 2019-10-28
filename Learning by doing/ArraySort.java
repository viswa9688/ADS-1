class ArraySort
{
    Integer[] array1=new Integer[]{1,2,3,7,9};
    Integer[] array2=new Integer[]{10};
    
    
    public String MirrorNumber()
    {
        for(int i=0;i<array1.length;i++)
        {
            for(int j=0;j<array2.length;j++)
            {
                if (array1[i]==array2[j])
                {
                    return "True";


                }
            }

        }
        return "False"; 
    }
    public void display()
    {
        String found;
        found=MirrorNumber();
        System.out.println(found);
        
    }
    public static void main(String[] args)
    {
        ArraySort obj=new ArraySort();
        obj.MirrorNumber();
        obj.display();
    }

}