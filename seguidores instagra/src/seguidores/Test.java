package seguidores;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IOException {

		String fileSeguidos = "ficheros/SeguidosAGP.txt";
		String fileSeguidores = "ficheros/SeguidoresAGP.txt";
		
		String fileSeguidos2 = "ficheros/Seguidos3.txt";
		String fileSeguidores2 = "ficheros/Seguidores3.txt";

		List<String> mutuos = new ArrayList<String>();
		List<String> noMeSigue = new ArrayList<String>();
		List<String> noLoSigo = new ArrayList<String>();

		List<String> lsSeguidos = Seguidos.listaSeguidos(fileSeguidos);
		List<String> lsSeguidores = Seguidores.listaSeguidores(fileSeguidores);

		List<String> lsSeguidos2 = Seguidos.listaSeguidos(fileSeguidos2);
		List<String> lsSeguidores2 = Seguidores.listaSeguidores(fileSeguidores2);
		
		for (int i = 0; i < lsSeguidos.size() - 1; i++) {

			String seguido = lsSeguidos.get(i);
			if (lsSeguidores.contains(seguido)) {

				mutuos.add(seguido);

			} else {
				noMeSigue.add(seguido);
			}

		}

		for (int i = 0; i < lsSeguidores.size() - 1; i++) {
			String seguidor = lsSeguidores.get(i);
			if (lsSeguidos.contains(seguidor)) {

			}

			else {
				noLoSigo.add(seguidor);
			}
		}

		
		
		System.out.println("Elige una opcion de las siguientes: ");

		System.out.println("1) Resumen de cuenta");
		System.out.println("2) Quien no me sigue");
		System.out.println("3) A quien no sigo");
		System.out.println("4) Seguidores mutuos");
		System.out.println("5) Lista de seguidos");
		System.out.println("6) Lista de seguidores");
		System.out.println("7) Comparador de seguidos");
		System.out.println("8) Comparador de seguidores");
		System.out.println(
				"Para salir de la aplicaion, pulsar 9), si quiere elegir otra opcion introduce cualquier caracter");
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		String eleccion = reader.next();

		 
		switch (eleccion) {
		case "1":
			System.out.println("-----------------------------------");
			System.out.println("RESUMEN");
			System.out.println("-----------------------------------");
			System.out.println("SEGUIDORES TOTALES: " + lsSeguidores.size());
			System.out.println("SEGUIDOS TOTALES: " + lsSeguidos.size());
			System.out.println("No sigo a: " + noLoSigo.size());
			System.out.println("No me siguen: " + noMeSigue.size());
			System.out.println("Seguidores mutuos: " + mutuos.size());
			eleccion = reader.next();
			break;
		case "2":
			System.out.println("-----------------------------------");
			System.out.println("LISTA DE TRAIDORES TOTALES: " + noMeSigue.size());
			System.out.println("-----------------------------------");
			for (int i = 0; i < noMeSigue.size(); i++) {
				System.out.println(noMeSigue.get(i));
			}
			eleccion = reader.next();
			break;
		case "3":

			System.out.println("-----------------------------------");
			System.out.println("LISTA DE FANS TOTALES: " + noLoSigo.size());
			System.out.println("-----------------------------------");
			for (int i = 0; i < noLoSigo.size(); i++) {
				System.out.println(noLoSigo.get(i));
			}
			eleccion = reader.next();
			break;
		case "4":
			System.out.println("-----------------------------------");
			System.out.println("LISTA DE SEGUIDORES MUTUOS: " + mutuos.size());
			System.out.println("-----------------------------------");
			for (int i = 0; i < mutuos.size(); i++) {
				System.out.println(mutuos.get(i));
			}
			eleccion = reader.next();
			break;
		case "5":

			System.out.println("-----------------------------------");
			System.out.println("LISTA DE SEGUIDOS TOTALES: " + lsSeguidos.size());
			System.out.println("-----------------------------------");
			for (int i = 0; i < lsSeguidos.size(); i++) {
				System.out.println(lsSeguidos.get(i));
			}

			eleccion = reader.next();
			break;

		case "6":

			System.out.println("-----------------------------------");
			System.out.println("LISTA DE SEGUIDORES TOTALES: " + lsSeguidores.size());
			System.out.println("-----------------------------------");
			for (int i = 0; i < lsSeguidores.size(); i++) {
				System.out.println(lsSeguidores.get(i));
			}
			eleccion = reader.next();
			break;
		case "7":
			ComparadorListasSeguidos.main(args, lsSeguidos, lsSeguidos2);
			System.out.println("");


			break;
		case "8":

			ComparadorListasSeguidores.main(args, lsSeguidores, lsSeguidores2);
			System.out.println("");

			break;

		case "9":

			System.out.println("Gracias por usar la aplicación ;)");

			break;
		}

		if (!(eleccion.equals("9"))) {
			Test.main(args);
		}

	}

}
