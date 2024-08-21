package Aula_12;

public class Funcionario {

	
		String Nome;
		String Usuario;
		String Senha;
		String Permissao;
		int ID;

		public String getNome() {
			return Nome;

		}
		public void setNome(String Nome) {
			this.Nome = Nome;
		}
		public String getUsuario() {
			return Usuario;

		}
		public void setUsuario(String Usuario) {
			this.Usuario = Usuario;
		}

		public String getSenha() {
			return Senha;

		}
		public void setSenha(String Senha) {
			this.Senha = Senha;
		}
		public String getPermissao() {
			return Permissao;

		}
		public void setPermissao(String Permissao) {
			this.Permissao = Permissao;
		}

		public int getID() {
			return ID;

		}
		public void setID(int ID) {
			this.ID = ID;
		}
		
		public String Cadastrar() {
			return "Cadastrar";
		}
		public String Acessar() {
			return "Acessar";
		}
		public String Procurar() {
			return "Procurar";
		}
		public String Navegar() {
			return "Navegar";
		}

	}


