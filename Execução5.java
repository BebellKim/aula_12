package Aula_12;

import Aula_12.Funcionario;


public class Execução5 {

	public static void main(String[] args) {
		 Funcionario Funcionario= new Funcionario();

		Funcionario.setNome("Isabella");
		Funcionario.setUsuario("Adm");
		Funcionario.setSenha("234678");
		Funcionario.setPermissao("Permitido navegar dados!");
		Funcionario.setID(165157 - 8);
		
		
		System.out.println("                 Computador        ");
		System.out.println("* Nome: " + Funcionario.getNome());
		System.out.println("* Usuario: " + Funcionario.getUsuario());
		System.out.println("* Senha: " + Funcionario.getSenha());
		System.out.println("* Permissao: " + Funcionario.getPermissao());
        System.out.println("* ID: " + Funcionario.getID());
		
		System.out.println("                 Ações         ");
		System.out.println(Funcionario.Cadastrar());
		System.out.println(Funcionario.Acessar());
		System.out.println(Funcionario.Procurar());
		System.out.println(Funcionario.Navegar());
	


	}

}
