package ani;
import java.util.*;
public class local9 {
	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
System.out.println("please enter a number");
int num=sc.nextInt();
int sum=0;
for(int i = 2; i<num; i++) {
if( num%i==0) {
	sum=sum+i;
}}
if(sum>0) {
	System.out.println("not prime");
}else {
System.out.println("prime");		
	}}}
