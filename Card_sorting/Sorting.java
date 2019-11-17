// @author Surya

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.lang.*;
import java.io.*;
//Using Merge sort we get best and worst case as O(nlogn)
class Sorting
{

    int cardCount=0;
    Cards[] myCards= new Cards[52];
    public void addACard(Cards card)
    {
        myCards[cardCount]=card;
        cardCount++;
    }
    void merge(int arr[], int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
    // Main function that sorts arr[l..r] using 
    // merge() 
    void sort(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second halves 
            sort(arr, l, m); 
            sort(arr , m+1, r); 
  
            // Merge the sorted halves 
            merge(arr, l, m, r); 
        } 
    } 
  
    /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    // Driver method 
     
    public static void main(String args[])
    {
        String arr_name[]=new String[9];
        int arr[]=new int[9];
        Sorting sort_obj=new Sorting();
        Cards cards1=new Cards("Diamonds","King",1,13);
        Cards cards2=new Cards("Diamonds","Queen",1,12);
        Cards cards3=new Cards("Diamonds","Jack",1,11);
        Cards cards4=new Cards("Diamonds","Ten",1,10);
        Cards cards5=new Cards("Diamonds","nine",1,9);
        Cards cards6=new Cards("Diamonds","eight",1,8);
        Cards cards7=new Cards("Spades","King",4,13);
        Cards cards8=new Cards("Spades","Queen",4,12);
        Cards cards9=new Cards("Spades","Jack",4,11);


        sort_obj.addACard(cards1);
        sort_obj.addACard(cards2);
        sort_obj.addACard(cards3);
        sort_obj.addACard(cards4);
        sort_obj.addACard(cards5);
        sort_obj.addACard(cards6);
        sort_obj.addACard(cards7);
        sort_obj.addACard(cards8);
        sort_obj.addACard(cards9);
        // Cards cards7=new Cards("Diamonds","seven",1,7);
        // Cards cards8=new Cards("Diamonds","six",1,6);
        // Cards cards9=new Cards("Diamonds","five",1,5);
        
        // cards1.final_name(cards1.Suite_name,cards1.card_value);
        // cards1.final_value(cards1.Card_value,cards1.Suite);
        for(int i=0;i<9;i++)
        {
            arr[i]=sort_obj.myCards[i].final_value;
            arr_name[i]=sort_obj.myCards[i].final_name;
        }
         
         
        System.out.println("Given Array"); 
        printArray(arr); 
        for (int i=0; i<9; ++i) 
            System.out.print(arr_name[i] + " "); 
        System.out.println(); 
        
  
        
        sort_obj.sort(arr, 0, arr.length-1); 
  
        System.out.println("\nSorted array"); 
        printArray(arr);
        
    }
}
    