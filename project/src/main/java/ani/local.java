package ani;
import java.util.*;
public class local {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("please enter held clases");
		int held = sc.nextInt();
		System.out.println("please enter no.of clases attend");
		int attend = sc.nextInt();
		int total = held /attend*100;
		if(total>75) {
			System.out.println("Allowed the clases");
			
		}
		else {
			System.out.println("Not allowed to the class");
		}
	}

}