package week3arraysassignment;

public class FindIntersection {
	
	public static void main(String[] args) {
		int[] inter1= {3,2,11,4,6,7};
		int[] inter2= {1,2,8,4,9,7};
		
		System.out.println("Finding the intersection of the arrays");
		//Declare the loop iterator
		for(int i=0;i<inter1.length;i++) {
			
			//nested array 
			for(int j=0;j<inter2.length;j++) {
				
				//compare both the arrays
				if(inter1[i]==inter2[j]) {
					//print the first array
					System.out.println(inter2[i]);
					
				}
			}
		}
	}

}
