
public class Test1 {

	 public static void main(String[] args) {
		 
		 String str = "Javatpointqqqqtwwwtsssstime";  
	        System.out.println("Returning words:");  
	        String[] arr = str.split("t", 0);  
	        for (String w : arr) {  
	            System.out.println(w);  
	        }  
	        System.out.println("Split array length: "+arr.length);  
		 
	 }
	 
	
}
