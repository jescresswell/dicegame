package fivedice;

import fivedice.dice;

public class Diceset {
public dice d1;
public dice d2;
public dice d3;
public dice d4;
public dice d5;
public int r;
public int w;

public Diceset(dice da, dice db, dice dc, dice dd, dice de){
	d1=da;
	d2=db;
	d3=dc;
	d4=dd;
	d5=de;
	r=0;
}
public void rollall(){
	d1.roll();
	d2.roll();
	d3.roll();
	d4.roll();
	d5.roll();
}
public int test(dice da){
if(da.getvalue()==6)
		r++;
if(da.getvalue()==5){
	da.lock();
	return 0;}
else
	return 1;

}
public int testall(){
	return test(d1)+test(d2)+test(d3)+test(d4)+test(d5);
	
}
public void unlockall(){
	d1.unlock();
	d2.unlock();
	d3.unlock();
	d4.unlock();
	d5.unlock();
}
public void reset(){
	r=0;
	w=0;
	d1.value=0;
	d2.value=0;
	d3.value=0;
	d4.value=0;
	d5.value=0;
}
public int playgame(){
	int wl=0;
	rollall();
	w=testall();
	if(w==0){
			 //System.out.println("you win");
			 wl=1;
	}
	else 
		if (r>0){
				//	System.out.println("reroll");
					r--;
					wl=playgame();
		}
	else{
					//System.out.println("you lose");
					wl=0;
	}
	return wl;
}
}
