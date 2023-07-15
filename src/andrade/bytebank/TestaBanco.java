package andrade.bytebank;

public class TestaBanco {
    public static void main(String[] args) {
        
        Cliente paulo =  new Cliente();
        paulo.nome = "Paulo Silveira";
        paulo.cpf = "525.846.910-53";
        paulo.profissao = "Programador";

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.desposita(1000);

        contaDoPaulo.titular = paulo;
        System.out.println(contaDoPaulo.titular.nome);
    }
}
