import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
Air[] interFace  = new Air[5];


interFace [0] = new Airplane (1993, "Airplane", "Jumbo", "White", "The Sky Rocket1", 50);
interFace [1] = new Bird (2,  "Bird","Pollie", "Yellow", "Lucky", 3);
interFace [2] = new Jetplane (2007, "Jetplane", "Viper", "Blue", "Dodger", 120);
interFace [3] = new Missile(2016, "Missile", "USA", "White", "Smog Free", 800);
interFace [4] = new SuperMan (1973, "Supeman", "kent", "White", "Momma's Boy", 500);



System.out.print("\nHow many rounds you want go?:  "); 
int oCycle;
oCycle= Dice.Throw(input.nextInt());

if (oCycle < 6)
System.out.printf("Operating Cycles = %d\n\n ", oCycle);
else if (oCycle > 7 && oCycle <= 12)
	System.out.printf("Operating Cycles = %d\n\n ", oCycle);
else if (oCycle > 13 && oCycle <= 20)
	System.out.printf("Operating Cycles = %d\n", oCycle);
else 
	System.out.printf("Operating Cycles = %d\nGet ready!\n ", oCycle);


		
for (int i=1; i <= oCycle; i++)
{	
	interFace[0].Fly (i);
	interFace[1].Fly (i);
	interFace[2].Fly (i);
	interFace[3].Fly (i);
	interFace[4].Fly (i);
	
	System.out.print(interFace[0]);
	System.out.print(interFace[1]);
	System.out.println(interFace[2]);
	System.out.print(interFace[3]);
	System.out.print(interFace[4]);
}
}





	}


