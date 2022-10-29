package pig;

public class Strategy2 extends Player{
	@Override
	public boolean throwAgain ( Player opponent ){
		if((turnTotal()-10)>50){
			return false;
		}else{
			return true;}
	}//end method

}//end class
