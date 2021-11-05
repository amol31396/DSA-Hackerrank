class HackerRank2{
	int temp,j=0;
	/*
	public void sort(int arr[]){
		for(int i =0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				while(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int x:arr){
			System.out.print(x+" ");
		}
	}
	*/
	
	/*
	public void sort(int arr[]){
		for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
		}
		display(arr);
	}
	*/
	
	public void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>0){
                    if(i!=j){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    }
                }
                }
            }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
	
	public void display(int arr[]){
		for(int x:arr){
			System.out.print(x+" ");
		}
	}
	
	public static void main(String args[]){
		HackerRank2 obj = new HackerRank2();
		int arr[]={-12,11,-13,-5,6,-7,5,-3,-6};
		obj.sort(arr);
	}
}