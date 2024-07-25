package subsistema1.crm;

public class CrmService {

    public static void gravarCliente(String nome, String cep, String estado, String cidade){
        // Lógica de persistência no CRM aqui
        // Por exemplo:
        // Cliente cliente = new Cliente(nome, cep, estado, cidade);
        // Database.save(cliente);

        System.out.println("Cliente " + nome + " salvo no sistema CRM");
    }
}