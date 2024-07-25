package santander.dio.Strategy;

public class ComportamentoDefensivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Comportamento defensivo");
    }
}
