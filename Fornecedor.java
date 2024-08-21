package Aula_12;

public class Fornecedor {

	
		int id;
		String razaoSocial;
		String nomefantasia;
		String CNPJ;
		String endereco;
		String fone;
		String email;
		
		String incrinçaoEstadual;
		public String getRazaoSocial() {
			return razaoSocial;
		}
		public void setRazaoSocial(String razaoSocial) {
			this.razaoSocial = razaoSocial;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getnomefantasia() {
			return nomefantasia;
		}
		public void setnomefantasia(String nomefantasia) {
			this.nomefantasia = nomefantasia;
		}
		public String getCnpj() {
			return CNPJ;
		}
		public void setCnpj(String CNPJ) {
			this.CNPJ = CNPJ;
		}
		public String getendereco() {
			return endereco;
		}
		public void setendereco(String endereco) {
			this.endereco = endereco;
		}
		public String getFone() {
			return fone;
		}
		public void setFone(String fone) {
			this.fone = fone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getIncrinçaoEstadual() {
			return incrinçaoEstadual;
		}
		public void setIncrinçaoEstadual(String incrinçaoEstadual) {
			this.incrinçaoEstadual = incrinçaoEstadual;
		}
		public String vender() {
			return "vender";
		}
		public String carregar() {
			return "carregar";
		}
		public String comunicar() {
			return "comunicar";
		}
		public String promover() {
			return "promover";


		}

	}
