
public class Main {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa("Igor", 29, 180, 79);
		
		pessoa1.setIdade(16);
		
		System.out.println("A pessoa " + pessoa1.getNome() + " foi cadastrada com sucesso");
	}
	

}
