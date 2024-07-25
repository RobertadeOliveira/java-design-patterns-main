import santander.dio.FactoryMethod.Factory;
import santander.dio.FactoryMethod.FactoryProdutoA;
import santander.dio.FactoryMethod.FactoryProdutoB;
import santander.dio.FactoryMethod.Produto;
import santander.dio.Observer.Observer;
import santander.dio.Observer.ObserverConcretoA;
import santander.dio.Observer.ObserverConcretoB;
import santander.dio.Observer.Sujeito;
import santander.dio.Singleton.SingletonEager;
import santander.dio.Singleton.SingletonLazy;
import santander.dio.Singleton.SingletonLazyHolder;
import santander.dio.Strategy.*;
import santander.dio.Facade.Facade;

public class Main {
    public static void main(String[] args) {

        //Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //Strategy

        Produto produtoB = getProduto();
        produtoB.criar();


        //Observer
        Sujeito sujeito = new Sujeito();

        // Crie instâncias dos observadores
        Observer observadorA = new ObserverConcretoA();
        Observer observadorB = new ObserverConcretoB();

        // Registre os observadores no sujeito
        sujeito.adicionarObservador(observadorA);
        sujeito.adicionarObservador(observadorB);

        // Notifique os observadores com uma mensagem
        sujeito.notificarObservadores("Uma mensagem importante foi recebida!");

        // Remova um observador (opcional)
        sujeito.removerObservador(observadorA);

        // Notifique novamente após remover o observador
        sujeito.notificarObservadores("Outra mensagem importante foi recebida!");


    }

    private static Produto getProduto() {
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();
        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();


        //Facade

        Facade facade = new Facade();
        facade.migrarCliente("Aleatório", "77215365");

        //FactoryMethod

        Factory factoryA = new FactoryProdutoA();
        Produto produtoA = factoryA.criarProduto();
        produtoA.criar();

        Factory factoryB = new FactoryProdutoB();
        return factoryB.criarProduto();
    }
}