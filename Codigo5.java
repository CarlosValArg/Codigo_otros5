//Ciclo que imprime numeros del 1 al 100 indicando cuales son afortunados y cuales no afortunados
import java.util.Scanner; //Se importa el scanner

public class Codigo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);//Se añade System.in
	    System.out.print("Introduzca un número: ");//Se reemplazan comillas simples por comillas dobles
	    int ni = s.nextInt(); //Se reemplazan valores string por int
	    int c = ni;
	    
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (ni <= 100) {//Se implementa condicional para que el ciclo no devuelva numeros infinitos
		  int digito = (int)(ni % 10);
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
	    	  if(afo<100) { //condicional añadida para evitar ciclo infinito de numeros afortunados
			afo++;
	      } else {
			while(noAfo<100)//condicional añadida para evitar ciclo infinito de numeros no afortunados
	    	  noAfo++;
		  
		  ni /= 10;
	    }
	    if (afo > noAfo) {
	      System.out.print("El " + c + " es un número afortunado.");//Se reemplaza el println por print
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }
	    
	  }
	  s.close();//Se cierra el scanner
	}

}
}