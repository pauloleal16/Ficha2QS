package ex1;

public class Utente {

//variaveis
	
	private String nome;
	private String genero;
	private int idade;
	private float altura;
	private int peso;
	
	private float imc;

//gets e sets
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
	
	public float getImc() {
		return imc;
	}
	
	
//construtor
	public Utente(String nome, String genero, int idade, float altura, int peso) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		//this.imc = imc;
	}
	
	
	@Override
	public String toString() {
		
		return "\n --> Utente: \n Nome=" + nome + ", \n Genero=" + genero + ", \n Idade=" + idade + ", \n Altura=" + altura + ", \n Peso="
				+ peso + "\n IMC=" + imc;
	}
}
	