
public class RacunskaRadnja {
	
	public static void main(String[] args) {
		int rezultat = 0;
		if (args.length == 0)
		{
			System.out.println("Molim unesite argumente: ");
		}
		else
		{
			try {		
					if (args[2].equals("+"))
					{
						rezultat = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
					} 
					else if (args[2].equals("-"))
					{
						rezultat = Integer.parseInt(args[0]) - Integer.parseInt(args[1]);
					}
					else if (args[2].equals("*"))
					{
						rezultat = Integer.parseInt(args[0]) * Integer.parseInt(args[1]);
					}
					else if (args[2].equals("/"))
					{
						rezultat = Integer.parseInt(args[0]) / Integer.parseInt(args[1]);
					}
					else if (args[2].equals("^"))
					{
						rezultat = Integer.parseInt(args[0]) ^ Integer.parseInt(args[1]);
					}
					else if (args[2].equals("%"))
					{
						rezultat = Integer.parseInt(args[0]) % Integer.parseInt(args[1]);
					}
					else
					{
						System.out.println("Niste unijeli ispravan operator!");
					}
		
			}
				catch(NumberFormatException e) {
				System.out.printf("Upozorenje: Niste unijeli ispravan unos! ");
			}
			System.out.println(rezultat);
		}
	}
}
