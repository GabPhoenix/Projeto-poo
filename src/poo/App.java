// IFPE - GARANHUNS (ADS) 
// GABRIEL CARVALHO
// ISABEL PEREIRA
package poo;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        ArrayList<Loja> loja = new ArrayList<Loja>();
	        ArrayList<Produtos> produtos = new ArrayList<Produtos>();
	        ArrayList<Produtos> compra = new ArrayList<Produtos>();

	        // ADD PRODUTOS AO ESTOQUE
	        // produtos.add(new Produtos('nome', 12.00, 12))
	        produtos.add(new Produtos("Havaianas F", 25.00, 10));
	        produtos.add(new Produtos("Sandálias Coca Cola F", 25.00, 15));
	        produtos.add(new Produtos("Sandálias Colcci F", 25.00, 20));
	        produtos.add(new Produtos("Havaianas M", 28.00, 10));
	        produtos.add(new Produtos("Sandálias Lacoste M", 28.00, 15));
	        produtos.add(new Produtos("Sandálias Coca Cola", 28.00, 20));
	        produtos.add(new Produtos("Little tress Black Ice", 13.00, 20));
	        produtos.add(new Produtos("Little tress New Car Scent", 13.00, 20));
	        produtos.add(new Produtos("Little tress Lavander ", 13.00, 20));
	        produtos.add(new Produtos("Little tress Vannila Pride ", 13.00, 20));
	        produtos.add(new Produtos("Rin light led ", 49.99, 10));
	        produtos.add(new Produtos("Fone Bluetooth ", 60.00, 10));
	        produtos.add(new Produtos("Caixa de som Bluetooth ", 55.00, 20));
	        produtos.add(new Produtos("Carregador Portátil", 60.00, 8));
	        
	        // Variáveis
            @SuppressWarnings("unused")
	        String nomeCliente, cpf, nomeDoProduto;
            @SuppressWarnings("unused")
	        double preco;
            @SuppressWarnings("unused")
	        int id = 0, quantidade, opt, opt2=0, n=0, tentativas=0;

	        
	            System.out.println("[1] FAZER LOGIN \n"+
	                "[0] SAIR");
	            opt = sc.nextInt();
	            sc.nextLine();
	            if(opt == 1){
	            	try{
	            		int c = 1;
	            		while(c==1 && tentativas < 5) {
	            			System.out.println("Usuário: ");
			                String usuario = sc.nextLine();
			                System.out.println("Senha: ");
			                String senha = sc.nextLine();  
			                if(usuario.equals("admin") && senha.equals("1234")){
			                    n = 1;
			                    c += 1;
			                }
			                else {
			                	tentativas += 1;
			                	System.out.println("Dados invalidos");

			                }
	            		}
		                
	            	}catch(java.util.InputMismatchException IME) {
	            		System.out.println("Por favor, informe os dados novamete!");
	            	}
	            }

	            else
	                opt = 0;
	                do{
	                    if(n == 1) {
	                        System.out.println("[1] Listrar produtos em estoque \n"+
	                        "[2] Mostrar todos os produtos \n"+
	                        "[3] Realizar orçamento \n"+
	                        "[4] Realizar venda \n"+
	                        "[5] Mostar produtos em falta \n"+
	                        "[6] Cadastrar novo produto \n"+
	                        "[7] Atualizar estoque de algum produto \n"+
	                        "[0] Sair");
	                        opt = sc.nextInt();
	                        sc.nextLine();
	                        switch(opt){
	                            case 1:
	                            // Listrar produtos em estoque 
	                                for(int i=0; i<produtos.size(); i++){
	                                    if(produtos.get(i).getQuantidade()>0){
	                                        System.out.println("Nome: "+ produtos.get(i).getNomeDoProduto()+
	                                        "\n" + "Preço: "+ produtos.get(i).getPreco() + "\n" +
	                                        "Quantidade: " + produtos.get(i).getQuantidade());
	                                    } 
	                                }
	                                break;
	                            case 2:
	                                // Mostrar todos os produtos
	                                for(int i=0; i<produtos.size(); i++){
	                                    System.out.println("Nome: "+ produtos.get(i).getNomeDoProduto()+
	                                    "\n" + "Preço: "+ produtos.get(i).getPreco() + "\n" +
	                                    "Quantidade: " + produtos.get(i).getQuantidade());
	                                }
	                                break;
	                            case 3:
//	                            	REALIZAR ORÇAMENTO
	                            	 System.out.println("Informe o nome do Cliente: ");
		                                nomeCliente = sc.nextLine();
		                                System.out.println("Informe o cpf do cliente: ");
		                                cpf = sc.nextLine();
		                                
		                                while(opt2 != 2) {
		                                	System.out.println("Informe um produto para adicionar ao carrinho:");
		                                    String nomePd = sc.nextLine();
		                                    System.out.println("Informe a quantidade: ");
		                                    int quant = sc.nextInt();
		                                    for(int i=0; i<produtos.size(); i++){
	                                            if(produtos.get(i).getNomeDoProduto().equals(nomePd)){
	                                                String nome = produtos.get(i).getNomeDoProduto();
	                                                double precoPd = produtos.get(i).getPreco();
	                                                compra.add(new Produtos(nome, precoPd, quant));
	                                                System.out.println("Produto adicionado com sucesso");
	                                                System.out.println("Deseja adicionar mais algum produto? 1-sim/2-nao");
	                                                opt2 = sc.nextInt();
	                                                sc.nextLine();
	                                            }
	                                            else
	                                            	System.out.println("Produto não encontrado!");
	                                        }
		                                }
		                                
		                                id+=1;
		                                loja.add(new Orçamento(new Cliente(nomeCliente, cpf), id, compra));
		                                
		                                System.out.println("Produtos: ");
//		                                IMPRIMINDO PRODUTOS E TOTAL 
		                                for(int i=0;i<compra.size(); i++) {
		                                	System.out.println(compra.get(i).getNomeDoProduto() + " | "+
		                                			compra.get(i).getPreco());      
		                                	
//		                                	TOTAL
		                                	double total = 0;
		                                	total = total + compra.get(i).getPreco()*compra.get(i).getQuantidade();
		                                	System.out.println("_________________________");
		                                	System.out.println(total);
		                                	System.out.println("_________________________");
		                                }
		                                
		                                
		               
		                                break;
	                            case 4:
	                            	// REALIZAR VENDA
	                                System.out.println("Informe o nome do Cliente: ");
	                                nomeCliente = sc.nextLine();
	                                System.out.println("Informe o cpf do cliente: ");
	                                cpf = sc.nextLine();
	                                
	                                while(opt2 != 2) {
	                                	System.out.println("Informe um produto para adicionar ao carrinho:");
	                                    String nomePd = sc.nextLine();
	                                    System.out.println("Informe a quantidade: ");
	                                    int quant = sc.nextInt();
	                                    sc.nextLine();
	                                    for(int i=0; i<produtos.size(); i++){
                                            if(produtos.get(i).getNomeDoProduto().equals(nomePd)){
                                                String nome = produtos.get(i).getNomeDoProduto();
                                                double precoPd = produtos.get(i).getPreco();
                                 
                                                compra.add(new Produtos(nome, precoPd, quant));
                                                System.out.println("Produto adicionado com sucesso");
                                                System.out.println("Deseja adicionar mais algum produto? 1-sim/2-nao");
                                                opt2 = sc.nextInt();
                                                sc.nextLine();
                                            }
                                            else
                                            	System.out.println("Produto não encontrado!");
                                        }
	                                }
	                                
	                                id+=1;
	                                loja.add(new Venda(new Cliente(nomeCliente, cpf), id, compra));
	                                
	                                System.out.println("Produtos: ");
//	                                ATUALIZANDO O ESTOQUE, IMPRIMINDO PRODUTOS E TOTAL 
	                                for(int i=0;i<compra.size(); i++) {
	                                	for(int j=0; j<produtos.size(); j++) {
	                                		if(compra.get(i).getNomeDoProduto().equals(produtos.get(j).getNomeDoProduto())) {
	                                			produtos.get(j).setQuantidade(produtos.get(j).getQuantidade()-compra.get(i).getQuantidade());
	                                		}
	                                	}
	                                	
	                                	System.out.println(compra.get(i).getNomeDoProduto() + " | "+
	                                			compra.get(i).getPreco());      
	                                }
	                                for(int i=0; i<compra.size();i++) {
//	                                	TOTAL
	                                	double total = 0;
	                                	total+= compra.get(i).getPreco()*compra.get(i).getQuantidade();
	                                	System.out.println("_________________________");
	                                	System.out.println("total: "+ total);
	                                	System.out.println("_________________________");
	                                }
	                                
	               
	                                break;
	                                
	                            case 5:
	                                // Mostar produtos em falta
	                                for(int i=0; i<produtos.size(); i++){
	                                    if(produtos.get(i).getQuantidade()==0){
	                                        System.out.println("Nome: "+ produtos.get(i).getNomeDoProduto()+
	                                        "\n" + "Preço: "+ produtos.get(i).getPreco());
	                                    } 
	                                }
	                                break;
	                                
	                            case 6:
	                                // Cadastrar novo produto
	                                System.out.println("Informe o nome do produto: ");
	                                String nomeProduto2 = sc.nextLine();
	                                System.out.println("Informe o preço do produto:");
	                                double precoproduto = sc.nextDouble();
	                                System.out.println(" Informe a quantidade dos produtos:");
	                                int quantproduto = sc.nextInt();
	                                sc.nextLine();

	                                produtos.add(new Produtos(nomeProduto2, precoproduto, quantproduto));

	                                break;
	                            case 7:
	                                // Atualizar estoque de algum produto
	                                System.out.println("Informe o produto: ");
	                                String nomepd3 = sc.nextLine();
	                                for(int i=0;i<produtos.size();i++){
	                                    if(produtos.get(i).getNomeDoProduto().equals(nomepd3)){
	                                        System.out.println("Informe a nova quantidade a ser somada com a anterior:");
	                                        int nQuant = sc.nextInt();
	                                        sc.nextLine();
	                                        ((Produtos) produtos.get(i)).setQuantidade(produtos.get(i).getQuantidade()+ nQuant);
	                                    }
	                                }
	                                break;
	                        }
	                    }
	                    else
	                        // SAIR
	                        opt = 0;
	         
	                }while(opt!=0);

	                // Fechando o scanner
	                try{
	                    sc.close();
	                }catch (Exception e){
	                    e.printStackTrace();
	                }

	            }
	}


