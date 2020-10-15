package wipro.findString;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter string");
    	String r=sc.nextLine().toUpperCase();
    	
    	String s[]=r.split(" ");
    	String result="";
    	int sum=0;
    	for(int i=0;i<s.length;i++) {
    		sum=0;
//    		System.out.println(s[i]);
    		if(s[i].length()%2==0) {
    		for(int j=0;j<s[i].length()/2;j++) {
    			sum+=Math.abs(s[i].charAt(j)-s[i].charAt(s[i].length()-1-j));
    		}
    		}
    		else {
    			for(int j=0;j<s[i].length()/2;j++) {
        			sum+=Math.abs(s[i].charAt(j)-s[i].charAt(s[i].length()-1-j));
        		}
    			
    			sum+=s[i].charAt(s[i].length()/2)-64;
    		}
    		
//    		System.out.println(sum);
    		result+=String.valueOf(sum);
    	}
    	System.out.println(result);
    }
}
