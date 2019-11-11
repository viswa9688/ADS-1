/**
 * @author Viswa
 
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
class Solution {
	public Team[] sort(Team[] teams) {
		// your code goes here
		int n = teams.length;
		for (int i = 0; i < n; i++) {
			// int temp = i;
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (teams[j].compareTo(teams[min]) < 0) {
					min = j;
				}
			}
			Team teamName = teams[i];
			teams[i] = teams[min];
			teams[min] = teamName;
		}
		// return null;
		// return arr;
		return teams;
	}
}
class Team implements Comparable<Team> {
	private String teamName;
	private int noOfWins;
	private int noOfLosses;
	private int noOfDraws;
	Team(String name, int wins, int losses, int draws){
		teamName = name;
		noOfDraws = draws;
		noOfWins = wins;
		noOfLosses = losses;
	}
	public int compareTo(Team that) {
        int var = that.noOfWins - this.noOfWins;
        if (var == 0) {
            var = this.noOfLosses - that.noOfLosses;
            if (var == 0) {
                var = that.noOfDraws - this.noOfDraws;
            }
        }
        return var;
	}
	public String toString() {
		//retrun all the attributes as a string but appending with ", "
		String teamDetails = new String();
        return this.teamName + "," + this.noOfWins + "," + this.noOfLosses + "," + this.noOfDraws;
    }
}
