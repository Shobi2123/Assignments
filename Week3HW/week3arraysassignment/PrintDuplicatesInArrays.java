package week3arraysassignment;

public class PrintDuplicatesInArrays {
	
	public static void main(String[] args) {
		 
		int arr[] = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		int len = arr.length;
		System.out.println("The total length of this array is " +len);
		int i=0;
		int j=0;
		int count=0;
		for(i=0;i<len-1;i++) {
			
			for (j=i+1;j<len;j++) {
				
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			
		}
	}

}
}
