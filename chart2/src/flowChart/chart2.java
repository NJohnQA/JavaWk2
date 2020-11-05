package flowChart;

public class chart2 {
	public static void main(String[] args) {
		int a = 100;
		double A = a%2;
		
		for(int i=0; i <10;i++ ) {
			if(A==0) {
				System.out.println("-");
				a++;
			}else {
				System.out.println("*");
				a++;
			}
			if(a>=200) {
				break;
			}else if(A==0) {
				System.out.println("-");
				a++;
			}else {
				System.out.println("*");
				a++;
			}
		}
	}

}
