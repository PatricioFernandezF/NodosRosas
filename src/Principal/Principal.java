package Principal;

import Ficheros.Fichero;

public class Principal {

	
	public static void main(String[] args) {
		
		Fichero f=new Fichero("fichero.txt","clave");
		
		f.leer();
		
		int contador=f.contarclave();
		
		System.out.println("El contador aparece "+contador+" veces");
		
		 
		
	}
	
}
