package prueba;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import seguidores.Seguidores;
import seguidores.Seguidos;
import us.lsi.common.Files2;

public class prueba {
	public static void main(String[] args) throws IOException {
		
		String fichero1 ="ficheros/2.txt";
		String fichero2="ficheros/1.txt";;
		
		List<String> listaAntigua= Files2.getLines(fichero1);
		List<String> listaNueva= Files2.getLines(fichero2);
		
		
		 Collection<String> similar = new HashSet<String>( listaAntigua );
         Collection<String> different = new HashSet<String>();
         Collection<String> dejadoDeSeguir = new HashSet<String>();
         Collection<String> comenzadoASeguir = new HashSet<String>();
		


		
         different.addAll( listaAntigua );
         different.addAll( listaNueva );

         similar.retainAll( listaNueva );
         different.removeAll( similar );
		
		
//         System.out.println("Similares:"+similar.size());
//         System.out.println(similar);
         

     for (int i = 0; i <listaAntigua.size(); i++) {
    	 
    	 if (listaNueva.contains(listaAntigua.get(i))) { // No se ha movido el seguido
			
		}
    	 else {	//He dejado de seguir a este usuario
			dejadoDeSeguir.add(listaAntigua.get(i));
		}
		
	}
     
     
     
     
     
     
     
     for (int i = 0; i <listaNueva.size(); i++) {
    	 
    	 if (listaAntigua.contains(listaNueva.get(i))) {	 // No se ha movido el seguido
    	 }
    	 else { // he comenzado a seguir
			comenzadoASeguir.add(listaNueva.get(i));
		}
    	 
    	 
    	 
    	 
    	 
     }
     
     
     System.out.println("He dejado de seguir a: "+dejadoDeSeguir.size());
     System.out.println(dejadoDeSeguir);
     
     System.out.println("He comenzado a seguir a: "+comenzadoASeguir.size());
     System.out.println(comenzadoASeguir);
     
     
     
     
     
     
  
	
	}
}
