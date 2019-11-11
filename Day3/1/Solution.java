class Solution{
	
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



	public int[] sortInsertion(int[] arr){
		// fill you code Here
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key  = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j = j - 1;
			}
			arr[j+1] = key;
		// return null;
		}
		return arr;
	}
	public int[] sortSelection(int[] arr){
		// fill you code Here
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			int temp = i;
			for (int j = i + 1; j < n; j++) {
				if(arr[j] < arr[temp]) {
					temp = j;
				}
			}
			int temp2 = arr[temp];
			arr[temp] = arr[i];
			arr[i] = temp2;
		}
		// return null;
		return arr
			
}
