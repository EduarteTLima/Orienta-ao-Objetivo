/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientadaobjeto;

/**
 *
 * @author eduardo.3946
 */
public class CalculadoraCientifica extends Calculadora {
    public double raizquadrada(double a){
        return Math.sqrt(a);
    }
    
    public double potencia(double a, double b){
        return Math.pow(a, b);
    }
}
