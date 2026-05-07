/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

/**
 *
 * @author fesil
 */
 class Circulo extends Forma {
    private double raio;
    
    public Circulo (double raio){
    this.raio = raio;
    }
    
    @Override
    public double calcularArea(){
    return 3.14*raio*raio;
    }
}
