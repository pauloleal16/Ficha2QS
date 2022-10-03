package ex1;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * @author Paulo
 *
 */
/**
 * @author Paulo
 *
 */
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//criar arraylist
		ArrayList <Utente> u = new ArrayList<Utente>();
		
		Scanner input = new Scanner(System.in);
		
		menu();
        System.out.println("Selecione uma opção");
        int opcao = input.nextInt();
        while (opcao != 0){
            switch (opcao)
        {
            case 1:{
	            	System.out.println("Insira o seu nome");
					String nome = input.next();
					
					for(int i = 0;i<u.size();i++)
                	{
                		if(u.get(i).getNome().equals(nome))
                		{
                			System.out.println("O nome escolhido já existe. ");
                			System.out.println("Insira um novo nome. ");
                			nome = input.next();
                		}               		
                	}
					
					System.out.println("Insira o seu género");
					String genero = input.next();
					System.out.println("Insria a sua idade");
					int idade = input.nextInt();
					System.out.println("Insria a sua altura");
					float altura = input.nextFloat();
					System.out.println("Insria o seu peso");
					int peso = input.nextInt();	
					
					Utente novoUtente = new Utente(nome, genero, idade, altura, peso);
					u.add(novoUtente);
					novoUtente.imc();
                   } 
                   break;
            case 2:{
            		 for(int i = 0; i < u.size(); i ++){
            	             System.out.println(u.get(i));      
            		 }
            }
            break;
            case 3:{
            		System.out.println("Insira o  nome do utente a pesquisar");
            		String n = input.next(); 
            		for(int i = 0; i < u.size(); i ++){
            			
            			if(u.get(i).getNome().equals(n)) {
            					Utente temp = u.get(i);
            					System.out.println(u.get(i).toString());
            				
            					if (temp.getImc() <= 19)
            						System.out.println (" Abaixo do peso normal");
            					else
            						if ((temp.getImc() > 19) && (temp.getImc() <=25))
            			            System.out.println (" Peso normal");
            					else
            						if ((temp.getImc() > 25.0)&& (temp.getImc() <=30))
            			    	   System.out.println(" Excesso de peso");
            			       else
            			    	   if ((temp.getImc() > 30))
            			            System.out.println(" Obeso");	
            			}
            				else {System.out.println("O utente não encontrado.");}
            			}
            		}
                    break;
            case 4:{
            	int exist = 0;
            	System.out.println("Insira o nome de utente para ver o seu estado de saúde:");
            	String no = input.next();
            	for(int i = 0;i<u.size();i++)
            	{
            		if(u.get(i).getNome().equals(no))
            		{
            			exist = 1;
            			int p = u.get(i).getPeso();
            			float a = u.get(i).getAltura();
            			u.get(i).estado(p, a);
            		}
            	}
            	if(exist == 0)
        		{
        			System.out.println("Utente não encontrado");
        		}
            }
            	break;
            	
            case 5:{
            	System.out.println("Insira o número do utente que pretende alterar:");
                String nome = input.next();
                System.out.println("Insira o novo peso:");
                int pesoNovo = input.nextInt();
  
                for(int i = 0;i<u.size();i++)
            	{
                	if(u.get(i).getNome().equals(nome))
            		{
                		Utente temp = u.get(i);
                		temp.setPeso(pesoNovo);
                		System.out.println("Peso alterado");}
            	}
            	}   
               
            
             break;
             
            default:{System.out.println("A opção que escolheu não existe.");}
        }//Fim switch
        menu();
        opcao = input.nextInt();
        }}
        
     
	/**
	 * menu de apresentação definido
	 * 
	 **/
	
	public static void menu()
	{
		System.out.println("\n*********Menu********");
		System.out.println("1 --> Calcular IMC.");
		System.out.println("2 --> Imprimir lista de Utentes");
		System.out.println("3 --> Pesquisar utente");
		System.out.println("4 --> Verificar estado de saúde de utente");
		System.out.println("5 --> Alterar peso de utente");
		System.out.println("0 --> Terminar");
		System.out.println("**********************");
	
	}//fim do metodo menu
	
	
}