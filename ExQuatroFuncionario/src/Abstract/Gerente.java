/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

/**
 *
 * @author fesil
 */
public class Gerente extends Funcionario {
    private double salario;
    private double descontos;

    public Gerente(double salario, double descontos) {
        this.salario = salario;
        this.descontos = descontos;
    }
    
    @Override
    public double calcularSalario(){
    return salario - descontos;
    }
}
