/**
 * @author Viswa
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
