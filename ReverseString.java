import java.util.Scanner;
public class ReverseString 
{
	public static void main(String[] args) {
		String str;
		int i,len;
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		str=s.nextLine();
		len=str.length();
		System.out.println("REVERSE STRING IS");
		for (i=len-1;i>=0;i--)
		{
		    System.out.println(str.charAt(i));
		}
		
	}
}
