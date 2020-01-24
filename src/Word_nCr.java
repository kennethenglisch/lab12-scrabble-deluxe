import java.util.Arrays;
import java.util.LinkedList;

public class Word_nCr {

	LinkedList<String> bag = new LinkedList<>();
	private String output = "";
	private final String inputstring;

	public static void main(String[] args) {
		Word_nCr nCr = new Word_nCr("JAVA");
	}

	public Word_nCr(String inputstring) {
		this.inputstring = inputstring;
		nCr(0);
		System.out.println(bag);
	}
	
	/*
	 * https://javahungry.blogspot.com/2014/02/algorithm-for-combinations-of-string-java-code-with-example.html
	 */
	private void nCr(int start) {
		for (int i = start; i < inputstring.length(); i++) {
			output += inputstring.charAt(i);
			if (!bag.contains(output.toString())&& output.length()>1) 
				bag.add(output.toString());
			if (i < inputstring.length())
				nCr(i + 1);
			output = output.substring(0, (output.length() - 1));
		}
		
	}
	
	protected LinkedList<String> getList(){
		return bag;
	}
}