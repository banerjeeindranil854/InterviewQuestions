
public class CoinTosProblem {
public static void main(String[] args) {
	calculate();
}
public static void calculate() {
	int[] pattern= {1,3,5,8};
	int[][] inArray= new int[5][12];
	for(int j=0;j<12;j++) {
		inArray[0][j]=j;
	}
	for(int i=0;i<pattern.length;i++) {
		inArray[i+1][0]=pattern[i];
	}
	for(int i=1;i<pattern.length+1;i++) {
		for(int j=1;j<12;j++) {
			if(j>inArray[i][0]) {
				inArray[i][j]=Math.min(inArray[i-1][j], inArray[i][j-inArray[i][0]]+1);
			}else if(j==inArray[i][0]) {
				inArray[i][j]=1;
			}
			else {
				inArray[i][j]=inArray[i-1][j];
			}
		}
	}
	for(int i=0;i<pattern.length+1;i++) {
		for(int j=0;j<12;j++) {
			System.out.print(inArray[i][j]+"     ");
		}
		System.out.println();
	}
}
}
