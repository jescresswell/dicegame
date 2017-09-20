package onedice;

import java.util.Random;

public class dice {
	public int value;
	
	public dice(){
		value=0;
	}

		
		public void roll(){
			Random rn = new Random();
			value = rn.nextInt(6) + 1;
			System.out.println(value);
		}
		public int getvalue(){
			return value;
		}
		public void play(){
			this.roll();
			if(this.getvalue()==5)
				 System.out.println("you win");
				else 
					if(this.getvalue()==6){
						System.out.println("reroll");
						this.play();}
					else
						System.out.println("you lose");
		}
}
