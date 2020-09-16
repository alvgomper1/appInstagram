package seguidores;

import java.util.ArrayList;
import java.util.List;

import us.lsi.common.Files2;

public class ComparadorListasSeguidores {

	public static void main(String[] args,List<String> seguidoresAntiguos, List<String> seguidoresNuevos) {

		List<String> nuevoSeguidor = new ArrayList<String>();
		List<String> yaNoMeSigue = new ArrayList<String>();

//		String ficheroAntigua = "ficherosComparar/seguidores.txt";
//		String ficheroNueva = "ficherosComparar/seguidores2.txt";

		List<String> listaAntigua = seguidoresAntiguos;
		List<String> listaNueva = seguidoresNuevos;
		

		for (int i = 0; i < listaAntigua.size(); i++) {

			if (listaNueva.contains(listaAntigua.get(i))) { // Sigue el seguidor como antes
			} else { // Lo he dejado de seguir

				yaNoMeSigue.add(listaAntigua.get(i));
			}

		}

		for (int j = 0; j < listaNueva.size(); j++) {

			if (listaAntigua.contains(listaNueva.get(j))) { // Sigue el seguidor como antes
			} else {
				nuevoSeguidor.add(listaNueva.get(j));
			}

		}

		System.out.println("--------------------------------------------------");
		System.out.println("Me han dejado de seguir " + yaNoMeSigue.size());
		System.out.println("--------------------------------------------------");

		for (int i = 0; i < yaNoMeSigue.size(); i++) {
			System.out.println(yaNoMeSigue.get(i));

		}

		System.out.println("--------------------------------------------------");
		System.out.println("Me han seguido " + nuevoSeguidor.size());
		System.out.println("--------------------------------------------------");
		for (int i = 0; i < nuevoSeguidor.size(); i++) {
			System.out.println(nuevoSeguidor.get(i));

		}

		System.out.println(" ");System.out.println(" ");System.out.println(" ");
	}

}
