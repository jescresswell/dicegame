package twodice;

public class Twodice {
public static void main(String[] args) {
		
		dice d1=new dice();
		dice d2=new dice();
		Diceset set1=new Diceset(d1,d2);
		int a=0;
		for(int i=0;i<1000;i++){
			set1.unlockall();
			set1.reset();
			a=a+set1.playgame();
		}
		System.out.println(a);
		System.out.println(a/10000.0);


		}

		
}