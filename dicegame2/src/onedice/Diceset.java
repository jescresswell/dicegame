package onedice;

public class Diceset {
public dice d1;

public Diceset(dice d){
	d1=d;
}
public void playgame(){
	d1.roll();
		if(d1.getvalue()==5)
			 System.out.println("you win");
			else 
				if(d1.getvalue()==6){
					System.out.println("reroll");
					this.playgame();}
				else
					System.out.println("you lose");
}
}
