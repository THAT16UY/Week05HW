package OOP;

public class App {

	public static void main(String[] args) {
		
		Logger aLogger = new AsteriskLogger();
		Logger sLogger = new SpacedLogger();
		
		aLogger.log("Hello");
		aLogger.error("Hello");
		sLogger.log("Hello");
		sLogger.error("Hello");

	}

}
