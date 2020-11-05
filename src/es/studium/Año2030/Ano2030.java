package es.studium.Año2030;


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
		System.out.println( "Introduce tu año de nacimiento" );
		agno = Integer.parseInt(teclado.nextLine());
		teclado.close();
		if(agnoactual<agno)
		{
			System.out.println( "El año introducido es mayor que la fecha actual" );
		}
		else
		{
			System.out.println("Hola "+ nombre + "en el año 2030 tendras "+ (2030-agno) + " años");
		}

	}
}

/*Programa ejercicio26


   CADENA nombre 
   ENTERO año
INICIO
	ESCRIBE "Introduce tu nombre"
	LEER nombre 
	ESCRIBE "Introduce tu año de nacimimiento"
	LEER año
	SI FECHAACTUAL() < año ENTONCES
		ESCRIBIR "El año introducido es mayor que la fecha actual"
	SINO
		ESCRIBIR "Hola "+ nombre + "en el año 2030 tendras "+ (2030-año) + "años"
	FINSI
FIN*/