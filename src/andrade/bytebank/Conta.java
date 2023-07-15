package andrade.bytebank;

public class Conta {

    public double saldo;
    public int agencia, numero;
    public Cliente titular;

    public void desposita(double valor){
        this.saldo += valor;
    }
    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if (this.saldo >= valor){
            this.saldo -= valor;
            destino.desposita(valor);
            return true;
        }
        return false;
    }
}
