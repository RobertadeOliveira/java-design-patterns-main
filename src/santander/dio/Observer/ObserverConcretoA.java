package santander.dio.Observer;

public class ObserverConcretoA implements Observer{
    @Override
    public void notificar(String mensagem) {
        System.out.println("Sujeito A recebeu a mensagem: " + mensagem);
    }
}
