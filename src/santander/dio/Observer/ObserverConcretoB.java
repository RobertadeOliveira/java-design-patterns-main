package santander.dio.Observer;

public class ObserverConcretoB implements Observer{
    @Override
    public void notificar(String mensagem) {
        System.out.println("Sujeito B recebeu a mensagem: " + mensagem);
    }
}
