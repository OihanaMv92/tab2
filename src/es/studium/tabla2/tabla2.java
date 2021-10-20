package es.studium.tabla2;

import java.util.Scanner;

public class tabla2
{

	public static void main(String[] args)
	{
		final int TAM = 10;
		int tabla[]=new int[TAM];
		int i;
		Scanner teclado = new Scanner (System.in);
		
		//Esto es para que guarde en cada posicion el numero que metamos por teclado.
		// i vale el numero metido por teclado.
		for (i=0;i<TAM;i++)
		{
			System.out.println("Ingrese el valor de la posicion " +i+":");
			tabla[i]=teclado.nextInt();
		}
		// Esto indica que el numero intruducido sea multiplicado por 2
		for (i=0;i<TAM;i++)
		{
			tabla[i]=tabla[i]*2;
		}
		//Imprime +i+<Posicion = +tabla[i]=valor multiplicacion
		for (i=0;i<TAM;i++)
		{
			System.out.println("tabla["+i+"]="+tabla[i]);
		}
		teclado.close();
	}

}
