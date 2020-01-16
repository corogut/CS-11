import java.util.*;

class Practice {
	

static final Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
	int size=in.nextInt();
	int[] rayOne=new int[size];
	int[] rayTwo=new int[size];
	rayDiff(rayOne,rayTwo);
	}
	public static void rayDiff(int[] rayOne,int[] rayTwo) {
		int [] rayDiff=new int[rayOne.length];
		
		
			for(int i=0;i<rayOne.length;i++) {
			rayOne[i]=in.nextInt();
			
		}
			for(int i=0;i<rayOne.length;i++) {
				rayTwo[i]=in.nextInt();
				
			}
			for(int i=0;i<rayOne.length;i++) {
				rayDiff[i]=rayOne[i]-rayTwo[i];
				System.out.println(rayDiff[i]);
			}
	}
}
