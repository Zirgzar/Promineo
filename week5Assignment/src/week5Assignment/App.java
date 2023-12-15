package week5Assignment;

public class App {

	public static void main(String[] args) {
		
		AsteriskLogger meow = new AsteriskLogger();
		
		SpacedLogger woof = new SpacedLogger();
		
		meow.log("meow");
		meow.error("meow");
		
		woof.log("woof");
		woof.error("woof");
	}
}
