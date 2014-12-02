import lab15.TextIO;


public class Podaci {

	public static void main(String[] args) {
		TextIO.writeUserSelectedFile();
		System.out.println("Unesite ime: ");
		String ime = TextIO.getln();
		System.out.println("Unesite prezime: ");
		String prezime = TextIO.getln();
		System.out.println("Unesite datum rođenja: ");
		String datum = TextIO.getln();
		TextIO.readUserSelectedFile();
	}

}
