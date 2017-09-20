package threedice;

public class Threedice {

		public static void main(String[] args) {

			
			dice d1=new dice();
			dice d2=new dice();
			dice d3=new dice();
			Diceset set1=new Diceset(d1,d2,d3);
			int a=0;
			for(int i=0;i<1000000000;i++){
				set1.unlockall();
				set1.reset();
			a=a+set1.playgame();
			}
			System.out.println(a);
			System.out.println(a/1000000000.0);
			}
	


}
