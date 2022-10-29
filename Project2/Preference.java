public class Preference {

	protected int quietTime;
	protected int music;
	protected int reading;
	protected int chatting;
	
	public Preference(int quietTime,int music,int reading,int chatting){
		//if(quietTime>=0&&quietTime<=10&&music>=0&&music<10&&reading>=0&&reading<=10&&chatting>=0&&chatting<=10){
		if(quietTime>=0&&quietTime<=10) {
			this.quietTime = quietTime; 
		}
		//this.quietTime = quietTime; 
		if(music>=0&&music<=10) {
		this.music = music;
		}
		if(reading>=0&&reading<=10) {
		this.reading = reading;
		}
		if(chatting>=0&&chatting<=10) {
		this.chatting = chatting;
		}
		//}//All between 1-10
	}//constructor
	
	public int getQuietTime(){
		return quietTime;
	}//accessor 1
	
	public int getMusic(){
		return music;
	}//accessor 2
	
	public int getReading(){
		return reading;
	}//accessor 3
	
	public int getChatting(){
		return chatting;
	}//accessor 4
	
	public int compare(Preference pref){
		int quietabs = Math.abs(this.getQuietTime()-pref.getQuietTime());
		int musicabs = Math.abs(this.getMusic()-pref.getMusic());
		int readingabs = Math.abs(this.getReading()-pref.getReading());
		int chattingabs = Math.abs(this.getChatting()-pref.getChatting());
		return (quietabs+musicabs+readingabs+chattingabs);
	}//end compare
}//end class


