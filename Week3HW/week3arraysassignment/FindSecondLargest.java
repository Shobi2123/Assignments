package week3arraysassignment;

import java.util.Arrays;

public class FindSecondLargest {
	
	public static void main(String[] args) {
		
		int[] data= {3,2,11,4,6,7};
		//declaring the length
		int len=data.length;
         
		//sort the numbers in ascending order
		Arrays.sort(data);
		
		System.out.println("The sorted array from smallest to largest" +Arrays.toString(data));
		
		int n= len-2;
		System.out.println("The second largest number is " +data[n]);		
	
	} 
	
	}
