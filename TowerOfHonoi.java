class TowerOfHonoi{
	static int count=0;
	static void tower(int n, char s, char inter, char d){
		count++;
		if(n==1){
			System.out.println("Disk 1 from "+s+" to "+d);
		}else{
			tower(n-1,s,d,inter);
			System.out.println("Disk "+n+" from "+s+" to "+d);
			tower(n-1,inter,s,d);
		}
	}
	
	public static void main(String... args){
		tower(5,'A','B','C');
		System.out.println(count);
	}
}