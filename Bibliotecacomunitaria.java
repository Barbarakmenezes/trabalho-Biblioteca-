package biblio;

import java.util.ArrayList;
import java.util.Scanner;


public class Bibliotecacomunitaria {

	public static void main(String[] args) {
	
		int l;
		Scanner leia = new Scanner(System.in);
		
	

		ArrayList<String> estoque = new ArrayList(); //Collection


		ArrayList<String> estoquel = new ArrayList(); //Collection
		estoquel.add("\n \tR O M A N C E S \n"); 
		estoquel.add("\nUm dia  (David Nicholls)");
		estoquel.add("\nSimplesmente acontece (Cecelia Ahern)");
		estoquel.add("\nComo Eu Era Antes de Você (Jojo Moyes)");
		estoquel.add("\nPs: Eu Te Amo (Cecelia Ahern) \n ");
		estoquel.add("\n \t S U S P E N S E \n");
        estoquel.add("\nMorte no Nilo (Agatha Christie)");
		estoquel.add("\nOs Homens Que Não Amavam As Mulheres (Stieg Larsson)");
		estoquel.add("\nIlha do Medo (Dennis Lehane) \n ");
		estoquel.add ("\n \t L I T E R A T U R A\n ");
		estoquel.add("\nDom Casmurro ( Machado de Assis)");
		estoquel.add("\nO Cortiço ( Aluísio Azevedo)");
		estoquel.add("\nMemórias Póstumas de Brás Cubas(Machado de Assis)");
		estoquel.add("\nA moreninha (Joaquim Manuel de Macedo)");                    
		

   System.out.println(":: S I S T E M A  D E  B I B L I O T E C A ::");
    
   System.out.println("Bem-vinde(s) ao sistema:");
   
   
   System.out.println("Coloque seu nome : ");
   String usuario=leia.nextLine();
   System.out.println("Coloque seu e-mail: ");
   String Email=leia.nextLine();
   
   
   
   
   
   
   
// FAZER MENU
		do 
		{
			

			System.out.println();

			System.out.println("--------MENU-----------");

			System.out.println("\n (1) Deseja doar livros.");
			System.out.println("\n (2) Deseja retirar qual livro.");
			System.out.println("\n (3) Deseja trocar com algum livro do estoque");
			System.out.println("\n (4) Deseja mostrar todos os produtos do estoque");
			System.out.println("\n (5) Deseja doar livros.");
			System.out.println("\n (0) Deseja encerrar o programa");
			System.out.println("\n Digite a sua opção");
			
			l = leia.nextInt();


			switch(l)

			{

			case 1: //DOAÇÃO

				leia.nextLine(); //NEXTLINE - USOU PARA LIMPAR
				System.out.println("\n Digite o nome do livro que deseja doar: ");
				String livros = leia.nextLine();// NEXTLINE - PARA LER UMA COISA TIPO STRING
				
				System.out.println("\n Qual o gênero do seu livro?");
				String genero = leia.nextLine();
				System.out.println("\n Qual o autor do seu livro?");
				String autor = leia.nextLine();
				System.out.println("\n Qual a editora do seu livro?");
				String editora = leia.nextLine();
				System.out.println("\n Escreva um código para o seu livro?");
				int codigoDoLivro = leia.nextInt();
				estoquel.add(livros); //USUARIO VAI ESCREVER E AQ VAI ADICIONAR AO ESTOQUE

				leia.nextLine(); //NEXTLINE - USOU PARA LIMPAR
                 System.out.println("PARABÉNS, "+ usuario +"."+" Você acabou de doar para nossa Biblioteca. \n O livro: \n" + livros +" autor:" + autor);   
				 System.out.println("\n Enviamos um comprovante para o seu e-mail : "+ Email+"!");
				break;


			case 2 : //RETIRAR

				leia.nextLine();

				System.out.println(estoquel); //MOSTRAR O ESTOQUE de livros PARA VISUALIZAÇÃO
				leia.nextLine(); 

				System.out.println("\n Digite o livro que quer retirar do estoque: ");
				String livro = leia.nextLine();

				if(estoque.contains(livro)) //CONTAINS - VER SE EXISTE DETERMINADO PRODUTO PARA REMOVER
				{
					estoque.remove(livro);
				}
				System.out.println("\n"+ usuario+ ","+ " Produto removido com sucesso!!"+ "\n Você retirou o livro :" + livro + "\n Seu prazo de entrega é de 30 dias!!!");
				System.out.println("\n Enviamos um comprovante para o seu e-mail:" + Email+"!");
				
				
				break;

			case 3: //TROCAR
				//QUAL PRODUTO VAI TIRAR E QUAL VAI COLOCAR
				//MAS TEM QUE VERIFICAR SE TEM E ATUALIZAR
				//MAS PODE SER QUE O PRODUTO NÃO TENHA NO ESTOQUE

				leia.nextLine();
				System.out.println(estoquel); //MOSTRAR O ESTOQUE DE LIVROS PARA VISUALIZAÇÃO
				
				System.out.println("\n Digite o livro que quer pegar do estoque: ");
				String verifica = leia.nextLine();
				System.out.println("\n Digite o nome do livro que você quer entregar: ");
				String novo = leia.nextLine();
			
				
				if(estoquel.contains(verifica)) { //CONTAINS - VER SE EXISTE DETERMINADO PRODUTO PARA REMOVER
				  estoquel.add(novo);
				  estoquel.remove(verifica);
				  }
					
				   else 
					System.out.println("\nProduto insdisponível !!!");
				
				System.out.println("\n"+ usuario +","+ "sua troca foi realizada!!! \n Você realizou a troca do livro:" + novo + "\n Pelo livro :" + verifica);
                System.out.println("Enviamos um comprovante para o seu e-mail:" + Email);
		//MOSTRAR A LISTA DNV PARA VER SE ATUALIZOU
				estoquel.add(novo);
				estoquel.remove(verifica);
				
				System.out.println(estoquel); 
				break;



			case 4: //MOSTRAR

					System.out.println("\n Os produtos no estoque são");
					System.out.println("Lista:" + estoquel); //MOSTRAR ESTOQUE
					break;
					
			
				

			case 0: System.out.println("\n Finalizou o Programa!!!");
					break;

					default : //EXEÇÃO

				System.out.println("Erro! Opção Indisponivel");
			}
		}

		while(l!=0); //ENQUANTO DIFERENTE DE 0 VAI SAIR

	}



	}


