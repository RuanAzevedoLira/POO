package Cliente;

public class Conta {
    private int id;
    private double saldo;
    private Cliente cliente;

    public Conta(int id, double saldo, Cliente cliente){
        this.id = id;
        this.saldo = saldo;
        this.cliente =cliente;
    }

    public Conta(){}

    // getters

    public int getId(){
        return this.id;
    }

    public double getSaldo(){
        return this.saldo;
    }

    //setters

    public void setId(int id){
        this.id = id;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}
