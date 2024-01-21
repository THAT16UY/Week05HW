package OOP;

public class SpacedLogger implements Logger{

	@Override
	public void log(String arg) {
		StringBuilder result = new StringBuilder();
		
		for(int i = 0; i < arg.length(); i++) {
			if(i > 0) {
				result.append(" ");
			}
			result.append(arg.charAt(i));
		}
		System.out.println(result.toString());
	}

	@Override
	public void error(String arg) {
		StringBuilder result = new StringBuilder();
		
		for(int i = 0; i < arg.length(); i++) {
			if(i > 0) {
				result.append(" ");
			}
			result.append(arg.charAt(i));
		}
		System.out.println("ERROR: " + result.toString());
		
	}
}
