
public class ProstiBroj {

	private static boolean jeProst(int broj) {
		boolean prosti = true;
		for (int i=2; i<broj; i++)
		{
			if (broj % i == 0)
			{
				prosti = false;
			}
		}
		return prosti;
	}
	
	public static void main(String[] args) {
		try{
			if(args.length != 0)
			{
				if(jeProst(Integer.parseInt(args[0])) && Integer.parseInt(args[0]) != 0)
				{
					System.out.println("Broj je prost.");
				}
				else if (Integer.parseInt(args[0]) != 0)
				{
					System.out.println("Broj nije prost.");
				}
			}	
		}
		catch(NumberFormatException e)
		{
			System.out.println("Greška.");
		}
		
		
		
		
		}


	}
