package OOP;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String arg) {
		System.out.println("***" + arg + "***");
	}

	@Override
	public void error(String arg) {
		StringBuilder result = new StringBuilder();
		String mid = "***Error: " + arg + "***";
		for(int i = 0; i < mid.length(); i++) {
			result.append("*");
		}
		System.out.println(result.toString());
		System.out.println("***Error: " + arg + "***");
		System.out.println(result.toString());
	}
 
	
}
