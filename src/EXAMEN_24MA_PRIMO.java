import java.util.Scanner;

public class EXAMEN_24MA_PRIMO {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
	
		System.out.println("Buenos dias Ceinmark, soy Carlos Antony");
		System.out.println("Introduce un numero para averiguar si es primo o no :");
		
		 int contador,I,numero;
		 
	        System.out.print("Ingresa un numero: ");
	        numero = ent.nextInt();
	 
	        contador = 0;
	 
	        for(I = 1; I <= numero; I++)
	        {
	            if((numero % I) == 0)
	            {
	                contador++;
	            }
	        }
	 
	        if(contador <= 2)
	        {
	            System.out.println("El numero es primo");
	        }else{
	            System.out.println("El numero no es primo");
	        }
	}

}
