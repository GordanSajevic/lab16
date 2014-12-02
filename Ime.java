import lab15.TextIO;


public class Ime {

	public static void main(String[] args) {
		TextIO.readUserSelectedFile();
		while (TextIO.eof() != true)
		{
			try{
				String word = TextIO.getlnWord();
				int broj = TextIO.getlnInt();
				System.out.println(word);
				if (broj > 17)
				{
					System.out.printf("Ima %d godina.", broj);
				}
				else
				{
					System.out.println("Ne možete nastaviti sa programom, đubre maloljetno.");
					break;
				}
			}
			catch(NumberFormatException e)
			{
				System.out.println("Greška.");
			}
		}
	}

}
