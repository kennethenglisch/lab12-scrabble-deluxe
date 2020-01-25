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
	}
	

	private void nCr(int position) {
		for (int i = position; i < inputstring.length(); i++) {
			output += inputstring.charAt(i);
			if (!bag.contains(output) && output.length()>1) 
				bag.addFirst(output);
			if (i < inputstring.length())
				nCr(i+1);
			output = output.substring(0, (output.length() - 1));
		}
		
	}
	
	protected LinkedList<String> getList(){
		return bag;
	}
}