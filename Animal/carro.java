package Animal;
public class carro {

    String nome;
    String  cor;
    double valor;

    //Construtor

     carro (String nome, String cor, double valor){
        this.nome = nome;
        this.cor = cor;
        this.valor = valor;
    }

    carro (String nome, String cor){
        this.nome = nome;
        this.cor = cor;
    }
}