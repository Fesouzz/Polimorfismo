/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Abstract;

/**
 *
 * @author fesil
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InstrumentoMusical Guitarra = new Guitarra();
        InstrumentoMusical Piano = new Piano();
        
        Guitarra.tocar();
        Piano.tocar();
    }
    
}
