public class Student {
	protected String name;
	protected char gender;
	protected Date birthdate;
	protected Preference activity;
	protected boolean match;
	protected int compatibility;

	public Student(String name, char gender, Date birthdate, Preference activity) {//constructor
		this.name = name;
		this.gender = gender;
		this.birthdate = birthdate;
		this.activity = activity;
	}//end constructor

	public String getName() {
		return name;
	}//end accessor

	public char getGender() {
		return gender;
	}//end accessor

	public Date getDOB() {
		return birthdate;
	}//end accessor

	public Preference getActivity() {
		return activity;
	}//end accessor
	
	public boolean getMatch() {
		return match;
	}//end accessor
	
	public void setMatch(boolean match){
		this.match = match;
	}//end mutator method
	
	public int compare(Student st) {
		if(gender == st.gender) {
			compatibility = (40 - (activity.compare(st.activity))) + (60 - (birthdate.compare(st.birthdate)));
		}
		else {
			return 0;
		}
		if(compatibility<0) {
			return 0;
		}
		if(compatibility>100) {
			return 100;
		}
		return compatibility;
	}//end method	
}//end class

