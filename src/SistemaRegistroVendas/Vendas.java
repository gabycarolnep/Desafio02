package SistemaRegistroVendas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Vendas {

    private List<String> cliente = new ArrayList<>();
    private List<String> vendedorResponsavel = new ArrayList<>();
    private List<BigDecimal> valorPagar = new ArrayList<>();
    private List<String> dataRegistro = new ArrayList<>();


    public List<String> getCliente() {
        return cliente;
    }

    public void setCliente(List<String> cliente) {
        this.cliente = cliente;
    }

    public List<String> getVendedorResponsavel() {
        return vendedorResponsavel;
    }

    public void setVendedorResponsavel(List<String> vendedorResponsavel) {
        this.vendedorResponsavel = vendedorResponsavel;
    }

    public void setValorPagar(List<BigDecimal> valorPagar) {
        this.valorPagar = valorPagar;
    }

    public List<BigDecimal> getValorPagar() {
        return valorPagar;
    }

    public void setDataRegistro(List<String> dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public List<String> getDataRegistro() {
        return dataRegistro;
    }

    public void listarVendas() {

        for (int n = 0; n < vendedorResponsavel.size(); n++) {
            System.out.println("INFORMAÇÕES DA VENDA: ");
            System.out.println("..........................");
            System.out.println("SistemaRegistroVendas.Cliente: " + cliente.get(n));
            System.out.println("SistemaRegistroVendas.Vendedor Responsável: " + vendedorResponsavel.get(n));
            System.out.println("Valor a pagar: R$ " + valorPagar.get(n));
            System.out.println("Data da venda: " + dataRegistro.get(n));
        }

    }

    public void registrarVendas(String cliente, String vendedor, BigDecimal valor, String data) {

        this.cliente.add(cliente);
        this.vendedorResponsavel.add(vendedor);
        this.valorPagar.add(valor);
        this.dataRegistro.add(data);

        System.out.println("INFORMAÇÕES DA VENDA: ");
        System.out.println("..........................");
        System.out.println("SistemaRegistroVendas.Cliente: " + cliente);
        System.out.println("SistemaRegistroVendas.Vendedor Responsável: " + vendedor);
        System.out.println("Valor a pagar: R$ " + valor);
        System.out.println("Data da venda: " + data);

    }
}
