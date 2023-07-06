package SistemaRegistroVendas;

import SistemaRegistroVendas.Cadastro;
import SistemaRegistroVendas.Vendas;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Cadastro {

    Vendas vendas = new Vendas();

    private List<String> clientesCadastrados = new ArrayList<>();
    private List<String> nomeClientes = new ArrayList<>();
    private List<String> cpfClientes = new ArrayList<>();
    private List<String> emailClientes = new ArrayList<>();

    public List<String> getNomeClientes() {
        return nomeClientes;
    }

    public void setNomeClientes(List<String> nomeClientes) {
        this.nomeClientes = nomeClientes;
    }

    public List<String> getCpfClientes() {
        return cpfClientes;
    }

    public void setCpfClientes(List<String> cpfClientes) {
        this.cpfClientes = cpfClientes;
    }

    public List<String> getEmailClientes() {
        return emailClientes;
    }

    public void setEmailClientes(List<String> emailClientes) {
        this.emailClientes = emailClientes;
    }

    public void cadastrarEmailCliente(String emailCliente) {
        emailClientes.add(emailCliente);
    }

    public void cadastrarCpfCliente(String cpfCliente) {
        cpfClientes.add(cpfCliente);
    }

    public void cadastrarNomeCliente(String nomeCliente) {
        nomeClientes.add(nomeCliente);
    }

    public boolean emailArroba(String emailCliente) {
        return emailCliente.contains("@");
    }

    public boolean comprovarCliente(String nomeCliente) {
        for (String nome : nomeClientes) {
            if (nome.equalsIgnoreCase(nomeCliente)) {
                return true;
            }
        }
        return false;
    }

    public void infoClientes() {

        for (int i = 0; i < nomeClientes.size(); i++) {
            System.out.println("Nome: " + nomeClientes.get(i));
            System.out.println("CPF: " + cpfClientes.get(i));
            System.out.println("Email: " + emailClientes.get(i));

        }
    }
}