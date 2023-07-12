package ani;
import java.util.*;
public class local3 {
	 public static void main(String []args) {
		 Scanner sc = new Scanner (System.in);
		 System.out.println("please enter array size");
	    int size = sc.nextInt();
	    System.out.println("please enter array elements");
	    int [] arr =new int [size];
	    for (int i=0; i<size; i++) {
	    	arr[i]=sc.nextInt();
	    	
	    }
	    for (int i=0;i<arr.length; i++) {
	    	System.out.print(  arr[i] + " ");
	    }
	 }
	 
	 }
