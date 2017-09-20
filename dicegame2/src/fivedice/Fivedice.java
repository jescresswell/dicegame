package fivedice;


public class Fivedice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		dice d1=new dice();
		dice d2=new dice();
		dice d3=new dice();
		dice d4=new dice();
		dice d5=new dice();
		Diceset set1=new Diceset(d1,d2,d3,d4,d5);
		int a=0;
		for(int i=0;i<100000000;i++){
			set1.unlockall();
			set1.reset();
		a=a+set1.playgame();
		}
		System.out.println(a);
		System.out.println(a/100000000.0);
		}
	}


