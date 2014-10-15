import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;

public class HelloWorld {

	
	public static void main(String[] args) {
	String s1 = new String("Get input");
	s1=getInput(s1);
	String s2 =getInput("Enter a value");
	Double d3 = addTwoNum(s1, s2);
	System.out.println(d3);
    double d4=addmultiple(1,4,1);
    System.out.println("the multiple add\n yoyo"+d4);
	
	}


	private static Double addTwoNum(String s1, String s2) {
		Double d1= Double.parseDouble(s1);
		Double d2= Double.parseDouble(s2);
		Double d3 =d1+d2;
		return d3;
	}
		

	
	 private static double addmultiple(double ... values)
	   {
		   double result=0d;
		   for (double d : values) {
			   result+=d;
		}
		 
		   
		   return result;
		   
	   }
	
	
private static String getInput(String prompt) {
	
	BufferedReader get =new BufferedReader
			(new InputStreamReader(System.in));
	   System.out.print(prompt);
	   System.out.flush();
	   try {
		return get.readLine();
	} catch (Exception e) {
		return "error"+e.getMessage();
	}
	   
	  
	   
	}






}


 