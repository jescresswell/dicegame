package fivedice;

import java.util.Random;

public class dice {
	public int value;
	public boolean lock;
	public Random rn = new Random();
	
	public dice(){
		value=0;
		lock=false;
	}

		
		public void roll(){
			if(lock==false){
			value = rn.nextInt(6) + 1;
			}
			//System.out.println(value);
			
		}
		public int getvalue(){
			return value;
		}
		public void lock(){
			lock=true;
		}
		public void unlock(){
			lock=false;
		}
}
