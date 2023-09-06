package week3stringassignment;

public class ReverseEvenWords {
   public static void main(String[] args) {
	
	   String test = "I am a software tester";
	   String array[] = test.split(" ");
	   String val="";
	   System.out.println("String : " + test);
	   System.out.println("String array : [ " +test+ "]");
	   
	   for(int i=0;i<array.length;i++) {
		   if(i%2!=0) 
			   val=val+new StringBuilder(array[i]).reverse()+"";
		   else
			   val=val+array[i]+"";
		   }
			  System.out.println("The reversed String: " +val); 
			  
	   }
}
   
