/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author fesil
 */
public class Gerente implements Funcionario {
    private double salario;
    private double descontos;

    public Gerente(double salario, double descontos) {
        this.salario = salario;
        this.descontos = descontos;
    }
    
    @Override
    public double CalcularSalario(){
    return salario - descontos;
    }
}

