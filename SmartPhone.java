package week3.day1;

public class SmartPhone extends AndroidPhone {

	
	protected void connectWhatsApp() {
		
		System.out.println("Use the WhatsApp call for connect");
	}
	
protected void takeVideo() {
		
		System.out.println("Take the video using SmartPhone");
	}
	
	
	
	public static void main(String[] args) {
	
		SmartPhone smp = new SmartPhone();
		
		smp.makeCall();
		smp.saveContact();
		smp.sendSMS();
		smp.connectWhatsApp();
		smp.takeVideo();
		smp.takeVideo();
	}

}
