package ani;
import java.util.*;
public class local6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("please enter the array size");
		int size = sc.nextInt();
		System.out.println("please enter the array elements");
		int []arr = new int[size];
		for(int i=0; i< arr.length;i++){
		arr[i]=sc.nextInt();
		}
		System.out.println("please enter the update number");
		int ele = sc.nextInt();
		int temp =   arr[0];
		for(int i=0; i<arr.length-1;i++) {
			     arr[i]=arr[i+1];
		}
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i] + " ");
		}
		}}

	


