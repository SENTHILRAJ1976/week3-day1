package week3.day1;

public class AndroidPhone extends Mobile {

	protected void takeVideo() {
		
		System.out.println("From AndroidPhone: Take a Videos in all");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AndroidPhone ap = new AndroidPhone();
		
		ap.makeCall();
		ap.saveContact();
		ap.sendSMS();
		ap.takeVideo();
	
		
		
	}

}
