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
       Funcionario Gerente = new Gerente(8700.00, 500.00);
       Funcionario Vendedor = new Vendedor (2300.00, 2000.00);
        
        System.out.println(Gerente.calcularSalario());
        System.out.println(Vendedor.calcularSalario());
    }
    
}
