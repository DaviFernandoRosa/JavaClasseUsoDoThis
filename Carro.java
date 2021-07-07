/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package genciacarro;

/**
 *
 * @author Davi
 */
public class Carro {
     
     String marca;
      String modelo;
      int numPassageiros;
      double capCombustivel;
      double consumoCombustivel;


public carro(String marca, String modelo, int numPassageiros
             double capCombustivel, double consumoCombustivel){
          this.marca = marca;
          this.modelo = modelo;
          this.numPassageiros = numPassageiros;
          this.capCombustivel = capCombustivel;
          this.consumoCombustivel = consumoCombustivel;
}

carro(){

     }

public Carro(String marca, String modelo, int numPassageiros){
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando o construtor com 3 parâmetros");
}

public Carro(String marca, String modelo,){
        this("Fiat", "Ducato", 10);
        System.out.println("Chamando o construtor com 2 parâmetros");
        
        
}

 void exibirAutonomia(){
  System.out.println("A autonomia do carro é: "+ this.capCombustivel * this.consumoCombustivel);
}

 double obterAutonomia(){
  System.out.println("Método obterAutonomia foi chamado.");
  
  return capCombustivel * consumoCombustivel;
}
//Método com parametro
 double calcularCombustivel (double km){
    double qtdCombustivel = km/consumoCombustivel;
    return qtdCombustivel;
}



}
