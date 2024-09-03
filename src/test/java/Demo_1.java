import java.util.Scanner;

public class Demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=7;
		int f=0,s=1,next;
		for(int i=0;i<=n;i++) {
			System.out.println(f);
			next=f+s;
			f=s;
			s=next;
		}
		
	}

}
