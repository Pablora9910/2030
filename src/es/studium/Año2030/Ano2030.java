package es.studium.A�o2030;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ano2030
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		Calendar fecha = new GregorianCalendar();
		int agnoactual = fecha.get(Calendar.YEAR);
		int agno;
		String nombre = "";
		System.out.println( "Introduce tu nombre" );
		nombre = teclado.nextLine(); 
		System.out.println( "Introduce tu a�o de nacimiento" );
		agno = Integer.parseInt(teclado.nextLine());
		teclado.close();
		if(agnoactual<agno)
		{
			System.out.println( "El a�o introducido es mayor que la fecha actual" );
		}
		else
		{
			System.out.println("Hola "+ nombre + "en el a�o 2030 tendras "+ (2030-agno) + " a�os");
		}

	}
}

/*Programa ejercicio26


   CADENA nombre 
   ENTERO a�o
INICIO
	ESCRIBE "Introduce tu nombre"
	LEER nombre 
	ESCRIBE "Introduce tu a�o de nacimimiento"
	LEER a�o
	SI FECHAACTUAL() < a�o ENTONCES
		ESCRIBIR "El a�o introducido es mayor que la fecha actual"
	SINO
		ESCRIBIR "Hola "+ nombre + "en el a�o 2030 tendras "+ (2030-a�o) + "a�os"
	FINSI
FIN*/