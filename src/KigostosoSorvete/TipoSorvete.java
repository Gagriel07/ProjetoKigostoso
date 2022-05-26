package KigostosoSorvete;

public enum TipoSorvete {

    Pote("POTE"),
    Picole("PICOLE");

    private String tipoSorvete;
    TipoSorvete(String tipoSorvete) {
        this.tipoSorvete = tipoSorvete;
    }

    public String getTipoSorvete() {
        return this.tipoSorvete;
    }
}
