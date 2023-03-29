package practica1;

import java.util.Scanner;

/**
 * 
 * @author enric
 * @version 1.1
 * 
 * La clase notas se encarga de ingresar notas de un estudiante, calcular la 
 * nota definitiva y verificar si está aprobado o no.
 * 
 */

public class notas {
	
	// declaramos la variables que nos hacen falta
	double uf1, uf2, uf3;
	double acu1, acu2, acu3, fin;
	
	// utilizamos Scanner para introducir datos
	Scanner sc = new Scanner(System.in);

	
	/**
     * Método para ingresar notas por teclado
     */
	public void IngresaNotas() {
		
		// al ejecutarse esta línea nos pide las notas por teclado
		System.out.println("ingrese las notas del estudiante");

		System.out.print("ingrese nota 1: ");
		uf1 = sc.nextDouble();

		System.out.print("ingrese nota 2: ");
		uf2 = sc.nextDouble();

		System.out.print("ingrese nota 3: ");
		uf3 = sc.nextDouble();
	}

	
	/**
     * Método para comprobar que las notas se han introducido correctamente
     */
	public void comprobacion() {
		if (uf1 > 10) {
			System.out.println(" nota1 mal introducida");
		} else {
			System.out.println(" nota1 correcta");
		}
		if (uf2 > 10) {
			System.out.println(" nota2 mal introducida");
		} else {
			System.out.println(" nota2 correcta");
		}
		if (uf3 > 10) {
			System.out.println(" nota3 mal introducida");
		} else {
			System.out.println(" nota3 correcta");
		}
	}

	
	/**
     * Método para calcular la nota definitiva
     */
	public void Calculonotas() {
		acu1 = uf1 * 0.35;
		acu2 = uf2 * 0.35;
		acu3 = uf3 * 0.30;
		fin = acu1 + acu2 + acu3;
		//aqui la tenemos calculada pero no la mostramos
	}

	
	/**
     * Método para mostrar las notas introducidas, los acumulados y la nota definitiva
     */
	public void Mostrar() {
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + uf1);
		System.out.println(" nota2 = " + uf2);
		System.out.println(" nota3 = " + uf3);

		System.out.println(" acumulado 1 = " + acu1);
		System.out.println(" acumulado 2 = " + acu2);
		System.out.println(" acumulado 3 = " + acu3);

		System.out.println(" nota final es = " + fin);
	}

	
	/**
     * Método para verificar si el estudiante ha aprobado o no
     */
	public void aprobado() {
		if (fin < 5 && fin >= 0) {
			System.out.println("suspendio");
		} else {
			if (fin >= 5 && fin <= 10) {
				System.out.println("aprobado");
			} else {
				System.out.println(" error en la notas");
			}
		}
	}

	
	/**
	* Método principal que se encarga de ejecutar la aplicación.
	* En este método creamos una instancia de la clase notas, llamamos a los métodos
	* que se encargan de ingresar las notas, comprobar que se hayan ingresado correctamente,
	* calcular la nota definitiva, mostrar las notas y verificar si el estudiante aprobó o no.
	* @param args argumentos pasados al método main
	*/
	public static void main(String[] args) {
		// creamos mecanimos para llamar a cualquier metodo fuero de la clase 
		notas fc = new notas();
		fc.IngresaNotas();
		fc.comprobacion();
		fc.Calculonotas();
		fc.Mostrar();
		fc.aprobado();
	}
}
