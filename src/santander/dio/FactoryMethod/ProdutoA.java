package santander.dio.FactoryMethod;

public class ProdutoA implements Produto{
    @Override
    public void criar() {
        System.out.println("Produto A criado");
    }
}
