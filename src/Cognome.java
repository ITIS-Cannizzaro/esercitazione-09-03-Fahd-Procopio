import java.util.Scanner;

// Chiamare la classe col proprio cognome
public class MainClass
{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
				//aggiungere, togliere casi a seconda delle proprie scelte
				case 1:
					//Inserire metodo statico
				break;
				case 2:
					//Inserire metodo statico
				break;
				case 3:
					//Inserire metodo statico
				break;
				default:
					System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{
		// Modificare il menù secondo le proprie scelte
		System.out.println("1 - Es n. * - Titolo es. *");
		System.out.println("2 - Es n. * - Titolo es. *");
		System.out.println("3 - Es n. * - Titolo es. *");
		System.out.println("4 - Es n. * - Titolo es. *");
		System.out.println("5 - Es n. * - Titolo es. *");
	}
	static void a() {
		double[] array = new double[10];
		//inizializzazione primo array
		double[] array1 = new double[5];
		//inizializzazione secondo array
		for(int i= 0; i<10; i++) {
			array[i]= in.nextDouble();
		//inserire valori nel primo array
			for(int j = 0; j<10; j++) {
				array1[i]= array[j+j]* array[j+j+ 1];	
		//se il primo valore di i è 0 il primo valore di array1 sarà dato dal prodotto tra la somma di due j per la somma + 1 es j = 0 array1[0]= j+j(0) per j+j+1(1)
			}
		}
	}
	static void DueSequenze() {
		String [] arrayString = new String[5];
		String [] arrayString1 = new String[5];
		for(int i = 0; i<5; i++) {
		// assegno valori ai due array
			arrayString[i]= in.nextLine();
			arrayString1[i]= in.nextLine();
			
		}
		
		
		for(int i= 0; i<5; i++) {
		//il primo ciclo considera un valore i dell'array che verrà. nel secondo, comparato con i valori del secondo

			for(int j = 1; j<5; j++) {
			// i cambierà solo a fine di questo ciclo quindi il valore array i verrà comparato con tutti i valori j del secondo array
				if(arrayString[i] == arrayString1[j]) {
					System.out.println("ok");
			// se array i è uguale ad array j stamperà "ok" e incrementerà di 1 la variabile b
					int a = 0;
					int b = a++;
			// la variabile b è utile al secondo if per tenere conto di quante stringhe sono uguale tra i due array
					if((i == 5) && (b == 0)) {
			// questo considera due array senza valori comuni, la condizione può essere verifica solo al raggiungimento del valore massimo del primo ciclo e quando la variabile b che, teneva conto dei valori uguale è 0, cioè quando non esistano valori uguali
						System.out.println("no!");
						
			// stampa "no!" 
					}
				}
				

			}
			
			
		}
	}
	
	

}


