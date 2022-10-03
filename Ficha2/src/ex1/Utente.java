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
	
// método calcular e definir imc
	public void imc() {
		
		imc = peso/(altura*altura);
		
		System.out.printf ("IMC : " + imc + "\n");
		
		if (imc <= 19) {
	        System.out.println ("Abaixo do peso normal");}
			
	    else
	        if ((imc > 19) && (imc <=25)) {
	            System.out.println ("Peso normal");}
	    else        
	        if ((imc > 25.0)&& (imc <=30)) {
	            System.out.println("Excesso de peso");}
				
		else 
			if ((imc > 30)){
	            System.out.println("Obeso");
	            }
	}

//método para avaliar o estado de saude do utente
	public void estado(int p, float a) {
		
		double pesoIdeal = 0;
		double limiteInf = 0;
		double limiteSup = 0;
		
		imc = peso/(altura*altura);
		
		System.out.printf ("IMC : " + imc + "\n");
		
		if (imc <= 19) {
			pesoIdeal = 22 * altura * altura;
			System.out.println("O peso ideal para a sua altura é: " + pesoIdeal + " kgs.");}
	    else
	        if ((imc > 19) && (imc <=25)) {
	            limiteInf = 19 * altura * altura;
	            limiteSup = 25 * altura * altura;
				System.out.println("O peso deve estar entre " + limiteInf + " kgs e os " + limiteSup + " kgs.");}
	    else
	        if ((imc > 25.0)&& (imc <=30)) {
				pesoIdeal = 22 * altura * altura;
				System.out.println("O peso ideal para a sua altura é: " + pesoIdeal + " kgs.");}
		else {
	            pesoIdeal = 22 * altura * altura;
				System.out.println("O peso ideal para a sua altura é: " + pesoIdeal + " kgs.");}
	
	}
}
	