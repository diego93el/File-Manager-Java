package Fichero;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FrasesCelebres {

	public static void main(String[] args) {
		//Creamos la aplicacion para recopilar las frases introducidas por el usuario , usamos el Scanner con su importacion.
		Scanner sc=new Scanner(System.in);
		int nFrases=0;
		System.out.println("*******************************************************");
		System.out.println("****************Bienvenido usuario.********************");
		System.out.println("Esta aplicion ha sido creada para recopilar frases celebres, \nY escribirtelas en una archivo para que te quede para la posteridad.");
		System.out.println("*******************************************************");
		//Usamos el Scanner para guarda la unidad del largo del array que recopilara las frases.
		System.out.println("Ahora dame un numero de frases celebres que te sepas.");
		nFrases= sc.nextInt();
		System.out.println("**********************¡Muy bien!***********************");
		//Creamos el Array tipo String y con su longitud, generada por el usuario.
		String [] Frases= new String [nFrases];
		System.out.println("*******************************************************");
		System.out.println("*************Pulsa intro para continuar.***************");
		//Limpiamos buffer antes de entrar al Bucle, ya que obtendremos otro tipo de variable.
		sc.nextLine();
		sc.nextLine();
		
	    for (int i=0; i<nFrases;i++) {
	      System.out.println("*******************************************************");
	      System.out.println("Escribeme la frase numero "+(i+1)+" que te sabes.");
	      Frases[i]=sc.nextLine();
	      
	    }
	    //Una vez recopilada la informacion y almacenada , es hora de imprimirla en un archivo .txt.
	    //El constructor FileWriter necesita del metodo try & catch para saber si pudo completar el proceso o no.
		try {
			//Usamos de la libreria IO el constructor BufferWriter ya que es perfecto para escribir en caracteres y lineas de texto
			//Y su tamaño por defecto es mas que perfecto para la aplicacion.
			//Tambien tenemos el FileWriter sera el constructor del archivo, y hara la lectura de los bytes o en este caso caracteres que poseen las frases.
			//Indicamos por ultimo la ruta en donde queremos que nos cree el archivo de texto, en este caso sera en el mismo directorio del proyecto que viene por defecto.
			BufferedWriter salida =new BufferedWriter(new FileWriter("FrasesCelebres.txt"));
			//Hacemos un ultimo bucle para escribir las frases almacenadas.
		for( int i=0 ;i<nFrases;i++ ) {
			//Con el metodo append que seria como el apendice por su traduccion, seria la impresion de algo que siempre va estar presente dentro del archivo.
			salida.append("\nFrase celebre ");
			//Con el metodo Write que seria un output, metodo que genera algo externo del proyecto indicamos lo que queremos que imprima o escriba.
			salida.write(Frases[i]+" :Contiene "+Frases[i].length()+" Caracteres.");
		}
		//Tambien tendremos un metodo en el que indicamos que hemos terminado el proceso, en este caso lo indicamos por fuera del bucle.
			salida.close();
			//Indicamos que el proceso fue echo con exito, en caso contrario se indicaria en el catch, y termina la aplicacion.
			System.out.println("********Se ha creado el archivo, guardalo para la posteridad.********");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	

	}
}
