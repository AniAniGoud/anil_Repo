package ani;
import java.util.*;
public class local7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("please enter the sentance ");
		String str = sc.nextLine();
		System.out.println("please eneter which letter before you print");
		char c = sc.nextLine().charAt(0);
		char arr[] = str.toCharArray();
		int position =0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==c) {
				position=i;
				break;
			}
		}
		for(int i = position-1; i<=arr.length-1; i--) {
		System.out.print (arr[i]);
		}
	}
	}
