package seguidores;

import java.util.List;

public class ConvertirTxtToLista {  //21 seguidores menos, 304 seguidos menos

	public static void main(String[] args) {
		String fileSeguidos = "ficheros/Seguidos.txt"; // Modificar esta linea para poner el archivo que desea
															// convertir
		List<String> listaResultado = Seguidores.listaSeguidores(fileSeguidos);
		System.out.println("-----------------------------------");
		System.out.println("Hay " + listaResultado.size() + " usuarios en la lista");
		System.out.println("-----------------------------------");
		for (int i = 0; i < listaResultado.size(); i++) {
			System.out.println(listaResultado.get(i));
		}

	
	}

}
/*
 * AQUI INGRESAMOS EL TXT RECION COPIADO DESDE INSTAGRAM(QUE LLEVA LA LINEA DE
 * FOTO DE PERFIL, NOMBRE DE USUARIO, BIOGRAFIA). LA RUTA DEL TXT LA PONEMOS EN
 * LA PRIMERA LINEA, CAMBIANDO "seguidosCLG2" POR TU ARCHIVO TXT. UNA VEZ
 * CAMBIADO EL ARCHIVO SE MOSTRARÁ LA LISTA CON TODOS LOS NOMBRES DE USUARIO Y
 * SE GUARDARÁ EN LA VARIABLE "listaResultado"
 */