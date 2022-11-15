package Ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fichero{
	
	File f;
	String clave;
	
	public Fichero(String ruta,String clave) {
		f=new File(ruta);
		this.clave=clave;
	}
	
	public void leer() {
		
		try {
			//Wrappers de lectura de ficheros
			FileReader redactor=new FileReader(f);
			BufferedReader lector=new BufferedReader(redactor);
			

			String linea;
			
			while ((linea = lector.readLine()) != null) {
	            
	            System.out.println(linea);
	            
	        }
			
			
			lector.close();
			redactor.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public int contarclave() {
		
		int cuenta=0;
		try {
			//Wrappers de lectura de ficheros
			FileReader redactor=new FileReader(f);
			BufferedReader lector=new BufferedReader(redactor);
			

			String linea;
			int pos;
			int calculo;
			String subcadena;
			
			while ((linea = lector.readLine()) != null) {
	            
				subcadena=linea;
				pos=subcadena.indexOf(clave);
	            
				while(pos>0)
				{
					cuenta++;
					calculo=pos+clave.length()-1;
					subcadena=subcadena.substring(calculo);
					pos=subcadena.indexOf(clave);
				}
				
	        }
			
			
			lector.close();
			redactor.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cuenta;
		
		
	}
	
	
}
