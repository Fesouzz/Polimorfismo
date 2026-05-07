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
        Funcionario Gerente = new Gerente(8700.00, 500.00);
        Funcionario Vendedor = new Vendedor (2300.00, 2000.00);
        
        Gerente.CalcularSalario();
        Vendedor.CalcularSalario();
    }
}
