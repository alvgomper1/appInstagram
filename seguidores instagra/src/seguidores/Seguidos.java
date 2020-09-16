package seguidores;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import us.lsi.common.Files2;

public class Seguidos {

// String file = "ficheros/Seguidos.txt";
//	List<String> ls = Files2.getLines(file);

	public static List<String> listaSeguidos(String file) throws IOException {

		List<String> ls = Files2.getLines(file);

		List<String> aux = new ArrayList<String>();

		for (int i = 0; i < ls.size() ; i++) {

			if (ls.get(i).startsWith("Foto del perfil")) {

				String username = ls.get(i).replace("Foto del perfil de ", "");
				aux.add(username);

			}

		}

		return aux;

	}

	public static String convierteListaEnString(List<String> ls) {
		String res = ls.get(0) + "\n";
		for (int j = 1; j < ls.size(); j++) {

			if (j == ls.size() - 1) {
				res = res + ls.get(j);
			} else {

				res = res + ls.get(j) + "\n";
			}
		}

		return res;

	}
}
