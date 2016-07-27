/*
 * Please read README.txt file for "how to run?" details.
 */

	public class ParserMain {

	public static void main(String args[]) {
		if (args.length != 1) {
			System.out.println("Usage: ParserMain <file name>");
			System.exit(-1);
		}

		String path = "";
		if ((System.getProperty("os.name").equals("Linux")) || (System.getProperty("os.name").equals("Mac OS X")))
			path = System.getProperty("user.dir") + "/" + args[0];
		else
			path = System.getProperty("user.dir") + "\\" + args[0];

		LexicalAnalyzer lex = new LexicalAnalyzer(path);
		lex.startAnalyze();
	}

}
