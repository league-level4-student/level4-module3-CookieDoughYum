package _02_gotta_catchem_all;

public class ExceptionMethods {
	 Double divide(double one, double two) {
		 if(two==0.0) {
			 throw new IllegalArgumentException();
		 }
		return one/two;
	}
	 
	 String reverseString(String a) {
		 String reverse="";
		 for(int i=a.length()-1; i>0; i--) {
			 reverse+=a.charAt(i);
		 }
		 if(a.equals("")) {
			 throw new IllegalStateException();
		 }
		 return reverse;
	 }
}
