package Day19;

public class exceptionClss {
 public static void main(String[] args) {
	 
	 int arr[]=new int[4];
	 arr[0]=10;
	 arr[1]=10;
	 arr[2]=10; 
	 arr[3]=10; 
	 try { 
		 for(int i=0;i<=5 ;i++) {
			 System.out.println(arr[i]);
		 }
	 arr[4]=10;
	 }catch (Exception w){
		 System.out.println(w);
	 }
}

}
