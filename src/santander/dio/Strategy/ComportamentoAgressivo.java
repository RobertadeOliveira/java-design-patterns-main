package santander.dio.Strategy;

public class ComportamentoAgressivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Comportamento agressivo");
    }
}
