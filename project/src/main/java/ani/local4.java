package ani;
import java.util.*;
public class local4 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		 System.out.println("please enter array size");
		 int size = sc.nextInt();
		 System.out.println("please enter array elemnts");
		 int arr[]= new int[size];
		 int temp=0;
		 for (int i =0; i<arr.length;i++) {
			 arr[i]=sc.nextInt();
		 }
		 int max = arr[0];
		 for (int i =0; i<arr.length; i++) {
			 
		  if(max<arr[i]) {
			 max=arr[i];
		  }		 }
		 System.out.println("The maximum number is " + max );
	}}

