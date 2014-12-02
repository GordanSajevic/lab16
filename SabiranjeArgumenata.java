
public class SabiranjeArgumenata {

	public static void main(String[] args) {
		int suma = 0;
		if (args.length == 0)
		{
			System.out.println("Molim unesite argumente: ");
		}
		else
		{
			for (String arg: args)
			{
				try {
					suma = suma + Integer.parseInt(arg);
				} catch(NumberFormatException e) {
					System.out.printf("Upozorenje: Vrijednost %s nije ispravan broj. ", arg);
				}
				System.out.println(arg);
			}
			System.out.printf("Suma je: %d", suma);
		}

	}

}
