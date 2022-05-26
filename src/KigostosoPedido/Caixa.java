package KigostosoPedido;

public enum Caixa {

    P("P"),
    M("M"),
    G("G");

    private String tamanho;
    Caixa(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return this.tamanho;
    }
}
