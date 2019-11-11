// The time complexity is n^2.
/*

    Integer[] array1=new Integer[]{-30,20,10,20,30,-50,80,-20,-10};
    int current;    
    public void threeS()
    {
        Arrays.sort(array1);
        int j;
        int k;
        for(int i=0;i<array1.length;i++)
        {
            
            //System.out.println(i);
            for(j=0;j<array1.length-1;j++)
            {
                //System.out.println(j);
                
                k=j+1;
                //System.out.println(k);
                //System.out.println(array1[i]+" "+array1[j]+" "+array1[k]);
                
                if((array1[i]+(array1[j]+array1[k]))==0){
                    System.out.println(array1[i]+"i "+array1[j]+"j "+array1[k]);
                }



*/

import java.util.*;
class Solution{
	public static String Josephus(int a, int b){
		// fill you code Here
		String s = "";
		int x;
		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i = 0; i < a; i++) {
			queue.add(i);
		}
		System.out.println(queue);
		while (queue.size() > 1) {
			for (int j = 0; j < b - 1; j++) {
				x = queue.remove();
				queue.add(x);
			}
			s = s + queue.remove() + " ";
		}
		s = s + queue.remove();
		return s;
	}
}
