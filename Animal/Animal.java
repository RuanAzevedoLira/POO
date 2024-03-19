package Animal;
public class Animal{
    private String especie;
    private String  nome;
    private int qdePatas;

    public Animal(String especie, String nome, int qdePatas){
        this.especie = especie;
        this.nome = nome;
        this.qdePatas = qdePatas;
    }

    public Animal(){}

    public String getEspecie(){
        return this.especie;
    }
    public String getNome(){
        return this.nome;
    }
    public int getQdePatas(){
        return this.qdePatas;
    }


    public void setEspecie(String especie){
        this.especie = especie;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setQdePatas(int qdePatas){
        this.qdePatas = qdePatas;
    }

    
}