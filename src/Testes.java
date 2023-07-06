import SistemaRegistroVendas.*;

import java.util.Scanner;

public class Testes {
    public static void main(String[] args) {

        Scanner entrada_do_usuario = new Scanner(System.in);

        System.out.println("BEM-VINDO(A) AO SISTEMA DE REGISTRO DE VENDAS DO LOJAS ZUP!!!");
        System.out.println("...........................");

        Cadastro cadastro = new Cadastro();
        Cliente cliente = new Cliente();
        RegistroCompras registroCompras = new RegistroCompras();
        Vendedor vendedor = new Vendedor();
        RegistroVendas registroVendas = new RegistroVendas();
        Vendas vendas = new Vendas();
        Controle controle = new Controle();

        System.out.println("Podemos começar? ");
        System.out.println(" 'Digite S para sim e N para n' ");

        String resp = entrada_do_usuario.next();

        if (resp.equalsIgnoreCase("n")){
            System.out.println("Quem está perdendo é você! Tenha um bom dia");
        } else if (resp.equalsIgnoreCase("s")) {
            System.out.println("Ecxelente!");
            boolean inicio = true;

            while (inicio){

                controle.comandos();
                int num = entrada_do_usuario.nextInt();

                if (num == 1){
                    System.out.println("Digite o nome do cliente:");
                    String nomeC = entrada_do_usuario.nextLine();

                    System.out.println("Digite a idade do cliente:");
                    String idadeC = entrada_do_usuario.next();

                    System.out.println("Digite o cpf do cliente:");
                    String cpfC = entrada_do_usuario.next();

                    System.out.println("Digita o email do cliente:");
                    String emailC = entrada_do_usuario.next();

                    if (cliente.emailArroba(emailC)){
                        cliente.cadastrarNomeCliente(nomeC);
                        cliente.cadastrarCpfCliente(cpfC);
                        cliente.cadastrarEmailCliente(emailC);

                        System.out.println("SistemaRegistroVendas.Cliente cadastrado com sucesso!");
                    } else {
                        System.out.println("Email invalido. Não foi possivel cadastrar o cliente");
                    }
                    if (num == 2){
                        System.out.println("Digite o nome do vendedor:");
                        String nomeV = entrada_do_usuario.nextLine();

                        System.out.println("Digite a idade do vendedor:");
                        String idadeV = entrada_do_usuario.next();

                        System.out.println("Digite o cpf do vendedor:");
                        String cpfV = entrada_do_usuario.next();

                        System.out.println("Digita o email do vendedor:");
                        String emailV = entrada_do_usuario.next();

                        if (cliente.emailArroba(emailV)){
                            cliente.cadastrarNomeCliente(nomeV);
                            cliente.cadastrarCpfCliente(cpfV);
                            cliente.cadastrarEmailCliente(emailV);

                            System.out.println("SistemaRegistroVendas.Vendedor cadastrado com sucesso!");
                        } else {
                            System.out.println("Email invalido. Não foi possivel cadastrar o vendedor");
                        }
                    }

                    if (num == 3){
                        System.out.println("Digite o nome do vendedor responsavel:");
                        String nomeVr = entrada_do_usuario.nextLine();
                        boolean vendedorCadastrado = vendedor.comprovarVendedor(nomeVr);
                        if (vendedorCadastrado){
                            System.out.println("SistemaRegistroVendas.Vendedor encontrado no banco de dados");
                        } else {
                            System.out.println("Não foi possível localizar esse vendedor no banco de dados");
                            break;
                        }

                    }

                    if (num == 4){
                        System.out.println("CLIENTES CADASTRADOS: ");
                        cliente.infoClientes();
                    }

                    if (num == 5){
                        System.out.println("VENDEDORES CADASTRADOS: ");
                        vendedor.infoVendedores();
                    }

                    if (num == 6){
                        vendas.registrarVendas();
                        break;
                    }
                    if (num == 7){
                        System.out.println("Digite o cpf do cliente que deseja procurar:");
                        registroCompras.identificarCompraCpf(entrada_do_usuario.next(), vendas);
                        break;
                    }
                    if (num == 8){
                        System.out.println("Digite o email do vendedor que deseja procurar:");
                        registroVendas.identificarVendaEmail(entrada_do_usuario.next(), vendas);
                        break;
                    }
                    if (num == 9){
                        inicio = false;
                        break;
                    }

                }
            }
        }


    }
}