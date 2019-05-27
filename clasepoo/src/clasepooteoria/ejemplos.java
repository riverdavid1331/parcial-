package clasepooteoria;
//public class ejemplos {
import java.util.Scanner;

	/* Programa auxiliar para escribir felicitacione a las
	  mejores  promedios de una disciplina con 3 alumnos 
	   _ Leer los nombres de las notas de 3 alumnos
	   _ calcular la media del promedio 
	   _ Dictar los alumnos tuvieran nota por encima del promedio */

	public class ejemplos {
		
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	String frank, douglas, river;
	float nota1, nota2, nota3, media;
	System.out.print("Informe a nota de " + frank + ": ");
	nota1 = teclado.nextFloat();
	System.out.print("Informe a nota de " + douglas+ ": ");
	nota2 = teclado.nextFloat();
	System.out.print("Informe a nota de " + river  + ": ");
	nota3 = teclado.nextFloat();
	media = (nota1 + nota2 + nota3) / 3;
	if (nota1 > media)
	System.out.println("Parabéns " + frank);
	if (nota2 > media)
	System.out.println("Parabéns " + douglas);
	if (nota3 > media)
	System.out.println("Parabéns " + river);
	}
	
}