package week3stringassignment;

public class ChangeOddIndexToUpperCase {
	
	public static void main(String[] args) {
		
	

	String test = "changeme";
	
	String str = new String("changeme");
	//char[] ch = new char[str.length()];
	
	char[] ch= test.toCharArray();
	//System.out.println(ch[3]);
	
	for(int i=0; i<ch.length; i=i+2){
        ch[i] = Character.toUpperCase(ch[i]);
 
     System.out.println(ch[i]);
  }
}
}

