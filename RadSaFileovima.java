import lab15.TextIO;


public class RadSaFileovima {

	public static void main(String[] args) {
		TextIO.readUserSelectedFile();
		int suma = 0;
		while (TextIO.eof() != true)
		{
			try{
				String word = TextIO.getlnWord();
				int broj = Integer.parseInt(word);
				suma  += broj;
			}
			catch (NumberFormatException e)
			{
				TextIO.putln("Razmak");
			}
			catch (IllegalArgumentException ia)
			{
				TextIO.putln("Moramo skontati kako getWord radi.");
				break;
			}
		}
		TextIO.putln("Suma: " + suma);
	}

}
