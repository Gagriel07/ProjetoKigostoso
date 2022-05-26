package KigostosoPedido;

import KigostosoCliente.Cliente;
import KigostosoSorvete.Sorvete;
import KigostosoOrdemDeFabricacao.OrdemDeFabricacao;

import java.util.LinkedList;
import java.util.List;

public class Pedido {

    private Caixa caixa;
    private Cliente cliente;
    private List<Sorvete> sorvetes = new LinkedList<Sorvete>();
    private OrdemDeFabricacao ordemDeFabricacaoFab;

    public Pedido(Caixa caixa, Cliente cliente) {
        this.caixa = caixa;
        setCliente(cliente);
    }

    public void addSorvete(Sorvete sorvete) {
        sorvetes.add(sorvete);
    }

    private void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
