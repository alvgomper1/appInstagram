package seguidores;

import java.util.ArrayList;
import java.util.List;

import us.lsi.common.Files2;

public class ComparadorListasSeguidos {

	public static void main(String[] args, List<String> seguidosAntiguos, List<String> seguidosNuevos) {

		List<String> nuevoSeguido = new ArrayList<String>();
		List<String> yaNoSigo = new ArrayList<String>();

//		String ficheroAntigua = "ficherosComparar/seguidosAGP.txt";
//		String ficheroNueva = "ficherosComparar/seguidosAGP2.txt";

		List<String> listaAntigua = seguidosAntiguos;
		List<String> listaNueva = seguidosNuevos;

		for (int i = 0; i < listaAntigua.size(); i++) {

			if (listaNueva.contains(listaAntigua.get(i))) { // Sigue el seguidor como antes
			} else { // Lo he dejado de seguir

				yaNoSigo.add(listaAntigua.get(i));
			}

		}

		for (int j = 0; j < listaNueva.size(); j++) {

			if (listaAntigua.contains(listaNueva.get(j))) { // Sigue el seguidor como antes
			} else {
				nuevoSeguido.add(listaNueva.get(j));
			}

		}

		System.out.println("--------------------------------------------------");
		System.out.println("He dejado de seguir a " + yaNoSigo.size());
		System.out.println("--------------------------------------------------");

		for (int i = 0; i < yaNoSigo.size(); i++) {
			System.out.println(yaNoSigo.get(i));

		}

		System.out.println("--------------------------------------------------");
		System.out.println("he comenzado a seguir a " + nuevoSeguido.size());
		System.out.println("--------------------------------------------------");
		for (int i = 0; i < nuevoSeguido.size(); i++) {
			System.out.println(nuevoSeguido.get(i));

		}

	}

}
