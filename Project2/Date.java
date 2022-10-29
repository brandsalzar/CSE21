

public class Date {

	protected int year;
	protected int month;
	protected int day;

	public Date(int year, int month, int day){
		if(year>=1900&&year<=3000) {
		this.year = year;
		}
		if(month>=1&&month<=12) {
		this.month = month;
		}
		if(day>=1&&day<=31) {
		this.day = day;
		}
	}//constructor to set variables

	public int getYear(){
		return year;
	}//Accessor 1

	public int getMonth(){
		return month;
	}//Accessor 2

	public int getDay(){
		return day;
	}//Accessor 3

	public int dayOfYear() {
		int totalDays = 0;
		switch (month) {
		case 12: totalDays += 30;
		case 11: totalDays += 31;
		case 10: totalDays += 30;
		case 9 : totalDays += 31;
		case 8 : totalDays += 31;
		case 7 : totalDays += 30;
		case 6 : totalDays += 31;
		case 5 : totalDays += 30;
		case 4 : totalDays += 31;
		case 3 : totalDays += 28;
		case 2 : totalDays += 31;
		}
		totalDays += day;
		return totalDays;
	}//end dayofYear
	
	public int compare(Date dt){
		//difference between the current birthdate and date input parameter
		int yearsDiferenceInDays = Math.abs((getYear()-dt.getYear())*365);
		int dayDifference = Math.abs(dayOfYear() - dt.dayOfYear());
		int totalDifference = Math.abs(yearsDiferenceInDays-dayDifference);
		int monthsDifference = totalDifference/30;
		if (monthsDifference>60) {
			return 60;
		}
		else {
			return monthsDifference;
		}//end else
	}//returns
	
}//end class
