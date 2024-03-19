import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        CadastroCarro cadastro = new CadastroCarro();

        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();

        while (true==true){
            System.out.println("Menu de Cadastro de carros");
            System.out.println("1 - Cadastro Carro");
            System.out.println("2 - Consulta Carro");
            System.out.println("3 - Remover Carro");
            System.out.println("4 - Lista de Carros");
            System.out.println("5 - Sair");

            switch (opcao) {
                case 1:
                System.out.println("Digite os dados do carro:");
                System.out.println("Marca: ");
                String marca = sc.next();

                System.out.println("Modelo: ");
                String modelo = sc.next();

                System.out.println("Ano: ");
                int ano = sc.nextInt();

                System.out.println("Cor: ");
                String cor = sc.next();

                System.out.println("Placa: ");
                String placa = sc.next();

                Carro c = new Carro(modelo,marca,placa,ano, cor);
                cadastro.inserir(c);


                break;

                case 2:
                System.out.println("Digite uma placa para remoção");
                String placaConsulta =sc.next();
                Carro carroConsulta = cadastro.consultarCarro(placaConsulta);

                if (carroConsulta == null) {
                    System.out.println("Carro não encontrado");
                } else {
                    carroConsulta.exibir();
                }
                    break;

                case 3:
                System.out.println("Digite uma placa para remoção");
                String placaRemover = sc.next();
                boolean retornoRemover = cadastro.removerCarro(placaRemover);
                if(retornoRemover == true){
                    System.out.println("Carro removido com sucesso: ");
                } else {
                    System.out.println("Carro não encontrado:");
                }
                break;

                case 4:
                System.out.println("Lista de Carros: ");
                cadastro.listarCarros();
                break;

                case 5:
                System.out.println();
                break;

                default:
                System.out.println("Opção inválida");
                break;
            }
        }
    }
}
