package Aula_12;

public class Computador {



	String Cor;
	String Modelo;
	String Marca;
	int ID;

	public String getCor() {
		return Cor;

	}
	public void setCor(String Cor) {
		this.Cor = Cor;
	}
	public String getModelo() {
		return Modelo;

	}
	public void setModelo(String Modelo) {
		this.Modelo = Modelo;
	}

	public String getMarca() {
		return Marca;

	}
	public void setMarca(String Marca) {
		this.Marca = Marca;
	}

	public int getID() {
		return ID;

	}
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public String Ligar() {
		return "Ligar";
	}
	public String Reiniciar() {
		return "Reiniciar";
	}
	public String Processar() {
		return "Processar";
	}
	public String Desligar() {
		return "Desligar";
	}





}


