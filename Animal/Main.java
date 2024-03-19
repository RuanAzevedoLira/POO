package Animal;
public class Main {
    public static void main(String[] args) {
        // carro c1 = new carro();
        // c1.nome = "Honda Civic";
        // c1.cor = "Preto";
        // c1.valor = 200000;

        // carro c1 = new carro("Honda Civic", "Preto", 120000);
        // System.out.println("Modelo: " + c1.nome + "\n");

        // carro c2 = new carro("UNO", "Cinza", 84.990);
        // System.out.println("Modelo: " + c2.nome +
        // "\nCor: " + c2.cor +
        // "\nValor: " + c2.valor);

        // carro c3 = new carro ("Gol", "Branco", 75.490);
        // System.out.println("\nModelo: " + c3.nome +
        // "\nCor: " + c3.cor +
        // "\nValor: " + c3.valor);

        // carro c4 =  new carro ("Palio", "Prata");
        // System.out.println("\nModelo: " + c4.nome +
        // "\nCor: " + c4.cor);

        

        Animal a1 = new Animal("GATO", "Mil", 3);

        // a1.nome = "Bill";
        // System.out.println(a1.nome);

        System.out.println(a1.getNome());

        System.out.println(a1.getQdePatas());

        a1.setNome("Charlotte");

        a1.setQdePatas(4);

        System.out.println(a1.getNome());

        System.out.println(a1.getQdePatas());
    }
}
