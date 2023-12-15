package week5Assignment;

public class AsteriskLogger implements Logger {
	
	public void log(String msg) {
		System.out.println("***" + msg + "***");
	}
	
	public void error(String msg) {
		String msgLine = "***Error: " + msg + "***";
		String boxLine = "";
		
		for (int i = 0; i < msgLine.length(); i++) {
			boxLine += "*";
		}
		
		System.out.println(boxLine);
		System.out.println(msgLine);
		System.out.println(boxLine);
	}

}
