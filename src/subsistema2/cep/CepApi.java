package subsistema2.cep;

public class CepApi {
    private static final CepApi instancia = new CepApi();
    private CepApi(){
        super();
    }
    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Brasília";
    }

    public String recuperarEstado(String cep) {
        return cep;
    }
}
