package Aula_12;

import Aula_12.Computador;

public class Execução4 {

	public static void main(String[] args) {
		Computador Computador = new Computador();

		Computador.setCor("Cinza");
		Computador.setModelo("Oplipex");
		Computador.setMarca("Dell");
		Computador.setID(165157 - 8);


		System.out.println("                 Computador        ");
		System.out.println("* Cor: " + Computador.getCor());
		System.out.println("* Modelo: " + Computador.getModelo());
		System.out.println("* Marca: " + Computador.getMarca());
		System.out.println("* ID: " + Computador.getID());

		System.out.println("                 Ações         ");
		System.out.println(Computador.Ligar());
		System.out.println(Computador.Reiniciar());
		System.out.println(Computador.Processar());
		System.out.println(Computador.Desligar());
	}
}




