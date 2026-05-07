/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author fesil
 */
public class Teste {
    
    public static void main(String[] args) {
    Forma Circulo = new Circulo(8);
    Forma Retangulo = new Retangulo(9,4);
       
    System.out.println(Circulo.calcularArea());
    System.out.println(Retangulo.calcularArea());
}
}