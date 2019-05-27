package pregunta6parcial;

import java.util.Scanner;

public class pregunta6parcial {

	public  static  void  main ( String [] args ) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println( " Digite la dimension del vector :" );
		// de una vez mando que digite  de no ser asi saldra un vacio en la consola//
		
			int n = teclado.nextInt (); // dont forget it 
		    int A [] = new int [n]; // llamamos a nuestro vector como A 
			int  multi= 0 ;
			int  mayor = 0 ;
			
		System.out.println( " Ingrese los elementos del vector " );
		 // en la consola digitamos los valores del vector que sale en forma de lista
		 // forx3		
			 for( int i= 0 ; i<A.length; i++ ) {	
					A [i] = teclado . nextInt ();
				}
				
			 for ( int j= 0 ; j<A.length-3; j++ ) {   //  producto mayor  del vector
					multi = A [j] * A [j+1] * A [j+2] * A[j+3];
					if (multi > mayor) {
					  mayor = multi;
					}
				}
				
			 for ( int j = 0 ; j < A.length -3; j ++ ) {
					if ( A[j] * A[j + 1 ] * A[j + 2 ] * A[j + 3 ] == multi) {
						System.out.println( " El producto maximo es " +  mayor + " y está formado por: " );
						System.out.println(A[j] + "  " + A[j+1] + "  " + A[j+2] + "  " + A[j+3]+ " ");
					}
					
				
				}
		
		}
	}
