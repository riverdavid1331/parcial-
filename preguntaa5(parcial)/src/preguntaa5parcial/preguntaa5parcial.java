package preguntaa5parcial;

import java.util.Scanner;

public class preguntaa5parcial {


	public static boolean Pal�ndromo(String palabras) {
		
	// gen�ro el metodo que ya habia explicado y citado como ejemplo para este caso //
	
	for( int i= 0; i<palabras.length();i++) {
		
	if (palabras.charAt(i)!= palabras.charAt(palabras.length()-i-1)) {
	return false;	
	}	
	
	}
	
    return true;
    
    
	}
	public static void main (String[]args) {
		
		 // genero el otro metodo //
		
		String palabra1; // declaro string //
		String palabra2;
		
		Scanner teclado = new Scanner(System.in);
	    System.out.print("Ingrese la frase a evaluar: ");
		
		palabra1= teclado.nextLine();
		palabra2= palabra1.toLowerCase();
		
		// simple caso de un if // 
		
		if (Pal�ndromo(palabra1)==true) 
		{
			System.out.println("La palabra SI  es un pal�ndromo");
		}
		else
		{
			System.out.println("La palabra  NO es pal�ndromo");
		}
	}

}
