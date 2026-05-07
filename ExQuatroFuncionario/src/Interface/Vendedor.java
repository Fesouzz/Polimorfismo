/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author fesil
 */
public class Vendedor implements Funcionario{
    private double salario;
    private double comissao;
    
    public Vendedor(double salario, double comissao) {
        this.salario = salario;
        this.comissao = comissao;
    }
    
    @Override
    public double CalcularSalario(){
    return salario + comissao;
    }
}

