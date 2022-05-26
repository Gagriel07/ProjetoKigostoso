package KigostosoMaquinas;

public class MaquinasProducao {

    private Integer custoDoSetup;
    private Integer custoFabricacaoPorHora;
    private Integer quantidadeDeItensPorcHora;

    public MaquinasProducao(Integer custoDoSetup, Integer custoFabricacaoPorHora, Integer quantidadeDeItensPorcHora) {
        this.custoDoSetup = custoDoSetup;
        this.custoFabricacaoPorHora = custoFabricacaoPorHora;
        this.quantidadeDeItensPorcHora = quantidadeDeItensPorcHora;
    }
}
