package week5Assignment;

public class SpacedLogger implements Logger {

	public void log(String msg) {
		System.out.println(msg.replace("", " ").trim());
	}
	
	public void error(String msg) {
		System.out.println("ERROR: " + msg.replace("", " ").trim());
	}
}
