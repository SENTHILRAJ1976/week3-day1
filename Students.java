package bankfunction;


public class Students {
	
	
	public int getStudentInfo(int id) {
		
		System.out.println(+id);
		return id;
	}
	
public void getStudentInfo(int id, String Name) {
		
		System.out.println(+id+" "+Name);
	}

public void getStudentInfo(String email, long phoneNumber) {	
	
	System.out.println("rajsenthil76@gmail.com"+" "+"944441557" );
}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students stud = new Students();
		
		stud.getStudentInfo(757394);
		stud.getStudentInfo(757394, "R Senthil Raj");
		stud.getStudentInfo("rajsenthil76@gmail.com", 944441557);

	//	System.out.println(stud);
		
	}

}
