import java.util.Scanner;

public class Hava 
{

	public static void main(String[] args) 
	{
		int sicaklik;
		Scanner inp = new Scanner(System.in);
		System.out.println("Sicaklik giriniz: ");
		sicaklik = inp.nextInt();
		
		if(sicaklik < 5) 
		{
			System.out.println("Kayak yapmaya gidebilirsiniz: ");
		}
		
		else if(sicaklik >= 5 && sicaklik <= 15) 
		{
			System.out.println("Sinemaya gidebilirsiniz.");
		}
		
		else if(sicaklik > 15 && sicaklik < 25) 
		{
			System.out.println("Piknige gidebilirsiniz: ");
		}
		
		else if(sicaklik >= 25) 
		{
			System.out.println("Yuzmeye gidebilirsiniz.");
		}
		
		else 
		{
			System.out.println("Hatali giris! ");
		}
	}

}
