package week3arraysassignment;

import java.util.Arrays;

public class MissingElementInArray {
	
	public static void main(String[] args) {
		 
		int[] arr = {1,2,3,4,7,6,8};
		
		int len=arr.length;
		int count=1;

		Arrays.sort(arr);
		
		System.out.println("Modified arr[] : "
                + Arrays.toString(arr));
		

        
		
		//int diff = arr[0] - 0;
		
		for(int i=0;i<len;i++) {//1;1<7;2//
			
	
			
			if(arr[i]!=count)
			{
				System.out.println(count);
			}
			count=arr[i]+1;
				
				}
			
		}
	}