package Aula_12;

import Aula_12.Fornecedor;

public class Execucao6 {

	public static void main(String[] args) {

		Fornecedor Fornecedor= new Fornecedor();

		Fornecedor.setRazaoSocial("vitalcare");
		Fornecedor.setnomefantasia("Isabella Kimberly EV");
		Fornecedor.setCnpj("234678");
		Fornecedor.setendereco("Av. Padre Antônio Brunetti");
		Fornecedor.setEmail("Isabellavassao@gmail.com");
		Fornecedor.setFone("23467-8234");
		Fornecedor.setIncrinçaoEstadual("457899");
		Fornecedor.setId(165157 - 8);


		System.out.println("                 Fornecedor       ");
		System.out.println("* RazaoSocial: " + Fornecedor.getRazaoSocial());
		System.out.println("* nomefantasia: " + Fornecedor.getnomefantasia());
		System.out.println("* Cnpj: " + Fornecedor.getCnpj());
		System.out.println("* Endereço: " + Fornecedor.getendereco());
		System.out.println("* Email: " + Fornecedor.getEmail());
		System.out.println("* Fone: " + Fornecedor.getFone());
		System.out.println("* IncrinçaoEstadual: " + Fornecedor.getIncrinçaoEstadual());

		System.out.println("* ID: " + Fornecedor.getId());

		System.out.println("                 Ações         ");
		System.out.println(Fornecedor.vender());
		System.out.println(Fornecedor.carregar());
		System.out.println(Fornecedor.comunicar());
		System.out.println(Fornecedor.promover());



	}




}

