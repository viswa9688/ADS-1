
import java.util.*;
class Solution{
    public static void main(String[] args)
    {
        MinPQ<Integer> pq = new MinPQ<Integer>();
        pq.insert(7);
        // for (int  s : pq) {
        //     System.out.println(s);
        // }
        pq.insert(8);
        pq.insert(4);
        pq.insert(2);
        pq.insert(9);
        for (int  s : pq) {
            System.out.println(s);
        }
        Scanner sc = new Scanner(System.in); 
  
        int key= sc.nextInt();
        for(int i=0;i<key;i++)
        {
            pq.delMin();
        }


    }
    
    
}