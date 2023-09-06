package week3stringassignment;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Palindrome {
	
	public static void main(String[] args) {
		 String name = "madam";
		 
		 String rev = "" ;
		 
		 for(int i = name.length()-1; i>=0; i--){
		      rev = rev + name.charAt(i);
		 }
		    
		 if(name.equals(rev)) {
			 System.out.println(name+ " is a Palindrome");
		 }
		 else {
		 System.out.println(name+ "is not a Palindrome");
		 }
		    
		    System.out.print("The reversed string of the '"+name+"' is: " );
		    System.out.println(rev);
	}

}

