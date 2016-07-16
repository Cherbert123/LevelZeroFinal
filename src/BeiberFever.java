
public class BeiberFever {
	
public static void main(String[] args) {
	String Baby = "Baby";
	String Oh = "Oh";
	String No = "No";
	for (int i = 0; i < 4; i++) {
		speak(Baby);
		speak(Baby);
		speak(Baby);
		speak(Oh);
		speak(Baby);
		speak(Baby);
		speak(Baby);
		speak(No);
		speak("I thought you'd always be mine");
	}
}
static void speak(String words) {
  	 try {
  		 Runtime.getRuntime().exec("say " + words).waitFor();
  	 } catch (Exception e) {
  		 e.printStackTrace();
  	 }
}
}
