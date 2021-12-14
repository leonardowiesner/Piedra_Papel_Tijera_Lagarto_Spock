import java.util.Scanner;

public class main {//PIEDRA PAPEL TIJERA LAGARTO SPOCK By:Leonardo Wiesner

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner reader = new Scanner(System.in); //Instancia del lector
		
		String opcion_usuario="";  
		
		System.out.println("PIEDRA PAPEL LAGARTO SPOCK");
		
		System.out.println("Escoge una opcion:");
		System.out.println("(piedra)-(papel)-(tijera)-(lagarto)-(spock)");
		opcion_usuario = reader.next();
		
		if (opcion_usuario.equals("piedra")) {
			System.out.println("Haz escogido piedra");
		} else if (opcion_usuario.equals("papel")) {
			System.out.println("Haz escogido papel");
		} else if (opcion_usuario.equals("tijera")) {
			System.out.println("Haz escogido tijera");
		} else if (opcion_usuario.equals("lagarto")) {
			System.out.println("Haz escogido lagarto");
		} else if(opcion_usuario.equals("spock")) {
			System.out.println("Haz escogido spock");
		}

		
	}

}
