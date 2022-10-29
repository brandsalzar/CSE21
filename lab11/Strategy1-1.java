package pig;

public class Strategy1 extends Player {
	@Override
	public boolean throwAgain ( Player opponent ){
		if(turnTotal()<50) {
			return false;
		}else{
			return true;}//end if else
	}//end method


}//end class
