package Cliente;

public class Cliente {
    private int id;
    private String nome;
    private Conta conta;

    public Cliente(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public Cliente(){}

    // getters

    public int getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    // setters

    public void  setId (int id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }


    //
    public boolean abrirConta(){
        if (conta == null) {
            Conta c1 = new Conta(123, 0, this);
        this.conta = c1;
        return true;
        }
        return false;
    }
}
