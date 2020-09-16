package seguidores;

import java.util.ArrayList;
import java.util.List;
import us.lsi.common.Files2;

public class Seguidores {

	public static List<String> listaSeguidores(String file) {

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

}
