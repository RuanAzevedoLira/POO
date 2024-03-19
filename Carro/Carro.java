public class Carro {
   private String modelo;
   private String marca;
   private String placa;
   private double anoLancamento;
   private String cor;
   private double velAtual;

   public Carro (String modelo,String marca,String placa,double anoLancamento,String cor){
    this.modelo = modelo;
    this.marca = marca;
    this.placa = placa;
    this.anoLancamento = anoLancamento;
    this.cor = cor;
   }

   public Carro(){}

   public void exibir (){
      System.out.println("Marca: " + this.marca + "/nModelo: " + this.modelo + "/nPlaca: " + this.placa
      + "/nAno de Lançamento: " + this.anoLancamento + "/nCor: " + this.cor);
   }


   public void acelerar (){
      velAtual += 20;
   }

   public void frear (){
      velAtual -= 20;
   }

   // getters

   public String getModelo(){
      return this.modelo;
   }

   public String getMarca(){
      return this.marca;
   }

   public String getPlaca(){
      return this.placa;
   }

   public double getAnoLancamento(){
      return this.anoLancamento;
   }

   public String getCor(){
      return this.cor;
   }

   public double getVelAtual(){
      return this.velAtual;
   }

   // setters

   public void setModelo(String modelo){
      this.modelo = modelo;
   }

   public void setMarca(String marca){
      this.marca = marca;
   }

   public void setAnoLancamento(double anoLancamento){
      this.anoLancamento = anoLancamento;
   }

   public void setCor(String cor){
      this.cor = cor;
   }

   public void setVelAtual(double velAtual){
      this.velAtual = velAtual;
   }

}
