
public class SumaBrojeva {

	public static void main(String[] args) {
		int suma = 0;
		if (args.length == 0)
		{
			System.out.println("Unesite argumente.");
		}
		else
		{
			for (String arg: args)
			{
				try{
					suma = suma + Integer.parseInt(arg);
				} 
				catch (NumberFormatException e)
				{
					System.out.println("Niste unijeli ispravan broj!");
					
				}
			}
			System.out.println("Suma argumenata je: " + suma);
		}

	}

}
