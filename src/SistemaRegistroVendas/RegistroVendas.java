package SistemaRegistroVendas;

import SistemaRegistroVendas.Vendas;

public class RegistroVendas extends Cliente {

    public void identificarVendaEmail(String emailVendendores, Vendas vendas) {

        boolean vendaEncontrada = true;
        for (int n = 0; n < emailVendendores.size(); n++) {
            if (emailVendendores.get(n).equalsIgnoreCase(emailVendendores)) {
                System.out.println("Venda encontrada!");
                System.out.println("Nome: " + nomeVendedores.get(n));
                System.out.println("CPF: " + cpfVendedores.get(n));
                System.out.println("Email: " + emailVendedores.get(n));

                for (int i = 0; i < vendas.getCliente().size(); i++) {
                    if (vendas.getVendedorResponsavel().get(i).equalsIgnoreCase(nomeVendedor.get(i))) {
                        System.out.println("INFORMAÇÕES DA VENDA: ");
                        System.out.println("..........................");
                        System.out.println("SistemaRegistroVendas.Cliente: " + cliente.get(i));
                        System.out.println("SistemaRegistroVendas.Vendedor Responsável: " + vendedorResponsavel.get(i));
                        System.out.println("Valor a pagar: R$ " + valorPagar.get(i));
                        System.out.println("Data da venda: " + dataRegistro.get(i));

                    }
                }
                vendaEncontrada = true;
                break;
            } else {
                vendaEncontrada = false;
            }
        }
        if (vendaEncontrada == false) {
            System.out.println("Venda não encontrado!");
                    }
                }
            }

