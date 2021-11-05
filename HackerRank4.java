class HackerRank4{
	
	public void max(int rows,int arr[][]){
		int i = 0;
        int max = 0;
        int[] result = new int[rows];
        while (i < rows) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            result[i] = max;
            max =0;
            i++;
 
        }
		display(result);
	}
	
	public void display(int arr[]){
		for(int x:arr){
			System.out.print(x+" ");
		}
	}
	
	public static void main(String args[]){
		HackerRank4 obj = new HackerRank4();
		int arr[][]={{1,2,3},{1,4,9},{76,34,21}};
		obj.max(3,arr);
	}
}