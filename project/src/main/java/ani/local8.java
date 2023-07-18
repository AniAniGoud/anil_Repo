package ani;
import java.util.*;
public class local8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter array size");
		int size = sc.nextInt();
		System.out.println("please enter the array elements");
		int [] arr = new int [size];
		for(int i=0; i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("please enter which number after you replace");
		int number = sc.nextInt();
		System.out.println("please enter the updated number");
		int ele = sc.nextInt();
		 int  index=0,i;
		for(i=0; i<arr.length;i++) {
			if(arr[i]==number) {
				
			index=i;
			break; 
			}
			}
		for(  i=arr.length-1;i>index;i--) 
		{
				arr[i]=arr[i-1];
			}
	       arr[i+1]=ele;
			
	
        for(int l=0; l<arr.length;l++) {
        	System.out.println(arr[l]);
        }}}