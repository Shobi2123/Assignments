package week3stringassignment;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		
		int count = 0;
		
		//Split the String into array
		String array[] = text.split(" ");
		String val="";
		   System.out.println("String : " + text);
		   System.out.println("String array : [ " +text+ "]");
		   System.out.println("Displaying the String without duplicate words : ");
		   
			
		   //Iterate the splited array string
		   for(int i=0;i<array.length;i++) {
			   
			   //Initialize another loop to check 
			   //whether the word is there in the array
			   for(int j=i+1;j<array.length;j++) {
				   
				   //check whether the word is repeated in the array
				   if(array[i].equals(array[j]))
				   {
					   //increase by count 1 if it is available
					 //  count=count+1;
					   
					   //if the count > 1 then replace the word as "" 
					   //if(count>1) {
						   val=text.replaceAll(array[i], "");
						   break;
						   
					   }
				   }
			   }
			  
			   System.out.println(val);
		   }
	}
