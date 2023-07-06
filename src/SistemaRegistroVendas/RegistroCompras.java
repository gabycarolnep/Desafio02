package SistemaRegistroVendas;

import SistemaRegistroVendas.Vendas;

public class RegistroCompras extends Cliente {

    public void identificarCompraCpf(String cpfClientes, Vendas vendas) {

        boolean compraEncontrada = true;
        for (int n = 0; n < cpfClientes.size(); n++) {
            if (cpfClientes.get(n).equalsIgnoreCase(cpfCliente)) {
                System.out.println("compra encontrada!");
                System.out.println("Nome: " + nomeClientes.get(n));
                System.out.println("CPF: " + cpfClientes.get(n));
                System.out.println("Email: " + emailClientes.get(n));

                for (int i = 0; i < vendas.getCliente().size(); i++) {
                    if (vendas.getCliente().get(i).equalsIgnoreCase(nomeClientes.get(i))) {
                        System.out.println("INFORMAÇÕES DA VENDA: ");
                        System.out.println("..........................");
                        System.out.println("SistemaRegistroVendas.Cliente: " + cliente.get(i));
                        System.out.println("SistemaRegistroVendas.Vendedor Responsável: " + vendedorResponsavel.get(i));
                        System.out.println("Valor a pagar: R$ " + valorPagar.get(i));
                        System.out.println("Data da venda: " + dataRegistro.get(i));

                    }
                }
                compraEncontrada = true;
                break;
            } else {
                compraEncontrada = false;
            }
        }
        if (compraEncontrada == false) {
            System.out.println("Compra não encontrada!");
                    }
                }
            }