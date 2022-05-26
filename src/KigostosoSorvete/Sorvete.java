package KigostosoSorvete;

public class Sorvete {

    TipoSorvete tipoSorvete;
    Integer precoUnitario;
    Sabor sabor;
    Integer pesoUnitario;
    Integer quantidadeItens;

    public Sorvete(TipoSorvete tipoSorvete, Integer precoUnitario, Sabor sabor, Integer pesoUnitario, Integer quantidadeItens) {
        this.tipoSorvete = tipoSorvete;
        this.precoUnitario = precoUnitario;
        this.sabor = sabor;
        this.pesoUnitario = pesoUnitario;
        this.quantidadeItens = quantidadeItens;
    }
}
