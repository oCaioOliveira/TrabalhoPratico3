package principal;

import java.util.*;

public class ClienteVIP extends Pessoa {
	
	// ----------------- ATRIBUTOS ----------------- //
	
	private String generoFavorito;
	private int qntddFilmesVistos;
	private String planoAssinatura;
	
	public ClienteVIP(){
		super();
	}
	
	// ---------------- CONSTRUTOR ---------------- // 
	
	// Sobrecarga
	public ClienteVIP(String primNome, String ultNome, String data, String c, String numCel, String email, String genFav, int qntddFilmesVistos, String planAss) {
		primeiroNome = primNome;
		ultimoNome = ultNome;
		dataNascimento = data;
		cpf = c;
		numCelular = numCel;
		this.email = email;
		generoFavorito = genFav;
		this.qntddFilmesVistos = qntddFilmesVistos;
		planoAssinatura = planAss;
	}
	
	public ClienteVIP(String primNome, String ultNome, String data, String c, String numCel, String email) {
		primeiroNome = primNome;
		ultimoNome = ultNome;
		dataNascimento = data;
		cpf = c;
		numCelular = numCel;
		this.email = email;
	}
	
	// ------------------ METODOS ------------------- //
	
	// Funcionalidades:
	
	Scanner input = new Scanner(System.in);	
	ArrayList<ClienteVIP> dadosCliente = new ArrayList<ClienteVIP>();
	
	// Pr�-cadastro de dados do cliente:
	
	public void dadosPreCadastradosClientes() {
		ClienteVIP cliente1 = new ClienteVIP("Caio", "Oliveira", "19/10/2001", "014.123.456-43", "(61)-99321-4506", "caioOliveira@hotmail.com", "A��o", 5, "Mensal");
		ClienteVIP cliente2 = new ClienteVIP("Lucas", "Queiroz", "23/08/2001", "324.576.472-04", "(61)-99431-4792", "lucasQueiroz@hotmail.com", "Com�dia", 3, "Anual");
		ClienteVIP cliente3 = new ClienteVIP("Joana", "Barboza", "01/01/1999", "577.165.890-81", "(62)-98232-9175", "joanaBarboza@gmail.com", "Aventura", 10, "Semestral");
		ClienteVIP cliente4 = new ClienteVIP("Maicon", "Torres", "10/09/2002", "768.019.355-91", "(61)-98651-0194", "maiconTorres@hotmail.com", "Terror", 2, "Mensal");
		ClienteVIP cliente5 = new ClienteVIP("Maria", "Monaliza", "07/12/1998", "943.987.185-01", "(62)-99184-0192", "mariaMonaliza@hotmail.com", "Policial", 20, "Mensal");
		
		dadosCliente.add(cliente1);
		dadosCliente.add(cliente2);
		dadosCliente.add(cliente3);
		dadosCliente.add(cliente4);
		dadosCliente.add(cliente5);
	}
	
	public void cadastrar() {
		
	}
	
	// Funcao para editar os dados de Cliente:
	
	public void editar(ClienteVIP cliente) {
		
		int num = 0;
		
		do {
			System.out.println("Selecione a op��o desejada:\n"
					+ "1-Editar o n�mero de celular\n"
					+ "2-Editar o gen�ro favorito\n"
					+ "3-Editar o e-mail\n"
					+ "4-Editar a quantidade de filmes vistos\n"
					+ "5-Editar o plano de assinatura\n"
					+ "6-Sair\n");
			
			num = input.nextInt();
			
			switch (num) {
				
				case 1: 
					System.out.println("Digite o novo n�mero de celular do cliente:\n");
					cliente.setNumCelular(input.nextLine());
					break;
				case 2:
					System.out.println("Digite o novo g�nero favorito do cliente:\n");
					cliente.setGeneroFavorito(input.nextLine());
					break;
				case 3:
					System.out.println("Digite o novo e-mail:\n");
					cliente.setEmail(input.nextLine());
					break;
				case 4:
					System.out.println("Digite a nova quantidade de filmes vistos do cliente:\n");
					cliente.setQntddFilmesVistos(input.nextInt());
					break;
				case 5:
					System.out.println("Digite o novo plano de assinatura do cliente:\n");
					cliente.setPlanoAssinatura(input.nextLine());
					break;
				case 6:
					System.out.println("Retornando ao menu\n");
					break;
				default:
					System.out.println("N�o foi escolhida nenhuma op��o v�lida\n"
									   + "Por favor insira um n�mero novamente");
					break;
					
			}
		} while (1 > num || num > 6);
			
	}
	
	public void deletar(ClienteVIP[] cliente, String cpf) {
		
	}
	
	public String toString() {	
		return "Nome do cliente VIP: " + primeiroNome;
	}
	
	// ------------ GETTERS AND SETTERS ------------ //
	
	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNumCelular() {
		return numCelular;
	}

	public void setNumCelular(String numCelular) {
		this.numCelular = numCelular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getGeneroFavorito() {
		return generoFavorito;
	}
	
	public void setGeneroFavorito(String generoFavorito) {
		this.generoFavorito = generoFavorito;
	}
	
	public int getQntddFilmesVistos() {
		return qntddFilmesVistos;
	}
	
	public void setQntddFilmesVistos(int qntddFilmesVistos) {
		this.qntddFilmesVistos = qntddFilmesVistos;
	}
	
	public String getPlanoAssinatura() {
		return planoAssinatura;
	}
	
	public void setPlanoAssinatura(String planoAssinatura) {
		this.planoAssinatura = planoAssinatura;
	}
		
	
}
