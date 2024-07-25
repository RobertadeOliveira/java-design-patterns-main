package santander.dio.Strategy;

public class ComportamentoNormal implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Comportamento normal");
    }
}
