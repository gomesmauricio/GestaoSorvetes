import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Inicio {

	public static void main(String[] args) {
		ArrayList<Sorvete> listaSorvetes = new ArrayList<Sorvete>();
		Scanner s = new Scanner(System.in);
		
		Sorvete sorvete = new Sorvete();
		
		int opcao;
		int testaCondicao = 0;
		
		do {
			System.out.println("=====Gestão de Sorvetes===============\n");
			System.out.println("=====Gidite 1 para cadastrar==========");
			System.out.println("=====Gidite 2 para Listar Todos=======");
			System.out.println("=====Gidite 3 para Listar Remover=====");
			System.out.println("=====Gidite 4 para sair===============");
			opcao = s.nextInt();
			s.nextLine();
			
			switch (opcao) {
			case 1:
				sorvete = new Sorvete();
				System.out.println("========Cadastrar Sorvete=========\n");
				System.out.println("Informe o Sabor: ");
				sorvete.setSabor(s.nextLine());
				System.out.println("Informe o Tamanho: "+ "ml");
				sorvete.setTamanho(s.nextInt());
				System.out.println("Informe o valor de Venda: ");
				sorvete.setValor(s.nextDouble());
				System.out.println("Inofome Quantos tem no esque: ");
				sorvete.setEstoque(s.nextInt());
				
				listaSorvetes.add(sorvete);
			break;
				
			case 2:
				System.out.println("=======Lista de Sorvetes======");
				
				for (Sorvete sorvetes : listaSorvetes) {
					System.out.println("Sabor: "+sorvete.getSabor());
					System.out.println("Tamanho: "+sorvete.getTamanho()+"ml");
					System.out.println("Preço: "+sorvete.getValor());
					System.out.println("Unidades no Estoque: "+sorvete.getEstoque());
					
					
				}
				
				break;
				
			case 3:
				System.out.println("******Remoção do Sorvete******");
				System.out.println("Digite o Sabor");
				String newSabor = s.nextLine();
				for (int i = 0; i < listaSorvetes.size(); i++) {
					if (listaSorvetes.get(i).getSabor().equals(newSabor)) {
						listaSorvetes.remove(i);
						System.out.println("Sorvete Removido!");
					} else {
						System.out.println("Sorvete não encontrado!");
					}
				}
				break;
				
			case 4:
				
				System.out.println("VOLTE SEMPRE!");
				
				testaCondicao = 2;
				break;
				
			
				default:
					System.out.println("***Opcao Inválida!***");
					break;
			
			}
			
			if(opcao !=4) {
				
				System.out.println("\nFazer outra operação?\n1- sim\n2-não");
				testaCondicao = s.nextInt();
				
			}else {
				System.out.println("Volte Sempre");
			}
		
		
		
		
//		sorvete.setSabor("Amendoim");
//		sorvete.setTamanho(150);
//		sorvete.setValor(4.50);
//		sorvete.setEstoque(200);
//		
//		listaSorvetes.add(sorvete);
		
		}while (testaCondicao == 1);
	}
}