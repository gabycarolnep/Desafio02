package SistemaRegistroVendas;

import SistemaRegistroVendas.Cadastro;
import SistemaRegistroVendas.Vendas;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Cadastro {

    Vendas vendas = new Vendas();

    private List <String> vendedoresCadastrados = new ArrayList<>();
    private List<String> nomeVendedores = new ArrayList<>();
    private List<String> cpfVendedores = new ArrayList<>();
    private List<String> emailVendedores = new ArrayList<>();

    public void cadastrarEmailVendedor(String emailVendedor) {
        emailVendedores.add(emailVendedor);
    }

    public void cadastrarCpfVendedor(String cpfVendedor) {
        cpfVendedores.add(cpfVendedor);
    }

    public void cadastrarNomeVendedor(String nomeVendedor) {
        nomeVendedores.add(nomeVendedor);
    }

    public boolean emailArroba(String emailCliente) {
        return emailCliente.contains("@");
    }

    public boolean comprovarVendedor(String nomeVendedor) {
        for (String nome : nomeVendedores) {
            if (nome.equalsIgnoreCase(nomeVendedor)) {
                return true;
            }
        }
        return false;
    }

    public void infoVendedores() {

        for (int i = 0; i < nomeVendedores.size(); i++) {
            System.out.println("Nome: " + nomeVendedores.get(i));
            System.out.println("CPF: " + cpfVendedores.get(i));
            System.out.println("Email: " + emailVendedores.get(i));

        }
    }
}
